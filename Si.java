import java.util.Scanner;
class Si
{
	public static void main (String args[])
	
	{
		Double p,r,t,si;
		
		System.out.println("Enter the Principle Interest");
		
		Scanner s= new Scanner(System.in);
		
		p=s.nextDouble();
		r=s.nextDouble();
		t=s.nextDouble();
		
		si=p*r*t/100;
		
		System.out.println("Si is "+ si);
		
	}
}
		
		
	