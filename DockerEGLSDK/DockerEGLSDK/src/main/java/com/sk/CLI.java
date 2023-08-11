package com.sk;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLI {
	
	
		Options options = new Options();
		Option path = new Option("p", "path", true, "Deployment Descriptor Path");
		HelpFormatter formatter = new HelpFormatter();
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd;
	
	public String setPath(String[] args) {
		    this.path.setRequired(true);
		    this.options.addOption(path);
		    CommandLine cmd=null;
		    try {
	            cmd = parser.parse(options, args);
	        } catch (ParseException e) {
	            System.out.println(e.getMessage());
	            formatter.printHelp("User Profile Info", options);
	            System.exit(1);
	        }
		    
		    System.out.println("Path is: " + cmd.getOptionValue("path"));
		    return cmd.getOptionValue("path");
		
	}
     

}
