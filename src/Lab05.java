import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Enter Number One
		System.out.println("Enter Number one here : ");
	    String number_one = scanner.nextLine();
	    
		//Enter Number Two
		System.out.println("Enter Number two here : ");
	    String number_two = scanner.nextLine();
		 
		//Array 1
		int[] revNumberOne = new int [64];
		char test_1 [] = number_one.toCharArray();
		int len1 = number_one.length();
		int i = 0;
		int j = len1 -1;
		while (true)
		{
			int tmp = Character.getNumericValue(test_1[j]);
			revNumberOne [i] = tmp;
			i++;
			j--;
			if (j < 0)
				break;
		}
		for (i = 0; i < len1; i++)
			 System.out.printf ("%d ",revNumberOne[i]);
		System.out.printf ("\n");
		 
		//Array 2
		int[] revNumberTwo = new int [64];
		char test_2 [] = number_two.toCharArray();
		int len2 = number_two.length();
		 i = 0;
		 j = len2 -1;
		 while (true)
		 {
			 int tmp = Character.getNumericValue(test_2[j]);
			 revNumberTwo [i] = tmp;
			 i++;
			 j--;
			 if (j < 0)
				 break;
		 }
		 for (i = 0; i < len2; i++)
			 System.out.printf ("%d ",revNumberTwo[i]);
		 System.out.printf ("\n");
			 
			 
		 int [] arr1 = new int [64];
		 int car = 0;
		 int arrLength = 0;
		 if (len1 >= len2)
			 arrLength = len1;
		 else
			 arrLength = len2;
		 for (i = 0; i < arrLength; i++)
		 {
			 int one = revNumberOne [i] + revNumberTwo[i];
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
			 arr1 [i] = sing + car;
			 car = dec;
		 }
		 if (car == 1){
			 arr1[arrLength] = car;
			 arrLength += 1;
		 }
		 for (i = arrLength -1; i >=0 ; i--)
			 System.out.printf ("%d ",arr1[i]);
		 System.out.printf ("\n");			 
	  }
}
