package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.TransactionDatabase;
import sw.com.demo.model.Transaction;

import java.util.ArrayList;
@Service
public class TransactionBsl {

    public TransactionDatabase transactionDatabase = new TransactionDatabase();

    public TransactionBsl(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    public TransactionDatabase getTransactionDatabase() {
        return transactionDatabase;
    }

    public void setTransactionDatabase(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    public String AddService(Transaction transaction) {

        transactionDatabase.transactions.add(transaction);
        return "Your Transaction Added To System Successfully";
    }

    public ArrayList<Transaction> ReviewTransactions() {
        return transactionDatabase.transactions;
    }








}




