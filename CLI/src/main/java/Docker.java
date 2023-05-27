import com.sk.CLI;

class Docker {
    public static void main(String[] args) throws Exception {
        
    
    	CLI cli=new CLI();
    	String path=cli.setPath(args);
        System.out.println(path);
    	System.out.println("Hello");
    }
}