package com.bl.lineprogram;

import java.util.Scanner;

public class LineComputationUC4 {	
	static double ax1 = 0,ax2 = 0,ay1 = 0,ay2 = 0,bx1 = 0,by1 = 0,bx2 = 0,by2 = 0;
	double lengthofline1;		//defined instance variables
	double lengthofline2;		//Refactored the UC3 into methods for calculating lengths,checking for equal,  checking for difference in length. 
									
	public static void main(String[] args) {	
		LineComputationUC4 lineobj = new LineComputationUC4();
		lineobj.computelength(ax1,ax2,ay1,ay2,bx1,by1,bx2,by2);
	}
	
	public double computelength(double ax1,double ax2,double ay1,double ay2,double bx1,double by1,double bx2,double by2) {				
		System.out.println("Welcome to Line Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinate of first point of the First line");
		 ax1 = sc.nextDouble();
		System.out.println("Enter the y coordinate of first point of the First line");
		 ay1 = sc.nextDouble();
		System.out.println("Enter the x coordinate of second point of the First line");
		 ax2 = sc.nextDouble();
		System.out.println("Enter the y coordinate of second point of the First line");
		 ay2 = sc.nextDouble();
		
		System.out.println("Enter the x coordinate of first point of the second line");
		 bx1 = sc.nextDouble();
		System.out.println("Enter the y coordinate of first point of the second line");
		 by1 = sc.nextDouble();
		System.out.println("Enter the x coordinate of second point of the second line");
		 bx2 = sc.nextDouble();
		System.out.println("Enter the y coordinate of second point of the second line");
		 by2 = sc.nextDouble();
		sc.close();
		lengthofline1 =(Math.floor(Math.sqrt(((ax2-ax1)*(ax2-ax1))+((ay2-ay1)*(ay2-ay1)))));
		lengthofline2 =(Math.floor(Math.sqrt(((bx2-bx1)*(bx2-bx1))+((by2-by1)*(by2-by1)))));
		System.out.println("Length of the first line is :" + lengthofline1);
		System.out.println();
		System.out.println("Length of the second line is :" + lengthofline2);
		System.out.println();
		return compareLinesequals(lengthofline1,lengthofline2 );
	}
	
	public double compareLinesequals(double lengthofline1,double lengthofline2 ) {
		String LengthoFline1 =String.valueOf(lengthofline1);
		String LengthoFline2 =String.valueOf(lengthofline2);
		if(LengthoFline1.equals(LengthoFline2)==true) {
			System.out.println("Lines are equal");
		}else {
		System.out.println("Lines are not equal");
		
		}
		return compareLineLength(LengthoFline1,LengthoFline2 );
	}
	
	public double compareLineLength(String LengthoFline1,String LengthoFline2 ) {
		double difference = 0;
		if(LengthoFline1.compareTo(LengthoFline2)== 1) {
			 difference= (Double.valueOf(LengthoFline1))- (Double.valueOf(LengthoFline2));
			 System.out.println("Line 1 is longer than line 2 by " + difference);
		} else if(LengthoFline1.compareTo(LengthoFline2)==0) {
			System.out.println();
		} else  {
			difference= (Double.valueOf(LengthoFline2))- (Double.valueOf(LengthoFline1));
			System.out.println("Line 2 is longer than line 1 by " + difference);
		}
		return 0;
	}
}
		
		
	
