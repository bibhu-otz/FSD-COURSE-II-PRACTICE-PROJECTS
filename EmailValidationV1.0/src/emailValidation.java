import java.util.*;
public class emailValidation {

	public static void main(String[] args) {
	   //Employees Email ID Lists
		ArrayList<String> employee_email_list = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		employee_email_list.add("abc@gmail.com");
		employee_email_list.add("xyz@gmail.com");
		employee_email_list.add("pqr@gmail.com");
		System.out.println("Enter Email to Search");
        String search_email = sc.nextLine();
        if (employee_email_list.contains(search_email.trim()))
            System.out.println("The Email is present in the list");
        else
            System.out.println("The Email is not found in the  list");
		
	}

}
