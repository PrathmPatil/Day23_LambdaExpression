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
	void phoneNumber()
	{
		
			FunctionalInterface fi=(phoneNumber) -> {
				boolean uphoneNumber=Pattern.matches("^[+]?{1}[0-9]{2}[\\s]?{1}[7-9]{1}[0-9]{9}$", phoneNumber);
				if(uphoneNumber==true)
				System.out.println("Enterd phoneNumber " +phoneNumber+" are valid.");
				else
				System.out.println("Enterd phoneNumber " +phoneNumber+" are not valid.");
			};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter User phone number: ");
			String phoneNumber=sc.nextLine();
			fi.info(phoneNumber);
			
	}
	void passWord()
	{
		FunctionalInterface fi=(passward) -> {
			boolean upassward=Pattern.matches("^[A-za-z0-99@#$%*]{8,}$", passward);
			if(upassward==true)
			System.out.println("Enterd passward " +passward+" are valid.");
			else
			System.out.println("Enterd passward " +passward+" are not valid.");
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User passward: ");
		String passward=sc.nextLine();
		fi.info(passward);
		
		
	}
	

	public static void main(String[] args) {
		Main main=new Main();
//		main.firstName();
//      main.lastName();
//		main.gmail();
//		main.phoneNumber();
		main.passWord();
		

		}
	  
	}


