package sw.com.demo.controller;

import org.springframework.web.bind.annotation.*;
import sw.com.demo.BSL.TransactionBsl;
import sw.com.demo.BSL.WalletBsl;
import sw.com.demo.model.Transaction;
import sw.com.demo.model.Wallet;

import java.util.ArrayList;

@RestController
public class TransactionsController {

    private TransactionBsl transactionBsl ;
    private WalletBsl walletBsl;

    public TransactionsController(TransactionBsl transactionBsl, WalletBsl walletBsl) {
        this.transactionBsl=transactionBsl;
        this.walletBsl=walletBsl;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }

    public WalletBsl getWalletBsl() {
        return walletBsl;
    }

    public void setWalletBsl(WalletBsl walletBsl) {
        this.walletBsl = walletBsl;
    }
    // Review All System , Payment Transactions
    @RequestMapping(path = "/Admin/Review/Transactions",method = RequestMethod.GET)
    public ArrayList<Transaction> ReviewTransactions() {
        return transactionBsl.ReviewTransactions();
    }


    //Review Add to Wallet Transactions
    @RequestMapping(path = "/Admin/Review/AddToWallet/Transaction",method = RequestMethod.GET)
    public ArrayList<Wallet> ReviewAddToWalletTransaction() {
        return walletBsl.ReviewAddToWalletTransaction();
    }





}
