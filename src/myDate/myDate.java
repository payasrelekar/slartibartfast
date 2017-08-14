package myDate;

public class myDate {
	
	public int day, month, year;
	
	//Constructor : default
	public myDate() {
		
		setDay(1);
		setMonth(1);
		setYear(1970);
	}
	
	//Constructor : with parameters
	public myDate(int d, int m, int y) {
		
		setDay(d);
		setMonth(m);
		setYear(y);
	}
	
	//accessor and mutator methods for date values	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	//toString function for wasy output
	public String toString() {
		
		return "Date is "+this.day+"/"+this.month+"/"+this.year;
	}
	
	//MAIN
	public static void main(String[] args) {
		
		myDate date1 = new myDate();
		myDate date2 = new myDate(12, 13, 14);
		
		System.out.println(date1);
		System.out.println(date2);
		
	}

}
