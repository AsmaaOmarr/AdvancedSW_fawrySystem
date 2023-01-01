package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.TransactionDatabase;

@Service
public class CashBsl {
    TransactionBsl transactionBsl;
    TransactionDatabase transactionDatabase;
    public CashBsl(TransactionBsl transactionBsl,TransactionDatabase transactionDatabase) {
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
                return transactionBsl.transactionDatabase.transactions.get(i).getAmount();
            }
        }
        return -1;

    }
}
