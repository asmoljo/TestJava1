package com.veretex_service.asmoljo.testjava1;

import java.io.InputStream;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bok");
		
		// TODO: ddadddds
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite umanjenikkkkk.");
		String line = s.nextLine();
		int a = Integer.parseInt(line);
		
		System.out.println("Unesite umanjiteljljljlj.");
		String line2 = s.nextLine();
		
		int b = Integer.parseInt(line2);
		
		while(b > a) {
			System.out.println("Umanjitelj ne moze biti veci od umanjenika!");
			System.out.println("Unesite umanjitelj.");
			line2 = s.nextLine();
		    b = Integer.parseInt(line2);
		}
		
		
		int rez = Math.subtractExact(a, b);
		
		System.out.println("Rezultat je: " + rez);
		
		s.close();
		

	}

}
