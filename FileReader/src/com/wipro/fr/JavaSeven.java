package com.wipro.fr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//File handling in java 7 and further

public class JavaSeven {

	public static void main(String[] args) {
		File file = new File("Out.txt");
		try (FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);){
			
			String str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
