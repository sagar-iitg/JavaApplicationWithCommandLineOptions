package com.sk;

import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Logic {
	
	
	ArrayList<String> str=new ArrayList();

	public void fun(String[] args) throws Exception {
	
		
		Options options = new Options();
		Option path = new Option("p", "path", true, "Deployment Descriptor Path");
		//Option mobileNumber = new Option("m", "mobilenumber", true, "Mobile Number");
	    
	
	    path.setRequired(true);
	    options.addOption(path);
	    
	   
	    //mobileNumber.setRequired(false);
	    //options.addOption(mobileNumber);
	    
        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("User Profile Info", options);
            System.exit(1);
            return;
        }
        System.out.println("Path is: " + cmd.getOptionValue("path"));
        str.add(cmd.getOptionValue("path"));
        //str.add(cmd.getOptionValue("mobilenumber"));
        
        //System.out.println("User Last Name is: " + cmd.getOptionValue("lastname"));
        //System.out.println("User Email is: " + cmd.getOptionValue("email"));
//        if (cmd.hasOption("m")) {
//            System.out.println("User Mobile Number is: " + cmd.getOptionValue("mobilenumber"));
//        }
        
        //PatternMatching.output();
        
        
        
        
	}

}
