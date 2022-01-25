import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(true) {
	    	System.out.println("Enter Two Number :");
	    	int num1 = sc.nextInt();
	    	int num2 = sc.nextInt();
	    	System.out.println("Press 1 for Addition(+)");
	    	System.out.println("Press 2 for Substraction(-)");
	    	System.out.println("Press 3 for Addition(*)");
	    	System.out.println("Press 4 for Addition(/)");
	    	int choice = sc.nextInt();
	    	switch(choice) {
	    	  case 1 :
	    		System.out.println(num1+"+"+num2+"="+(num1+num2));
	    		break;
	    	  case 2 :
	      		System.out.println(num1+"-"+num2+"="+(num1-num2));
	      		break;
	    	  case 3 :
	      		System.out.println(num1+"*"+num2+"="+(num1*num2));
	      		break;
	    	  case 4 :
	      		System.out.println(num1+"/"+num2+"="+(num1/num2));
	      		break;
	      	  default:
	      		System.out.println("invalid Choice");
	    	 }
	    	sc.nextLine();
	    	System.out.println("Do you want to continue (Y/N):");
	    	String option = sc.nextLine();
	    	if(option.equalsIgnoreCase("N")) {
	    		System.out.println("Application terminated Successfully");
	    		break;
	    	}
    	}
    }
}
