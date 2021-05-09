package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testThatAccountCanDepositOnce(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(850.00);
        //confirm
        double janet = janetAccount.getMyAccountBalance();
        assertEquals(850,janet);
    }

    @Test
    public void testThatAccountCanWithdraw(){
        Account janetAccount = new Account();
        janetAccount.setMyAccountBalance(1000.00);
        janetAccount.withdraw(150, 1738);
        double janet = janetAccount.getMyAccountBalance();
        assertEquals(800, janet);
    }






}
