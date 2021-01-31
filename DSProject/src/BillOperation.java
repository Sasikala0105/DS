
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
	    
	    public void addRecord(Bill b) throws IOException 
	    {  // b = bill
	        File fileName = new File("billing.txt");
	        FileWriter fw = new FileWriter(fileName, true);
	        PrintWriter pw = new PrintWriter(fw);
	        
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
	        
	        String line = br.readLine(); 
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
	            billings.add(b);  // store into arraylist
	            line = br.readLine();
	        } // while (line != null)
	        br.close();
	        fr.close();
	        return billings;
	        
	    } // displayAllRecord
	    
	    public ArrayList <Bill>  readAllRecordFromFile() throws FileNotFoundException, IOException
	    {
	        ArrayList <Bill> billings = new ArrayList<Bill>();
	        Bill b;
	        
	        File fileName = new File("billing.txt");
	        FileReader fr = new FileReader(fileName);
	        BufferedReader br =  new BufferedReader(fr);
	        
	        String line = br.readLine();
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
	        double[] a=new double[5];
	        a[0]=200*0.218;
	        a[1]=100*0.334;
	        a[2]=300*0.516;
	        a[3]=300*0.546;
	        
	       if(c<=200){
	       sum=c*0.218;
	       }else if(c>200&&c<=300){
	       sum=a[0]+((c-200)*0.334);
	       }else if(c>300&&c<=600){
	       sum=a[0]+a[1]+((c-300)*0.516);
	       }
	       else if(c>600&&c<=900){
	       sum=a[0]+a[1]+a[2]+((c-600)*0.546);
	       } 
	       else if(c>=901){
	       sum=a[0]+a[1]+a[2]+a[3]+((c-900)*0.571);
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


