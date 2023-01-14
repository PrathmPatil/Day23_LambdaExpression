package com.lamdaexpression;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	void firstName() {
		{
			FunctionalInterface fi=(fname) -> {
				boolean fName=Pattern.matches("^[A-Z]{1}[a-z]{2}+$", fname);
				if(fName==true)
				System.out.println("Enterd Name " +fname+" are valid.");
				else
				System.out.println("Enterd Name " +fname+" are not valid.");
			};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Name");
			String firstName=sc.nextLine();
			fi.info(firstName);
			}
	}
	void lastName()
	{
		
			FunctionalInterface fi=(lname) -> {
				boolean lName=Pattern.matches("^[A-Z]{1}[a-z]{2}+$", lname);
				if(lName==true)
				System.out.println("Enterd Name " +lname+" are valid.");
				else
				System.out.println("Enterd Name " +lname+" are not valid.");
			};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Lirst Name");
			String lirstName=sc.nextLine();
			fi.info(lirstName);
			
	}
	void gmail()
	{
		
			FunctionalInterface fi=(gmail) -> {
				boolean uGmail=Pattern.matches("^abc.[a-zA-Z0-9]+@bl.co.[a-zA-Z0-9]+$", gmail);
				if(uGmail==true)
				System.out.println("Enterd gmail " +gmail+" are valid.");
				else
				System.out.println("Enterd gmail " +gmail+" are not valid.");
			};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter User Gamil");
			String gmail=sc.nextLine();
			fi.info(gmail);
			
	}

	public static void main(String[] args) {
		Main main=new Main();
//		main.firstName();
//      main.lastName();
		main.gmail();
		

		}
	  
	}


