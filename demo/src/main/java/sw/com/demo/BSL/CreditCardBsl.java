package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.TransactionDatabase;
import sw.com.demo.model.CreditCard;
import sw.com.demo.model.Transaction;
@Service
public class CreditCardBsl {


    TransactionBsl transactionBsl ;
    TransactionDatabase transactionDatabase;
    public CreditCard card = new CreditCard(1000000.0);


    public CreditCardBsl(TransactionBsl transactionBsl,TransactionDatabase transactionDatabase) {
        this.transactionBsl = transactionBsl;
        this.transactionDatabase=transactionDatabase;

    }

    public TransactionDatabase getTransactionDatabase() {
        return transactionDatabase;
    }

    public void setTransactionDatabase(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }




    public double pay(int id) {
        for (int i = 0; i < transactionBsl.transactionDatabase.transactions.size(); i++) {
            if(transactionBsl.transactionDatabase.transactions.get(i).getId()==id)
            {
                card.balance= card.balance-transactionBsl.transactionDatabase.transactions.get(i).getAmount();
                return transactionBsl.transactionDatabase.transactions.get(i).getAmount();
            }
        }
        return -1;

    }


}
