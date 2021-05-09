package africa.semicolon.tddClass;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int digitOne, int digitTwo) {
        return digitOne * digitTwo;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber){
            firstNumber =  firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }
        System.out.println(firstNumber + " " + secondNumber );
        return firstNumber - secondNumber;
    }


    public int difference(int initialNumber, int finalNumber) {
        if(initialNumber < finalNumber){
         int   introducedNumber = finalNumber;
         finalNumber = initialNumber;
         initialNumber = introducedNumber;
        }
        System.out.println(initialNumber + " "+ finalNumber);
        return initialNumber - finalNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        int result = 0;
        if(secondNumber == 0) {
            result = 0;
        }
        if (firstNumber == 0){
            result = 0;
        }
        if(secondNumber != 0) {
            result = firstNumber / secondNumber;
        }
        return result;
    }
}


