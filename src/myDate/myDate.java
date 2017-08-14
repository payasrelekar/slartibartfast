package myDate;

public class myDate {
	
	public int day, month, year;
	
	public void initDate(int d, int m, int y) {
		
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public String toString() {
		
		return "Date is "+this.day+"/"+this.month+"/"+this.year;
	}
	
	public static void main(String[] args) {
		
		myDate date1 = new myDate();
		
		date1.initDate(12, 13, 14);
		
		System.out.println(date1);
		
	}

}
