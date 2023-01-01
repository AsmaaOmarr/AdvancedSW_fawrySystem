package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.TransactionDatabase;

@Service
public class CreditcardDiscountBsl {

    CreditCardBsl creditCardBsl;
    TransactionBsl transactionBsl;
    TransactionDatabase transactionDatabase;

    public CreditcardDiscountBsl(CreditCardBsl creditCardBsl, TransactionBsl transactionBsl,TransactionDatabase transactionDatabase) {
        this.creditCardBsl = creditCardBsl;
        this.transactionBsl=transactionBsl;
        this.transactionDatabase=transactionDatabase;
    }

    public TransactionDatabase getTransactionDatabase() {
        return transactionDatabase;
    }

    public void setTransactionDatabase(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    public CreditCardBsl getCreditCardBsl() {
        return creditCardBsl;
    }

    public void setCreditCardBsl(CreditCardBsl creditCardBsl) {
        this.creditCardBsl = creditCardBsl;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }

    public double CreditcardDiscountBsl(int id)
    {
        double Discount=creditCardBsl.pay(id);
        for (int i = 0; i < transactionBsl.transactionDatabase.transactions.size(); i++) {
            if(transactionBsl.transactionDatabase.transactions.get(i).getId()==id)
            {
                if((transactionBsl.transactionDatabase.transactions.get(i).isFirstUse()==true)&&(transactionBsl.transactionDatabase.transactions.get(i).getServiceName().equals("mobile")))
                {
                    Discount=Discount*0.70;
                    return Discount;
                }
                else if(transactionBsl.transactionDatabase.transactions.get(i).isFirstUse()==true)
                {
                    Discount=Discount*0.90;
                    return Discount;
                }
                else if(transactionBsl.transactionDatabase.transactions.get(i).getServiceName().equals("mobile"))
                {
                    Discount=Discount*0.80;
                    return Discount;
                }
            }
        }
        return -1;


    }
}

