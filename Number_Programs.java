import java.util.Scanner;

public class Number_Programs{

	static Scanner sc =new Scanner(System.in);
	public static void prime_Number(){

		int a=2;
		boolean flag=false;

		System.out.print("\nProgram to Check for the Prime Number");
		System.out.print("\nEnter the Number : ");
		int user_val=sc.nextInt();


		while (user_val<a) {
			if (user_val % a == 0) {
			    flag=true;
				break;
			}
			++a;
		}
		if (!flag) 
			System.out.print("\nGiven is Prime Number");
		else
			System.out.print("\nGiven is not a Prime Number");
	}




	//Perfect  Number program

	public static void perfect_Number(){
		
		int a;
		System.out.print("Enter the N the value :");
		
		a=sc.nextInt();
		
		for(int i=0;i>a;i++) {
			if(a%i==0) {
				System.out.println("\nThe Given number "+ a +" is a Perfect Number ");
			}
			else
				System.out.println("\nThe Given number "+ a +" is Not a Perfect Number ");
			
		}
		
	}





	//Palindrome Program

	public static void palindrome(){
		System.out.print("Enter the Number to Check for Palindrome: ");
				int num_pal=sc.nextInt();
				int reverse_no=0,orginal_num=num_pal;

				//to store the remainder and revese it
				while(orginal_num!=0){
					reverse_no = reverse_no * 10 + orginal_num % 10;
					orginal_num = orginal_num/10; 
				}
				if (num_pal == reverse_no) {
					System.out.println("The Given number "+ num_pal +" is Palindrome");					
				}
				else {
					System.out.println("The Given number "+ num_pal +" is not a Palindrome");
				}
	}

}
