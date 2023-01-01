package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.TransactionDatabase;
import sw.com.demo.Database.WalletTransactionsDatanase;
import sw.com.demo.model.Transaction;
import sw.com.demo.model.Wallet;

import java.util.ArrayList;
@Service
public class WalletBsl {


    TransactionBsl transactionBsl;
    TransactionDatabase transactionDatabase;
    WalletTransactionsDatanase walletTransactionsDatanase;
    Wallet wallet=new Wallet();

    public WalletBsl(TransactionBsl transactionBsl
            ,TransactionDatabase transactionDatabase,WalletTransactionsDatanase walletTransactionsDatanase) {
       this.walletTransactionsDatanase=walletTransactionsDatanase;
        this.transactionBsl = transactionBsl;
        this.transactionDatabase=transactionDatabase;
    }

    public WalletTransactionsDatanase getWalletTransactionsDatanase() {
        return walletTransactionsDatanase;
    }

    public void setWalletTransactionsDatanase(WalletTransactionsDatanase walletTransactionsDatanase) {
        this.walletTransactionsDatanase = walletTransactionsDatanase;
    }

    public TransactionDatabase getTransactionDatabase() {
        return transactionDatabase;
    }

    public void setTransactionDatabase(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }



    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }

    public String AddToWallet(Wallet w)
    {
        wallet.balance+=w.balance;
        walletTransactionsDatanase.walletTransactions.add(w);
        return "Funds has been added successfully ;)";

    }

    public ArrayList<Wallet> ReviewAddToWalletTransaction() {
        return walletTransactionsDatanase.walletTransactions;
    }

    public double pay(int id) {
        for (int i = 0; i < transactionBsl.transactionDatabase.transactions.size(); i++) {
            if(transactionBsl.transactionDatabase.transactions.get(i).getId()==id)
            {
                wallet.balance= wallet.balance-transactionBsl.transactionDatabase.transactions.get(i).getAmount();
                return transactionBsl.transactionDatabase.transactions.get(i).getAmount();
            }
        }
        return -1;
    }

    public double CheckBalance() {
        return wallet.balance;
    }


}
