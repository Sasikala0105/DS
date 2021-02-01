
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	import java.io.PrintWriter;
	import java.util.ArrayList;

	public class BillOperation 
	{
	    //method public void addRecord
		//Parameter = bill b
		//store into one record
	    public void addRecord(Bill b) throws IOException //must have exception because it involves file..if not cannot run
	    {  // b = bill
	    	//store in file text
	        File fileName = new File("billing.txt");//creating a txtfile to store data
	        FileWriter fw = new FileWriter(fileName, true);//parameter based on fileName
	        PrintWriter pw = new PrintWriter(fw);//
	        //store data//getter method
	        pw.println(b.getAccountnumber());
	        pw.println(b.getBilldate());
	        pw.println(b.getName());
	        pw.println(b.getAddress());
	        pw.println(b.getArrears());
	        pw.println(b.getCurrentmeterreading());
	        pw.println(b.getPreviousmeterreading());
	        pw.println(b.getTotalunit());
	        pw.println(b.getCurrentcharge());
	        pw.println(b.getTotalbill());
	        //close the file
	        pw.close();
	        fw.close();
	        
	    } // addRecord
	    
	    public ArrayList <Bill>  displayAllRecord() throws FileNotFoundException, IOException
	    {
	        ArrayList <Bill> billings = new ArrayList<Bill>();
	        Bill b;
	        
	        File fileName = new File("billing.txt");
	        FileReader fr = new FileReader(fileName);
	        BufferedReader br =  new BufferedReader(fr);
	        
	        String line = br.readLine(); //one by one as long as got data.
	        while (line != null)//if there is no data then will return null..//will read all the data in line
	        {
	            //System.out.println(line);
	            int accountnumber = Integer.parseInt(line); //convert to integer
	            String billdate = br.readLine();//to read data in one line in txt file billing 
	            String name = br.readLine();//3rd line
	            String address = br.readLine(); //4th line
	            double arrears = Double.parseDouble(br.readLine());
	            double currentmeterreading = Double.parseDouble(br.readLine()); 
	            double previousmeterreading = Double.parseDouble(br.readLine()); 
	            double totalunit = Double.parseDouble(br.readLine()); 
	            double currentcharge = Double.parseDouble(br.readLine()); 
	            double totalbill = Double.parseDouble(br.readLine());
	            
	            b = new Bill(accountnumber, billdate, name, address, arrears, currentmeterreading, previousmeterreading, totalunit, currentcharge, totalbill);
	            billings.add(b);  // store data into arraylist //method in arraylist = add
	            line = br.readLine();
	        } // while (line != null)
	        br.close();
	        fr.close();
	        return billings;//return billings bcz we store data already
	        
	    } // displayAllRecord
	    
	    public ArrayList <Bill>  readAllRecordFromFile() throws FileNotFoundException, IOException
	    {
	        ArrayList <Bill> billings = new ArrayList<Bill>();
	        Bill b;
	        
	        File fileName = new File("billing.txt");
	        FileReader fr = new FileReader(fileName);
	        BufferedReader br =  new BufferedReader(fr);
	        
	        String line = br.readLine();//will read one by one
	        while (line != null)
	        {
	            //System.out.println(line);
	            int accountnumber = Integer.parseInt(line);
	            String billdate = br.readLine();
	            String name = br.readLine();
	            String address = br.readLine();
	            double arrears = Double.parseDouble(br.readLine());
	            double currentmeterreading = Double.parseDouble(br.readLine());
	            double previousmeterreading = Double.parseDouble(br.readLine());
	            double totalunit = Double.parseDouble(br.readLine());
	            double currentcharge = Double.parseDouble(br.readLine());
	            double totalbill = Double.parseDouble(br.readLine());
	            
	            b = new Bill(accountnumber, billdate, name, address, arrears, currentmeterreading, previousmeterreading, totalunit, currentcharge, totalbill);
	            billings.add(b);
	            line = br.readLine();
	        } // while (line != null)
	        br.close();
	        fr.close();
	        return billings;
	    } // readAllRecordFromFile
	     
	
	    public Bill findRecord(int accnum) throws FileNotFoundException, IOException
	    {
	        Bill b = null;
	        ArrayList <Bill> billlist = readAllRecordFromFile();
	        
	        for (int i=0; i < billlist.size(); i++)
	        {
	            if(accnum == billlist.get(i).getAccountnumber())
	            {
	                b = billlist.get(i);
	                System.out.println("Record found");
	            }
	                
	        }
	        return b;
	    } //findRecord
	    
	    public double calctariff(double c){
	        double sum=0;
	        double[] m=new double[5];
	        m[0] = 200*0.218;
	        m[1] = 100*0.334;
	        m[2] = 300*0.516;
	        m[3] = 300*0.546;
	        
	       if(c<=200){
	       sum=c*0.218;
	       }else if(c>200 && c<=300){
	       sum=m[0]+((c-200)*0.334);
	       }else if(c>300 && c<=600){
	       sum=m[0]+m[1]+((c-300)*0.516);
	       }
	       else if(c>600 && c<=900){
	       sum=m[0]+m[1]+m[2]+((c-600)*0.546);
	       } 
	       else if(c>=901){
	       sum=m[0]+m[1]+m[2]+m[3]+((c-900)*0.571);
	       }
	        
	         return sum;
	     }
	    
	    public void addAllRecordInFile(ArrayList <Bill> billings) throws IOException
	    {
	        File fileName = new File("billing.txt");
	        FileWriter fw = new FileWriter(fileName);
	        PrintWriter pw = new PrintWriter(fw);
	        
	        for (int i=0; i < billings.size(); i++)
	        {
	            pw.println(billings.get(i).getAccountnumber());
	            pw.println(billings.get(i).getBilldate());
	            pw.println(billings.get(i).getName());
	            pw.println(billings.get(i).getAddress());
	            pw.println(billings.get(i).getArrears());
	            pw.println(billings.get(i).getCurrentmeterreading());
	            pw.println(billings.get(i).getPreviousmeterreading());
	            pw.println(billings.get(i).getTotalunit());
	            pw.println(billings.get(i).getCurrentcharge());
	            pw.println(billings.get(i).getTotalbill());
	        }
	        pw.close();
	        fw.close();
	    } //addAllRecordInFile
	    
	
	    
	} // class BillOperation


