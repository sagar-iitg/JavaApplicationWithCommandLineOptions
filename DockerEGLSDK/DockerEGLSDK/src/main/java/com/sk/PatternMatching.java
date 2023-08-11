//package com.sk;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.Arrays;
//import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.apache.commons.cli.CommandLine;
//import org.apache.commons.cli.Option;
//
//import static java.nio.file.Path.*;
//
//public class PatternMatching {
//
//	public static void main(String[] args) throws Exception {
//
//
////		 Logic l=new Logic();
////		 System.out.print(l.str.get(0));
////		 String param=l.str.get(0);
////
////
////
////		Path fileName
////        = Path.of(param);
////		  // Now calling Files.readString() method to
////        // read the file
////        String str = Files.readString(fileName);
////
////
////
////	    final Pattern pattern = Pattern.compile("<egl:containerTarget.container(.+?)/>",Pattern.DOTALL);
////	    final Matcher matcher = pattern.matcher(str);
////
////
////	    String ans="";
////	    while (matcher.find()) {
////	    	ans=matcher.group(1);
////	        //System.out.println(matcher.group(1));
////	    }
////	   //System.out.print(ans);
////
//////	    Pattern p = Pattern.compile("\"([^\"]*)\"");
//////	    Matcher m = p.matcher(ans);
//////	    while (m.find()) {
//////	      System.out.println(m.group(1));
//////	    }
////	   String[] splited = ans.split("\\s+");
////	   System.out.println();
////	   System.out.println(Arrays.toString(splited));
//	  // output();
//
//	}
//
//	public  static void output() throws Exception {
//
//
//		// Logic l=new Logic();
//		 //System.out.print(l.str.get(0));
//		 //String param=l.str.get(0);
//
//		String param="E:\\Java Advance\\JavaApplicationWithCommandLineOptions\\CommondLineOptions\\richui.egldd";
////
//		Path fileName
//       = of(param);
//
//
////		Path fileName
////	       = new Path(param);
//
//		  // Now calling Files.readString() method to
//       // read the file
//       String str = Files.readString(fileName);
//
//
//
//	    final Pattern pattern = Pattern.compile("<egl:containerTarget.container(.+?)/>",Pattern.DOTALL);
//	    final Matcher matcher = pattern.matcher(str);
//
//
//	    String ans="";
//	    while (matcher.find()) {
//	    	ans=matcher.group(1);
//	        //System.out.println(matcher.group(1));
//	    }
//	   //System.out.print(ans);
//
////	    Pattern p = Pattern.compile("\"([^\"]*)\"");
////	    Matcher m = p.matcher(ans);
////	    while (m.find()) {
////	      System.out.println(m.group(1));
////	    }
//	   String[] splited = ans.split("\\s+");
//	   System.out.println();
//	   System.out.println(Arrays.toString(splited));
//
//
//
//		// new file object
//		File file = new File("Dockerfile");
//
//		BufferedWriter bf = null;
//
//		try {
//
//			// create new BufferedWriter for the output file
//			bf = new BufferedWriter(new FileWriter(file));
//
//			// iterate map entries
//
//
//				// put key and value separated by a colon
//				bf.write((Arrays.toString(splited)));
//
//				// new line
//				bf.newLine();
//
//
//			bf.flush();
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//
//	}
//
//
//}
