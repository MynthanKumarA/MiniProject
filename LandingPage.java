import java.util.Scanner;

public class LandingPage{

	static Scanner sc=new Scanner(System.in);
	static int user_choice;
	public static void main(String[] args) {

		boolean exit=true;

		System.out.println("\n\t\t\tS - Walk");

		do{
		System.out.println("\nPlease Sign-up first if you are a new user\n");
		System.out.println("Select the option");
		System.out.println("1.Log-in\n2.Sign-up\n3.Reset Password\n4.Exit");
		System.out.print("Enter your Choice: ");

		//Options to be choosed by the user 
		user_choice=sc.nextInt();

		switch (user_choice) {
		case 1:
			Pages.login();
			break;
		case 2:
			Pages.signup();
			break;
		case 4:
			exit=false;
			break;
		case 3:
			Pages.reset_password();
			break;
		default:
			System.out.println("\t\t*******PLEASE ENTER VALID OPTION*******");
		}
		}
		while(exit);
		System.out.println("\t\t\t----Thank You for Visiting----");
	

	}
}
