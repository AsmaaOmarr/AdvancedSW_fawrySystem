package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.RefundRequestTransactionsDatabase;
import sw.com.demo.Database.TransactionDatabase;
import sw.com.demo.model.Transaction;

import java.util.ArrayList;
@Service
public class RefundRequestBsl {

    private TransactionBsl transactionBsl;
    TransactionDatabase transactionDatabase;
    RefundRequestTransactionsDatabase refundRequestTransactionsDatabase;


    public RefundRequestBsl(TransactionBsl transactionBsl,TransactionDatabase transactionDatabase,RefundRequestTransactionsDatabase refundRequestTransactionsDatabase) {
        this.transactionBsl = transactionBsl;
        this.transactionDatabase=transactionDatabase;
        this.refundRequestTransactionsDatabase=refundRequestTransactionsDatabase;
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

    public String MakeRefundRequest(int id)
    {
        for (int i = 0; i < transactionBsl.transactionDatabase.transactions.size(); i++) {

            if(transactionBsl.transactionDatabase.transactions.get(i).getId()==id)
            {
                transactionBsl.transactionDatabase.transactions.get(i).setRefundStatus(true);
                return "your request has been sent to admin to check it";
            }
        }
        return null;

    }
    public ArrayList<Transaction> CheckRefundRequests()
    {
        for (int i = 0; i < transactionBsl.transactionDatabase.transactions.size(); i++)
        {
            if(transactionBsl.transactionDatabase.transactions.get(i).isRefundStatus()==true)
            {
                refundRequestTransactionsDatabase.refundtransactions.add(transactionBsl.transactionDatabase.transactions.get(i));
            }
        }
        return refundRequestTransactionsDatabase.refundtransactions;
    }

    public String AcceptRefundRequest(int id)
    {
        for (int i = 0; i < refundRequestTransactionsDatabase.refundtransactions.size(); i++)
        {
            if(refundRequestTransactionsDatabase.refundtransactions.get(i).getId()==id)
            {
                refundRequestTransactionsDatabase.refundtransactions.remove(i);
                transactionBsl.transactionDatabase.transactions.remove(i);
                return "This Refund Request Transaction Accepted";
            }
        }
        return "null";

    }

    public String RejectRefundRequest(int id)
    {
        for (int i = 0; i < refundRequestTransactionsDatabase.refundtransactions.size(); i++)
        {
            if(refundRequestTransactionsDatabase.refundtransactions.get(i).getId()==id)
            {
                refundRequestTransactionsDatabase.refundtransactions.remove(i);
                transactionBsl.transactionDatabase.transactions.get(i).setRefundStatus(false);
                return "This Refund Request Transaction Rejected";
            }
        }
        return "null";

    }
}
