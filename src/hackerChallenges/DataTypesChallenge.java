package hackerChallenges;
import java.util.*;
import java.io.*;
import java.math.*;

public class DataTypesChallenge {
	


	
	    public static void main(String []argh) throws Exception
	    {



	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)System.out.println("* byte");
	                if(x>=-(Math.pow(2,16)) && x<=(Math.pow(2,16)-1))
	                    System.out.println("* short");
	                if(x>=-(Math.pow(2,32)) && x<=(Math.pow(2,32)-1))
	                    System.out.println("* int");
	                if(x>=-(Math.pow(2,64)) && x<=(Math.pow(2,64)-1))
	                    System.out.println("* long");
	                if(x<-(Math.pow(2,64)) && x>=(Math.pow(2,64)))
	                    throw new Exception();
	                //Complete the code
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	    }
	}


