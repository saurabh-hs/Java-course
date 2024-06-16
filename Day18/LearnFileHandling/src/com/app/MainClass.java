package com.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		//Create
		try {
			File fo = new File("demo.txt");
			fo.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//write in the file
		try {
			FileWriter fw = new FileWriter("demo.txt",true);
			fw.write("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।\r\n"
					+ "मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि॥\n");
			fw.write("अभ्युत्थानमधर्मस्य तदात्मानं सृजाम्यहम्");
			fw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//read from file
		try(BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
