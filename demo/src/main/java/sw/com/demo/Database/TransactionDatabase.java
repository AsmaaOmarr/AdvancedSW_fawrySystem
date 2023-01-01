package sw.com.demo.Database;

import org.springframework.stereotype.Service;
import sw.com.demo.model.Transaction;

import java.util.ArrayList;
@Service
public class TransactionDatabase {

    public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    public TransactionDatabase(){
        this.transactions=new ArrayList<Transaction>();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
