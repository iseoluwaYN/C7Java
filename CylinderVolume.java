import java.util.Scanner;
	public class CylinderVolume{
	public static void main(String... agrs){
		Scanner input = new Scanner(System.in);

	System.out.print(" Enter radius ");
	double radius = input.nextDouble();

	System.out.print(" Enter length ");
	double length = input.nextDouble() ;
	
	double area = (radius * radius * Math.PI);
	System.out.println(area);		
	 
	Double volume = (area * length);
	System.out.println(volume);
		
		

		}
	}