package pkg;
import java.util.Arrays;

import com.sk.*;

class Docker {
	
	
	
	
    public static void main(String[] args) throws Exception {
        
    	CLI cli=new CLI();
    	String path=cli.setPath(args);
    	
    	System.out.println(Arrays.toString(args));
    	
        System.out.println(path);
        ReadDD r=new ReadDD();
        String s=r.readDD(path);
       // System.out.println(s);
        String[] res=r.patterMatching(s);
        System.out.println(Arrays.toString(res));
        r.writeInDockerFile(res);
        
    	//System.out.println("Hello");
    	//PathInput pathInput=new PathInput();
    	//pathInput.check() ;
    	//System.out.println("------------");
    	//System.out.println(cli.toString());
    	//System.out.println("--------------------fake");
        
    	//System.out.println(cli.cmd.getOptionValue(path));
    }
    
   
}