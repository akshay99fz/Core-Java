package com.wipro.fp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		try {
			File file = new File("Ou.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
