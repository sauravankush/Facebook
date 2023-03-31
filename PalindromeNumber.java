import java.util.Scanner;
class PalindromeNumber
{
	public static void main(String[] args) 
	{
	   Scanner k=new Scanner(System.in);
	   System.out.println("Enter a Number :");
	   int ip=k.nextInt();	
       int temp=ip;
       int rev=0;
	   while (ip!=0) 
	   {
	   	  int rem=ip%10;
          rev=rev*10+rem;
          ip/=10;
	   }
	   System.out.println(rev);

	   if (temp==rev) 
	   {
	   	   System.out.println(temp+" is a Palindrome Number");
	   }
	   else 
	   {
	   	  System.out.println(temp+" is Not a Palindrome Number");
	   }
	}
}