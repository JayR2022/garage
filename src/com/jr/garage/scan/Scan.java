package com.jr.garage.scan;

import java.util.Scanner;

public class Scan {
	
	private static Scanner newScan = new Scanner(System.in);
	
	public static void scanClose() {
		newScan.close();
	}
	
	public static void scanString() {
		newScan.toString().toLowerCase();
	}
	
	public static void scanInteger() {
		newScan.nextInt();
	}
	
	public static void scanBoolean() {
		newScan.nextBoolean();
	}

}
