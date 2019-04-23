package fileScanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Created a list
		List<Product> list = new ArrayList<>();
		
		//Interaction with the user 
		System.out.println("Enter a folder path: ");
		String sourcePath = sc.nextLine();
		
		 //Source file defined by the user
	     File sourceFile = new File(sourcePath);
	     String sourceFolderStr = sourceFile.getParent();
	     
	     //created a new Directory
	     boolean success = new File(sourceFolderStr + "/out").mkdir();
	     
	     //Created a new archive in another Directory
		 String targetPath = sourceFolderStr + "/out/out.csv";
		 
		 //Reading the archive .csv
		 try(BufferedReader br = new BufferedReader(new FileReader(sourcePath))){
			 
			 String itemCvs = br.readLine();
			 while(itemCvs !=null) {
				 
				 //Split the archive .csv
				 String fields[] = itemCvs.split(",");
				 String name = fields[0];
				 double price = Double.parseDouble(fields[1]);
				 int qnt = Integer.parseInt(fields[2]);
				 
				//Created a list with the datas of the archive 
				list.add(new Product(name, price, qnt));
				
				itemCvs = br.readLine();
				}
			 
			 
			 //Writting a new archive .csv
			 try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))){
				 
				 //total of all products in the archive
				 for(Product item : list) {
					 bw.write(item.getName() + "," + item.Total());
					 bw.newLine();
				 }
				 
				 
			 } catch (IOException e) {
					System.out.println("Error writing file: " + e.getMessage());
				}

			} catch (IOException e) {
				System.out.println("Error reading file: " + e.getMessage());
			}
		 
		 sc.close();

	}	
}