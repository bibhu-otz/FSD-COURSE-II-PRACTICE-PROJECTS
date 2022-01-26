package com;

public interface FileActions {
     public void createFile(String filename);
     public void writeToFile(String filename);
     public void appendToFile(String filename);
     public void readFromFile(String filename);
     public void deleteFile(String filename);
     public void renameFile(String oldfilename,String newfilename);
}
