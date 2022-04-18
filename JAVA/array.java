import java.util.Scanner;

class array
{
	public static void main (String args[])
	{
	int i,n;		
	Scanner s1=new Scanner(System.in);	
	int arr[] = new int[5];
	System.out.println("Entered value of n");
	n=s1.nextInt();	
	for(i=0;i<n;i++)
	{
	   arr[i]= s1.nextInt();
	}
		
	
	for (i = 0; i < arr.length; i++)
		{
		System.out.println("Element at index " + i +" :"+ arr[i]);
		}		
	}					
}

