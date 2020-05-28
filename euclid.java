//algorithms
//euclid algorithm
import java.util.*;
import java.lang.*;
public class Euclid{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m,n;
		System.out.println("To find gcd using Euclid's Algorithm:\nEnter m and n values: ");
		m=s.nextInt();
		n=s.nextInt();
		int r;
			while(n%m!=0)
			{
			  r=n%m;
			  n=m;
			  m=r;
		    }
		System.out.println("gcd is: "+m);
	}
}
