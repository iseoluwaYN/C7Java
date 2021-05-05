import java.util.Scanner;

	public class Comparison{
		public static void main(String... agrs){

   		 Scanner vet= new Scanner(System.in);
		
			/* int number1 = vet.nextInt();
			int number2 = vet.nextInt(); */
				//System.out.println(number1 > number2);

 			/* int number3 = vet.nextInt();
			int number4 = vet.nextInt();
				//if (number3 == number4) */
				//System.out.println("These number are equal" );

 			/*int number5 = vet.nextInt();
			int number6 = vet.nextInt();

				if (number5 > number6)
					System.out.printf("%d%s%d", number5, " is larger than ", number6);

			*/
			int largestNumber = vet.nextInt();
			int number2 = vet.nextInt();
			int number3 = vet.nextInt();

				if  (largestNumber < number2)
					largestNumber = number2;
				if (largestNumber < number3)
  					largestNumber = number3;    			

			System.out.println("The largest number is " + largestNumber);            
				

		}
	}