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
		
		
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa Noite"};
		
		String path = "/users/lucasmancini/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
				
			}
			}
		catch(IOException e) {
			System.out.println("Error " +e.getMessage());
		}
	}

}
