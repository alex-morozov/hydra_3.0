package com.sikuli.appmanager;

import java.io.File;

public class DeleteFile{
    
  public static void deleteFile(String path2) {
    try {
              File userData = new File(path2);
            if(userData.exists() && userData.isFile()){
                boolean success = userData.delete();
                if (success) {
                    System.out.println("File " + userData.getPath() + " has been deleted");
                } else {
                    System.err.println("File " + userData.getPath() + " has not been deleted");
                }
            } else {
                System.out.println("File " + userData.getPath() + " doesn't exist");
            }
        } catch (SecurityException e) {
            System.err.println("Deleting a file is denied!");
            e.printStackTrace();
        }
  }
}