package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations implements FileActions {
 
   public void createFile(String filename) 
   {
	     File myFile = new File(filename);
	     try{
	     if(!(myFile.exists())){ // checking file exist or not
	         myFile.createNewFile(); // Creating new file
	         System.out.println("New File created....");
	     }else{
	         System.out.println("File already exisit....");
	     }
	     }catch (IOException e) {
	         e.printStackTrace();
	     }
   }
   public void writeToFile(String filename)
   {
	      String source = "";
	      FileWriter fWrite = null;
	     
	      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	      
	      File myFile = new File(filename);
	      try{
	          if(!(myFile.exists())){
	              myFile.createNewFile();
	          }
	          fWrite = new FileWriter(myFile,false); 

	          System.out.println("Write 'stop' when you finish writing file ");
	          while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
	        	  fWrite.write(source + System.getProperty("line.separator"));
              }
	          System.out.println("File write complete.....");
	          
	      }catch (IOException e) {
	          e.printStackTrace();
	      }finally{
	          if(fWrite != null) 
	              try { fWrite.close(); } catch (IOException e) { e.printStackTrace(); }
	                     
	      }
   }
   public void appendToFile(String filename)
   {
	      String source = "";
	      FileWriter fWrite = null;
	     
	      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	     
	      File myFile = new File(filename);
	      try{
	          if(!(myFile.exists())){
	              myFile.createNewFile();
	          }
	          fWrite = new FileWriter(myFile,true); // true for appending content to the existing file

	          System.out.println("Write 'stop' when you finish appending file ");
              while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
            	  fWrite.append(source+ System.getProperty("line.separator"));
              }
	          System.out.println("File write complete.....");
	          
	      }catch (IOException e) {
	          e.printStackTrace();
	      }finally{
	          if(fWrite != null) 
	              try { fWrite.close(); } catch (IOException e) { e.printStackTrace(); }
	                  
	      }
   }
   public void readFromFile(String filename)
   {
	   BufferedReader br = null;
       try{
           FileReader myFile  = new FileReader(filename);
           br = new BufferedReader(myFile);
           String line = null; 
           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }
       }catch (IOException e) {
           e.printStackTrace();
       }finally{
           if(br != null) 
               try{ br.close(); }catch(IOException e){e.printStackTrace();}
       }        
   }
   public void deleteFile(String filename) 
   {
	   try{
           File myFile = new File(filename);
           if(myFile.exists()){
               myFile.delete();
               System.out.println("File deleted successfully....");
           }else{
               System.out.println("File NOT Exisit....");
           }
       }catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   public void renameFile(String oldFileName,String newFileName) {
	   File oriFile = new File(oldFileName);
	      File newFile = new File(newFileName);
	      if(oriFile.exists()){
	          oriFile.renameTo(newFile);
	          System.out.println("File rename completed....");
	      }else{
	          System.out.println("Original file not exist for renaming....");
	      }
   }
} 
