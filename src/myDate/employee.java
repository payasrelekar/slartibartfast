package myDate;

public class employee {
	
	//private datamembers
	private int id;
	private String name;
	private double basicSalary, hra, medical, pf, pt, netSalary, grossSalary;
	
	//static variable for lab exercise-6
	private static String company = "Douchebag one";
	
	//Accessors and Mutators	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getPt() {
		return pt;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public double getNetSalary() {
		return netSalary;
	}

	//private setNetSalary because it shouldn't be changed from outside
	private void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	//private setGrossSalary, because it shouldn't be changed from outside.
	private void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	//for lab exercise-6
	public static void changeCompany(String newCompany) {
		employee.company = newCompany;
	}
	
	//constructor : no parameters
	public employee() {
		
		setHra(0.5 * basicSalary);
		setPf(0.12 * basicSalary);
		setPt(200);
	}
	//constructor : with parameters
	public employee(int id, String name, double basicSalary, double medical) {
		
		setId(id);
		setName(name);
		setBasicSalary(basicSalary);
		setMedical(medical);
		setHra(0.5 * basicSalary);
		setPf(0.12 * basicSalary);
		setPt(200);
	}
	
	//toString function for initial debugging
	public String toString( ) {
		return "Employee ID : "+this.getId()+"\nEmployee Name : "+this.getName()+"\nGross Salary : "+this.getGrossSalary();
	}
	
	//calculate Gross and Final Salary based on basic salary and other benefits
	public void calculateSalary() {
		
		setGrossSalary(this.getBasicSalary()+this.getHra()+this.getMedical());
		setNetSalary(this.getGrossSalary()-(this.getPt()+this.getPf()));
	}
	
	//initial main for debugging
	public static void main(String[] args) {
		
		employee e1 = new employee();
		employee e2 = new employee(20, "tolkien", 2000, 10);
		
		e1.calculateSalary();
		System.out.println(e1);
		
		e2.calculateSalary();
		System.out.println(e2);
		
		//for lab exercise-6
		System.out.println("Old company is "+employee.company);
		employee.changeCompany("New Douchery");
		System.out.println("New company is "+employee.company);
	}

}
