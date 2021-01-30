
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;


	public class ReadAlldataFromTextFile 
	{
	    public void readMethod1() throws FileNotFoundException, IOException
	    {
	        File fileName = new File("employee.txt");
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
	    } // readMethod1
	    
	    public void readMethod2() throws FileNotFoundException, IOException
	    {
	        File fileName = new File("employee.txt");
	        FileReader fr = new FileReader(fileName);
	        BufferedReader br =  new BufferedReader(fr);
	        
	        String line = br.readLine();
	        while (line != null)
	        {
	            int staffNo = Integer.parseInt(line);
	            System.out.println("StaffNo = "+staffNo);
	            
	            String name = br.readLine();
	            System.out.println("Name = "+name);
	            
	            String gender = br.readLine();
	            System.out.println("gender = "+gender);
	            
	            String address = br.readLine();
	            System.out.println("address = "+address);
	            
	            String state = br.readLine();
	            System.out.println("state = "+state);
	            
	            String txtSalary = br.readLine(); 
	            System.out.println("salary = "+txtSalary);
	            
	            String txtAllowance = br.readLine();
	            System.out.println("allowance = "+txtAllowance);
	            
	            String txtDeduction = br.readLine();
	            System.out.println("deduction = "+txtDeduction);
	            
	            String txtNetSalary = br.readLine();
	            System.out.println("netSalary = "+txtNetSalary);
	            
	            line = br.readLine();
	            
	            
	            double salary = Double.parseDouble(txtSalary);
	            double allowance = Double.parseDouble(txtAllowance);
	            double deduction = Double.parseDouble(txtDeduction);
	            double netSalary = Double.parseDouble(txtNetSalary);
	                    
	            System.out.println("\nkaedah 2 ==> "+staffNo+"\t"+name+"\t"+gender+"\t"+address+"\t"+state+"\t"+salary+"\t"+allowance+"\t"+deduction+"\t"+netSalary);
	            System.out.println("");
	         } // while
	        br.close();
	        fr.close();
	    } // readMethod2
	    
	   
	    public static void main(String[] args) throws FileNotFoundException, IOException 
	    {
	        ReadAlldataFromTextFile test = new ReadAlldataFromTextFile();
	        test.readMethod1();
	        System.out.println("\n===KAEDAH KE 2====");
	        test.readMethod2();
	        
	    }
	}

