import java.util.Scanner;

	public class SquarenCube{
		public static void main(String[] agrs){

		Scanner input = new Scanner(System.in);

		System.out.println("Input random number!");
		int random = input.nextInt();

		System.out.print("Square");
		int square = ( random * random);
		System.out.println( square);

		System.out.print("Cube");
		int cube = ( random * random * random);
		System.out.println( cube);
			}
		}