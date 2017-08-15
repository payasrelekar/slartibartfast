package myDate;

public class mathClass {
	
	//for lab exercise-3
	public int add(int... inputInt) {
		//initialize sum to zero
		int sum = 0;
		
		for(int i:inputInt) {
			sum += i;
		}
		return sum;
	}
	
	//somehow, 'float' doesn't work. As in it is not accepted at function calling
	//figure out why so later.
	//switching to 'double' works for now
	public double add(double... inputFloat) {
		//initialize sum to zero
		double sum = 0;
		
		for(double i:inputFloat) {
			sum += i;
		}
		return sum;
	}
	
	public String add(String...inputString) {
		String sum = "";
		
		for(String i:inputString) {
			sum += i;
		}
		
		return sum;
	}
	
	//for lab exercise-4
	public int addVarArg(int... inputInt) {
		//initialize sum to zero
		int sum = 0;
		
		for(int i:inputInt) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		mathClass obj1 = new mathClass();
	
		//for lab exercise-3
		System.out.println(obj1.add(1,2,3,4));
		System.out.println(obj1.add(1.2,3.4,5.6,7.8));
		System.out.println(obj1.add("Hi ","How ","you ","doin'"));
		
		//for lab exercise-4
		System.out.println(obj1.addVarArg(1,2,3,4,5));
		System.out.println(obj1.addVarArg(1,2,3));
		System.out.println(obj1.addVarArg(9,8,7,6));
	}

}
