package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
	public static void main(String[] args) 
	{	    
		//Enter Number One
		System.out.println("Enter Number one here : ");
	    String number_one = "0";
	    
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    number_one = bufferRead.readLine();
		    System.out.println(number_one);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//Enter Number Two
		System.out.println("Enter Number two here : ");
	    String number_two = "0";
		 
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));	    
		    number_two = bufferRead.readLine();
		    System.out.println(number_two);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}		
		
		//Array 1
		int[] test = new int [64];
		char test_1 [] = number_one.toCharArray();
		int len = number_one.length();
		int i = 0;
		int j = len -1;
		while (true)
		{
			int tmp = Character.getNumericValue(test_1[j]);
			test [i] = tmp;
			i++;
			j--;
			if (j < 0)
				break;
		}
		for (i = 0; i < len; i++)
			 System.out.printf ("%d ",test[i]);
		System.out.printf ("\n",test[i]);
		 
		//Array 2
		int[] test1 = new int [64];
		char test_2 [] = number_two.toCharArray();
		int len1 = number_two.length();
		 i = 0;
		 j = len1 -1;
		 while (true)
		 {
			 int tmp = Character.getNumericValue(test_2[j]);
			 test1 [i] = tmp;
			 i++;
			 j--;
			 if (j < 0)
				 break;
		 }
		 for (i = 0; i < len1; i++)
			 System.out.printf ("%d ",test1[i]);
		 System.out.printf ("\n",test1[i]);
			 
		//Backwards	 
		 int [] sim_fin = new int [64];
		 int car = 0;
		 int arrLength = 0;
		 if (len >= len1)
			 arrLength = len;
		 else
			 arrLength = len1;
		 for (i = 0; i < arrLength; i++)
		 {
			 int one = test [i] + test1[i];
			 int sing = 0;
			 int dec = 0;
			 if (one > 9)
			 {
				 sing = one - 10;
				 dec = 1;
			 }
			 else
			 {
				 if (one == 9)
				 {
					 if (car > 0)
					 {
						 sing = 0;
						 dec = 1;
						 car = 0;
					 }
					 else
					 {
						 sing = 9;
						 dec = 0;
					 }
				 }
				 else
				 {
					 sing = one;
				 }
			 }
			 sim_fin [i] = sing + car;
			 car = dec;
		 }
		 if (car == 1){
			 sim_fin[arrLength] = car;
			 arrLength += 1;
		 }
		 for (i = arrLength -1; i >=0 ; i--)
			 System.out.printf ("%d ",sim_fin[i]);
		 System.out.printf ("\n",sim_fin[i]);			 
	  }
	}