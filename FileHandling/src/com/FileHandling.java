package com;
import java.util.Scanner;
public class FileHandling {
	public static void main(String args[])  {
		Scanner sc=new Scanner(System.in);
		String fileName ="";
		FileOperations op = new FileOperations();
        System.out.println("------FILE HANDLING IN JAVA--------");
        while(true) {
		        System.out.println("Choose your Option");
		        System.out.println("Enter 'C' for Creat a File");
		        System.out.println("Enter 'W' for Write into File");
		        System.out.println("Enter 'R' for Read from File");
		        System.out.println("Enter 'A' for Append content to  File");
		        System.out.println("Enter 'D' for Delete a  File");
		        System.out.println("Enter 'N' for Rename a  File");
		        System.out.println("Enter 'X' for Quit");
		        String option = sc.nextLine().trim();
		        
		        switch(option)
		        {
		          case "C" :
		        	  System.out.println("Enter New File Name :");
		        	  fileName = sc.nextLine();
		        	  op.createFile(fileName);
		        	  break;
		          case "W" :
		        	  System.out.println("Enter  File Name to write :");
		        	  fileName = sc.nextLine();
		        	  op.writeToFile(fileName);
		        	  break;
		          case "R" :
		        	  System.out.println("Enter File Name for read :");
		        	  fileName = sc.nextLine();
		        	  op.readFromFile(fileName);
		        	  break;
		          case "A" :
		        	  System.out.println("Enter File Name for append content :");
		        	  fileName = sc.nextLine();
		        	  op.appendToFile(fileName);
		        	  break;
		          case "D" :
		        	  System.out.println("Enter File Name for delete :");
		        	  fileName = sc.nextLine();
		        	  
		        	  op.deleteFile(fileName);
		        	  break;
		          case "N" :
		        	  System.out.println("Enter  Old File Name  :");
		        	  String OldfileName = sc.nextLine();
		        	  System.out.println("Enter  New File Name  :");
		        	  String NewfileName = sc.nextLine();
		        	  op.renameFile(OldfileName,NewfileName);
		        	  break;
		          case "X" :
		        	  System.out.println("Thank you for using this Application!!! Application exit successfully!");
		        	  System.exit(0);
		        	  break;
		          default :
		        	  System.out.println("Invalid file Option choosen ! try again !!! ");
		        }
		        System.out.println("Do you want to continue(Y/N) ?");
		        if(sc.nextLine().equalsIgnoreCase("N"))
		        {
		        	System.out.println("Thank you for using this Application!!! Application closed successfully!");
		            break;
		        }
        }
        sc.close();
        
	}
}
	