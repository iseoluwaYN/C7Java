import java.util.Scanner;

public class BodyMass{
	public static void main(String... agrs){
		Scanner mass = new Scanner (System.in); 
		
		System.out.println( "Your weight in pounds?" );
		double weightInPound = mass.nextDouble();
		System.out.println( "Your height in inches?" );
		double heightInInch = mass.nextDouble(); 

		double BMI = ( (weightInPound * 703) / (heightInInch* heightInInch) );
		System.out.println( BMI );

		if (BMI < 18.5)
		System.out.print( " BMI is underweight " );

		if (BMI >= 18.5)
			if (BMI <= 24.9)
		System.out.print( " BMI is normal " ); 

		if (BMI <= 29.9)
			if (BMI >=25)
		System.out.print( " BMI is overweight " );

		if (BMI >= 30)
		System.out.print( " BMI is obese " ); 


		}		
}