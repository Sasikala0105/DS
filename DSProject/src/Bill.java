
public class Bill 
	{
	    private int accountnumber;
	    private String billdate;
	    private String name;
	    private String address;
	    private double arrears;
	    private double currentmeterreading;
	    private double previousmeterreading;
	    private double totalunit;
	    private double currentcharge;
	    private double totalbill;

	    public Bill(int accountnumber, String billdate, String name, String address, double arrears, double currentmeterreading, double previousmeterreading, double totalunit, double currentcharge, double totalbill) {
	        this.accountnumber = accountnumber;
	        this.billdate = billdate;
	        this.name = name;
	        this.address = address;
	        this.arrears = arrears;
	        this.currentmeterreading = currentmeterreading;
	        this.previousmeterreading = previousmeterreading;
	        this.totalunit = totalunit;
	        this.currentcharge = currentcharge;
	        this.totalbill = totalbill;
	    
			
		}

		public int getAccountnumber() {
	        return accountnumber;
	    }

	    public String getBilldate() {
	        return billdate;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public double getArrears() {
	        return arrears;
	    }

	    public double getCurrentmeterreading() {
	        return currentmeterreading;
	    }

	    public double getPreviousmeterreading() {
	        return previousmeterreading;
	    }

	    public double getTotalunit() {
	        return totalunit;
	    }

	    public double getCurrentcharge() {
	        return currentcharge;
	        
	    }
	    
	    public double getTotalbill() {
	    	return totalbill;
	    }
	    
	    
	}


