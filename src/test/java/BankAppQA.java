import org.junit.Assert;
import org.junit.Test;

public class BankAppQA {

    @Test
    public void methodeToSeeIfWithdrawalShrinksTheAmountOfMoney(){
        AccountDetails details = new AccountDetails();
        details.setBalance(100);
        long expectedResult = details.getBalance();
        Assert.assertEquals(105,details.getBalance());



    }
}
