package com.sonarsource.support;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reproducer {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String readFile(File f) throws IOException{
        StringBuilder sb = new StringBuilder();
        String line;
        try {
          FileReader fileReader = new FileReader("fileName");
          BufferedReader bufferedReader = new BufferedReader(fileReader);
      
          while((line = bufferedReader.readLine()) != null) {
            //...
          }
        }
        catch (IOException e) {  // Noncompliant
          throw e;
        }
        return sb.toString();
      }
}
    
