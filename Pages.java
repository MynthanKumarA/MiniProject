import java.util.Scanner;

public class Pages{

	static Scanner sc=new Scanner(System.in);


	//Login pages
	public static void login(){

	int log_in_stud_id,log_pin;
	boolean login_check = true;

	do{
	if (Credentials.user_check == true) {

	System.out.println("\n\t\t\t----Login detials----");
	System.out.print("\nStudent id : ");

	//Receving id from the user 
	log_in_stud_id=sc.nextInt();

	System.out.print("Pin        : ");

	//Receving password from the user
	log_pin=sc.nextInt();

	//verifying the login details 
	if (Credentials.pin == log_pin && Credentials.student_id == log_in_stud_id) {
		
		//welcome page for the Student profile 
		System.out.print("\t\t\t----Sutdents Portfolio----\n");
		//printing user details
		System.out.print("\t\"Hi this is JARVIS and I Heartly welcome you once again sir for the S-Walk\" \n\t\t---PLAN IT---\n\t\t\t---DO IT---\n");
		System.out.print("Welcome Mr."+Credentials.S_name);
		System.out.println("\nStudent id :"+ log_in_stud_id);


		boolean exit=true,flag=true;

		do{
		//A New page will arrive
		System.out.print("\nThe Programs ");
		System.out.print("\n1.Array Programs\n2.Searching Progams\n3.Number Programs\n4.Exit\nEnter your Choice : ");

		//receving the user choice
		int user_opt_programs=sc.nextInt();

		//Using switch 
		switch (user_opt_programs) {
		case 1:
			ArrayPrograms.array_Programs();
			break;
		case 2:
			System.out.println("\nChoose Searching Algorithm ");
			System.out.print("\n1.Linear_Search\n2.Binary_Search");
			System.out.print("\nEnter your choice : ");
			int search_opt=sc.nextInt();
			switch(search_opt){
			case 1:
				SearchingPrograms.linear_search();
				break;
			case 2:
				SearchingPrograms.binary_search();
				break;
			default:
				System.out.print("\nInvalid Option");
				break;
			}
		case 3:
			do{
			System.out.print("\nChoose the program");
			System.out.print("\n1.Palindrome\n2.Prime Number\n3.Perfect Number\n4.Exit");
			System.out.print("\nEnter your Choice : ");
			int number_opt=sc.nextInt();
			switch(number_opt){
			case 1:
				Number_Programs.palindrome();
				break;
			case 2:
				Number_Programs.prime_Number();
				break;
			case 3:
				Number_Programs.perfect_Number();
				break;
			case 4:
				flag =false;
				break;
			default:
				System.out.print("\nInvalid Option");
				break;	
			}}while(flag);


		case 4:
		    exit=false;
				break;
		default:
			System.out.print("\nInvalid Option");
			break;				
		}

	    }while(exit);


		//to stop the itiration
		login_check = true;

	   }
	   else
	    {
		System.out.println("\t\t\t***** WRONG DETAILS *****");
		login_check = false;
		System.out.println("\t\t\t----- Retry Login ----- ");
	   }
       }
       }while (login_check == false);
    }



   //Signup page


   public static void signup(){

   	if (Credentials.user_check == false) {

   		System.out.println("\t\t\t----Sign-up Page----");
   		System.out.println("Enter your details");

   		//Receiving details of new user
   		System.out.print("Enter your name: ");
   		Credentials.S_name = sc.next();

   		System.out.print("Enter your Contact Number :");
   		Credentials.contact = sc.nextLong();

   		System.out.print("Enter your Student_id : ");
   		Credentials.student_id = sc.nextInt();

   		System.out.print("Enter your Pin : ");
   		Credentials.pin = sc.nextInt();

   		Credentials.user_check = true;
   		System.out.println("\t\t\t----Successfully Registered----\n----------->>> Now you can Login\n");
   	}
   }


   	//Method for reseting password

   	public static void reset_password(){

   		int user_otp = 0;
   		if (Credentials.user_check == true) {
   			
   		
   		System.out.print("\n\t\t\t----Reseting your Password----");

   		System.out.print("\nEnter your Student id :");
   		int student_id_check = sc.nextInt();

   		//checking for if it's correct

   		System.out.print("Your Contact number is "+Credentials.contact);

   		user_otp=(int)(Math.random()*9999+9999);
   		//Thread.sleep(1500);

   		//Veriyfing the otp
   		System.out.print("\nYour Otp: "+user_otp);

   		System.out.print("\nEnter your OTP: ");
   		int verify_otp = sc.nextInt();
   		if (user_otp == verify_otp) {

   			System.out.print("Enter your new Pin: ");
   			Credentials.pin = sc.nextInt();
   		}
   		else{
   			System.out.print("Invalid otp");
   			System.exit(0);
   		}

   	}
   }
   
}