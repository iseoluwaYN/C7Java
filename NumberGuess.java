import java.util.Scanner;

public class NumberGuess{

       public static void main(String... agrs){

		int secreteNumber = 8;
		int firstGuess = 0 ;
		int guessNumber;
		
	
			Scanner guess = new Scanner(System.in);

			System.out.print( "Guess ! \n ps, number must be even number between 1-10: " );
			
			guessNumber = guess.nextInt();

                        if (guessNumber == sercreteNumber){
			    System.out.print("You guessed right!");
			}

			if(guessNumber < secreteNumber)
			System.out.print( "Try again, too low! \n 2 guesses left" );
			
			if (guessNumber > secreteNumber)
			System.out.print( "Try again, too high! \n 2 guesses left") ;

				
				guessNumber = guess.nextInt();

                        	if(guessNumber == secreteNumber){
				System.out.print("You guessed right!");
				}

				if(guessNumber < guessNumber){
				System.out.print( "Try again, too low! \n 1 guess left" );
				}
			
				if(guessNumber > guessNumber){
				System.out.print( "Try again, too high! \n 1 guess left") ;


					guessNumber = guess.nextInt();

                        		if(guessNumber == secreteNumber){
					System.out.print("You guessed right!");
					}

					if(guessNumber != secreteNumber){
					System.out.print( "Try again, too low! \n 1 guess left" );
					}
			
					
					}
			
		}	
	} 