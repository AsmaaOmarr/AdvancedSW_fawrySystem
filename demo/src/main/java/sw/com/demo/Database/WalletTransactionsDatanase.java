package sw.com.demo.Database;

import org.springframework.stereotype.Service;
import sw.com.demo.model.Wallet;

import java.util.ArrayList;

@Service
public class WalletTransactionsDatanase {

    public ArrayList<Wallet> walletTransactions = new ArrayList<Wallet>() ;

    public WalletTransactionsDatanase(ArrayList<Wallet> walletTransactions) {
        this.walletTransactions = new ArrayList<Wallet>();
    }

    public ArrayList<Wallet> getWalletTransactions() {
        return walletTransactions;
    }

    public void setWalletTransactions(ArrayList<Wallet> walletTransactions) {
        this.walletTransactions = walletTransactions;
    }
}
