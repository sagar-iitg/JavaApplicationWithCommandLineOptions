package com.sk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class WriteInDockerFile {
		
	public void writeInFile() {
				File file = new File("Dockerfile");

				BufferedWriter bf = null;

				try {

					// create new BufferedWriter for the output file
					bf = new BufferedWriter(new FileWriter(file));

					// iterate map entries
				

						// put key and value separated by a colon
					//	bf.write((Arrays.toString(splited)));

						// new line
						bf.newLine();
					

					bf.flush();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

}
