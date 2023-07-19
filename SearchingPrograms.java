import java.util.*;
public class SearchingPrograms{
 
    static Scanner sc=new Scanner(System.in);
    static int lower=0;

	public static void  linear_search() {
		String res = "Not Present";
		System.out.print("Enter the Array Size :");
		int a[]=new int[sc.nextInt()];

		System.out.println("Enter the Array values: ");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		System.out.println("Enter the number to search: ");

		int Search_val=sc.nextInt();

		for (int i=0;i<a.length;i++ ) {
			if(a[i]==Search_val){
				res = "Present";
				System.out.println("The searched value is "+res+" :"+Search_val);
			    break;			
		}	
		}
	}


     public static void binary_search() {
		System.out.print("Enter the array size :");
		int a[]=new int[sc.nextInt()];
		int higher=a.length-1;

		System.out.println("\nEnter the array values");
		for (int i=0;i<a.length;i++ ) {
			a[i]=sc.nextInt();
		}

		String res="Not Present";
		System.out.println("Enter the value to be searched: ");
		int key=sc.nextInt();
		int mid=(lower+higher)/2;

		for (int i=lower;i<a.length ;i++ ) {
			mid=(lower+higher)/2;
			if(a[mid] == key){
				res="Present";
			}
			else if (key>a[mid]) {
				lower = mid+1;
			}
			else {
				higher = mid-1;
			}
		}
		System.out.println("The serached value "+key+ " is "+res);
	}

}