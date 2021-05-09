package africa.semicolon.tddClass;

public class Account {
    private double myAccountBalance;
    private int accessNumber = 1738;
    public double getMyAccountBalance() {
        return myAccountBalance;
    }
    public void setMyAccountBalance(double myAccountBalance) {
        this.myAccountBalance = myAccountBalance;
    }


    public void deposit(double amountToDeposit) {
        boolean negativeDeposit = amountToDeposit < 0;
        if (negativeDeposit){
            amountToDeposit = 0;
        }
        else {
            myAccountBalance = myAccountBalance + amountToDeposit;
        }
    }

    public double withdraw(double amountToWithdraw, int accessNumber) {
        boolean negativeDeposit = amountToWithdraw < 0;
        boolean insufficientBalance = amountToWithdraw > myAccountBalance;
        if (accessNumber == 1738) {
            if(negativeDeposit) {
                System.out.println("Deposited!");
            }
            else if(insufficientBalance){
                System.out.println("Insufficient balance");
            }
            else{ myAccountBalance = myAccountBalance - amountToWithdraw;
            }
        }
        else {
            System.out.println("Incorrect PIN");
        }
        return myAccountBalance;
    }

}
