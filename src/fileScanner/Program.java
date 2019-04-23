package fileScanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		String path = "/users/lucasmancini/in.txt";
		
		
		try(BufferedReader br = new BufferedReader (new FileReader(path)) ) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				
			}
		}
		
		catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
