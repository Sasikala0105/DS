
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

//to display at console without involving gui
	public class ReadAlldataFromTextFile 
	{
	    public void readMethod1() throws FileNotFoundException, IOException
	    {
	        File fileName = new File("billing.txt");
	        FileReader fr = new FileReader(fileName);
	        BufferedReader br =  new BufferedReader(fr);
	        
	        String line = br.readLine();
	        while (line != null)
	        {
	            System.out.println(line);
	            line = br.readLine();
	        }
	        br.close();
	        fr.close();
	    } 
	    
	 
	        
	    }
	

