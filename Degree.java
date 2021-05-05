import java.util.Scanner;
public class Degree{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter temperature in Celsius") ;
		double celsiusDegree = input.nextDouble();

		double fahernheitDegree = ((9.0 /  5) * celsiusDegree  + 32);
		System.out.printf(" %.1f celsius is %.1f" , celsiusDegree, fahernheitDegree);
		
			
 			
		
		

		
			}


		}