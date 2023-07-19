import java.util.*;

class ArrayPrograms{

	static Scanner san=new Scanner(System.in);
	public static void array_Programs() {
		System.out.println("Enter the Array Size");
		int a[]=new int[san.nextInt()];
		System.out.println("Enter the Second Array size: ");
		int b[]=new int[san.nextInt()];


        // First array values
        System.out.println("\nEnter the first Array values:");  
	    for (int i=0;i<a.length ;i++ ) {
	    	a[i]=san.nextInt();	
	    }
        
        //Second array values
        System.out.println("\nEmter the Second Array values:");  
	    for (int i=0;i<b.length ;i++ ) {
	    b[i]=san.nextInt();	
	    }
	    //Printing of Both arrays
	    System.out.println("\nThe A Array is: ");
	    System.out.println(Arrays.toString(a));

	    System.out.println("\nThe B Array is: ");
	    System.out.println(Arrays.toString(b));


	    //Creating of Third array with length of a+b
	    int c[]=new int[a.length+b.length];

	    for (int x=0,y=0,z=0;z<c.length;z++ ) {

	    	//checking the condition to be added to which array to insert values
	    	if (x<a.length) {
	    		c[z]=a[x];
	    		x++;
	    	}
	    	else if (y<b.length) {
	    		c[z]=b[y];
	    		y++;
	    	}
	    }
	    System.out.println("\nThe Total array c is:");
	    System.out.println(Arrays.toString(c));

	    int rev[]=new int[c.length];

	    //Reversing of C array  
	    System.out.println("\nThe Reverse of the Last array is:");
	   
	    for (int i=c.length-1,index=0;i>=0 ;i-- ) {
	    	rev[index]=c[i];
	    	index++;
	    }
	   
	    System.out.println(Arrays.toString(rev));

	    //Finding the Largest Number 
	   
	    int largeno =c[0];
	   
	    for (int index=0;index<c.length ;index++ ) {
	    	if (largeno<c[index]) {
	    		largeno=c[index];
	    	}
	    }
	    System.out.println("\nThe Largest No in the given Array is:"+largeno);

	    //Finding the sum of array values
	    int sum=0;
	    for(int i=0;i<c.length;i++)
	    {
	    	sum=sum+c[i];

	    }
	    System.out.println("\nThe Sum Of the Given array is :"+sum);
	    System.out.println();


	    //bubblesort
	    for (int i=0;i<c.length ;i++ ) {
	    	for (int j=0;j<c.length-i-1 ;j++ ) 
	    	{
	    		if (c[j]>c[j+1]) {
	    			int temp=c[j];
	    			c[j]=c[j+1];
	    			c[j+1]=temp;
	    			
	    		}
	    		
	    	}
	    	
	    }
	    System.out.println("The sorted array is :"+Arrays.toString(c));


	    //Linear search
	    System.out.println("\nEnter the element to search");
	    Scanner sc=new Scanner(System.in);
	    int serach_element=sc.nextInt();
	    boolean f=false;

	    for (int i=0; i<c.length;i++ ) {
	    	if(serach_element == c[i])
	    	{
	    		f=true;
	    		break;
	    	}
	    }
	    if (f) {
	    	System.out.println("The element "+serach_element+" is present");
	    }
	    else{
	    	System.out.println("Not Present");
	    }
	
	}
}