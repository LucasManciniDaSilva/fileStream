package fileScanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("Enter a folder path: ");
		String strPath2 = sc.nextLine();
		File path2 = new File(strPath2);
		
		File[] files = path2.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath2 + "/SubDir").mkdir();
		System.out.println("Diretory created successfully: " +success);
		
		
		sc.close();
		
		
		
		
	}

}
