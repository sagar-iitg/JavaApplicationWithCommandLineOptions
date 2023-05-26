package com.sagar;
// Java program to write HashMap to a file

import java.io.*;
import java.util.*;

class StoreInHashMap {

//	final static String outputFilePath
//		= "F:/Serialisation/write.txt";

	public static void main(String[] args)
	{
		//String MAINTAINER
		// create new HashMap
		HashMap<String, String> map
			= new LinkedHashMap<String, String>();

		// key-value pairs
		map.put("MAINTAINER", "one");
		map.put("Base", "two");
		map.put("jainie", "three");

		// new file object
		File file = new File("Dockerfile");

		BufferedWriter bf = null;

		try {

			// create new BufferedWriter for the output file
			bf = new BufferedWriter(new FileWriter(file));

			// iterate map entries
			for (Map.Entry<String, String> entry :
				map.entrySet()) {

				// put key and value separated by a colon
				bf.write(entry.getKey() + " "
						+ entry.getValue());

				// new line
				bf.newLine();
			}

			bf.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {

			try {

				// always close the writer
				bf.close();
			}
			catch (Exception e) {
			}
		}
	}
}
