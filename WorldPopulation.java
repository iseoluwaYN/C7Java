import java.util.Scanner;
	public class WorldPopulation{
		public static void main(String[] agrs){

		Scanner population = new Scanner(System.in);
		
		int yearOne ;
		int yearTwo ;
		int yearThree ;
		
		System.out.printf("Enter world population");
		int worldPopulation = population.nextInt();

		System.out.printf("Enter Growth Rate");
		int growthRate = population.nextInt();

		int newPopulation = ((worldPopulation / growthRate) * 100 );
		System.out.println( newPopulation);
		}
	}