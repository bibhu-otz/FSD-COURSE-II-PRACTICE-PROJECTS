//call by value
public class callMethod {
	 int val=150; // instance variable
     int operation(int val) {
    	 val = val*10/100;   //Operation performed on local variable
    	 return val;
     }
	public static void main(String[] args) {
		callMethod d = new callMethod();
		System.out.println("Before operation value of data is "+d.val);
		int res = d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		System.out.println("After operation value by method operation is "+res); 
	}

}
