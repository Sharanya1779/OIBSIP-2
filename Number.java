import java.util.*;
import java.util.random.*;
class Number
{
   public static void main(String[] args)
   {
   double l,n;
   int c=0,score=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   n=sc.nextInt();
   System.out.println("------------------------------");
   while(c<10)
   {
     l=Math.ceil(Math.random()*100);
	 if(n==l)
	 {
	    System.out.println("randomly generated number is "+l);
		System.out.println("correct guess!");
		score++;
		System.out.println("------------------------------");
		break;
	 }
	 else if(n<l)
	 {
	    System.out.println("randomly generated number is "+l);
		System.out.println("your guess is LOW");
		System.out.println("------------------------------");
		c++;
	 }
	 else if(n>l)
	 {
	    System.out.println("randomly generated number is "+l);
		System.out.println("your guess is HIGH");
		System.out.println("------------------------------");
		c++;
	 } 
   }
   System.out.println("YOUR SCORE IS: "+score);
   }
}