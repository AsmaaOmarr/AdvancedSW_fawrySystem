package sw.com.demo.Database;

import org.springframework.stereotype.Service;
import sw.com.demo.model.Transaction;

import java.util.ArrayList;
@Service
public class RefundRequestTransactionsDatabase {

    public ArrayList<Transaction> refundtransactions = new ArrayList<Transaction>();

    public RefundRequestTransactionsDatabase(ArrayList<Transaction> refundtransactions) {
        this.refundtransactions =new ArrayList<Transaction>();
    }

    public ArrayList<Transaction> getRefundtransactions() {
        return refundtransactions;
    }

    public void setRefundtransactions(ArrayList<Transaction> refundtransactions) {
        this.refundtransactions = refundtransactions;
    }
}
