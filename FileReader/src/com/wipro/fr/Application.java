package com.wipro.fr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//This all implementation is followed after, before Java 7

public class Application {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		File file = new File("Out.txt");
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
					System.out.println("Closed");
				}
				if (br != null) {
					fr.close();
					System.out.println("Closed");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
