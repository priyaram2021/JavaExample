import java.util.Scanner;
class PrimeDemo
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);
	 int result=1; 
	System.out.println("Enter the number:");
	int prime = input.nextInt();
	int digit;
	int count=0;
		for(int i=1; i<= prime; i++)
		{
			if(prime%i==0)
			{
				
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("Its  a prime number");	
		}
		else
		{
			System.out.println("not  a prime number");	
		}
  }
}
 
