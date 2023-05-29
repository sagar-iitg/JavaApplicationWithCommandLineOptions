package com.sk;



import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLI {
	
	  	public final StringBuilder buf = new StringBuilder();

		public Options options = new Options();
		Option path = new Option("p", "path", true, "Deployment Descriptor Path");
		HelpFormatter formatter = new HelpFormatter();
		CommandLineParser parser = new DefaultParser();
		//CommandLine cmd;
		public ArrayList<String> str=new ArrayList<>();
		public CommandLine cmd=null;
	
	public String setPath(String[] args) {
			//System.out.println(args[0]);
		    this.path.setRequired(true);
		    this.options.addOption(path);
		  
		    try {
	            cmd = parser.parse(options, args);
	        } catch (ParseException e) {
	            System.out.println(e.getMessage());
	            formatter.printHelp("Docker file Generation Option", options);
	            System.exit(1);
	        }
		    
		    //System.out.println("Path is: " + cmd.getOptionValue("path"));
		    str.add(cmd.getOptionValue("path"));
		    return cmd.getOptionValue("path");
		
	}
	
	public ArrayList<String> getPath() {
		return str;
		
	}
     
	
	
	    @Override
	    public String toString() {
	      
	        buf.append(cmd.getOptionValue(path));
	       

	        return buf.toString();
	    }

}
