import java.util.Scanner;

public class Circle{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);

		System.out.println("Print a radius to find its diameter!");
		int radius = input.nextInt();
		
		double diameter = (2 * radius);
		System.out.printf("%.2f",diameter);

		double circumference = (2 * radius * Math.PI);
		System.out.printf("%.2f",circumference);
		
		
		double area = (radius * radius * Math.PI);
		System.out.printf("%.2f", area);

		}
	}