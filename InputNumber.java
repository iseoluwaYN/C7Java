import java.util.Scanner;	

		public class InputNumber{

			public static void main(String... agrs){
			
			
			int one = 1;
			int zero = 0;
	
			Scanner input = new Scanner(System.in);

			System.out.print(" Enter a number! ");
			int number = input.nextInt();

			if(number == zero)
 			System.out.print(1);

			if(number == one)
			System.out.println(0);

			}	
		}