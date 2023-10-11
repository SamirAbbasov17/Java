import java.sql.Date;

public class Transactions extends BaseEntity{
    private String Name;
    private Date TransactionTime;
    private double Amount;
    private String TransactionCode;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getTransactionTime() {
        return TransactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        TransactionTime = transactionTime;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getTransactionCode() {
        return TransactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        TransactionCode = transactionCode;
    }
}
