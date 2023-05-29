package com.sk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadDD {
	
	public String readDD(String filePath) {
		

		// Declaring object of StringBuilder class
        StringBuilder builder = new StringBuilder();
 
        // try block to check for exceptions where
        // object of BufferedReader class us created
        // to read filepath
        try (BufferedReader buffer = new BufferedReader(
                 new FileReader(filePath))) {
 
            String str;
 
            // Condition check via buffer.readLine() method
            // holding true upto that the while loop runs
            while ((str = buffer.readLine()) != null) {
 
                builder.append(str).append("\n");
            }
        }
 
        // Catch block to handle the exceptions
        catch (IOException e) {

            // Print the line number here exception occurred
            // using printStackTrace() method
            e.printStackTrace();
        }
        
        //System.out.println(builder);
 
//        // Returning a string
        	return builder.toString();
       
	}
	
	public  String[] patterMatching(String str) {
		
		   final Pattern pattern = Pattern.compile("<egl:containerTarget.container(.+?)/>",Pattern.DOTALL);
		    final Matcher matcher = pattern.matcher(str);
		    
		   
		    String ans="";
		    while (matcher.find()) {
		    	ans=matcher.group(1);
		        //System.out.println(matcher.group(1));
		    }
		    
		    
		    //System.out.print(ans);
		    
//		    Pattern p = Pattern.compile("\"([^\"]*)\"");
//		    Matcher m = p.matcher(ans);
//		    while (m.find()) {
//		      System.out.println(m.group(1));
//		    }
		   String[] splited = ans.split("\\s+");
		   //System.out.println();
		   //System.out.println(Arrays.toString(splited));
		   return splited;
		 
	}
	
	public void writeInDockerFile(String[] splited) {
		
		// new file object
		File file = new File("Dockerfile");

		BufferedWriter bf = null;

				try {

					// create new BufferedWriter for the output file
					bf = new BufferedWriter(new FileWriter(file));

					// iterate map entries
				

						// put key and value separated by a colon
						bf.write((Arrays.toString(splited)));

						// new line
						bf.newLine();
					

					bf.flush();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
	}
	
	
	

}
