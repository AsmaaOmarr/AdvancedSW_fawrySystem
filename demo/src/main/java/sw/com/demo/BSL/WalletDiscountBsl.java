package sw.com.demo.BSL;

import org.springframework.stereotype.Service;
import sw.com.demo.Database.TransactionDatabase;

@Service
public class WalletDiscountBsl {

    WalletBsl walletBsl;
    TransactionBsl transactionBsl;
    TransactionDatabase transactionDatabase;


    public WalletDiscountBsl(WalletBsl walletBsl, TransactionBsl transactionBsl,TransactionDatabase transactionDatabase) {
        this.walletBsl = walletBsl;
        this.transactionBsl = transactionBsl;
        this.transactionDatabase=transactionDatabase;
    }

    public TransactionDatabase getTransactionDatabase() {
        return transactionDatabase;
    }

    public void setTransactionDatabase(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    public WalletBsl getWalletBsl() {
        return walletBsl;
    }

    public void setWalletBsl(WalletBsl walletBsl) {
        this.walletBsl = walletBsl;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }

    public double WalletDiscountBsl(int id)
    {
        double Discount= walletBsl.pay(id);
        double fundtoadd;
        for (int i = 0; i < transactionBsl.transactionDatabase.transactions.size(); i++) {
            if(transactionBsl.transactionDatabase.transactions.get(i).getId()==id)
            {
                if((transactionBsl.transactionDatabase.transactions.get(i).isFirstUse()==true)&&(transactionBsl.transactionDatabase.transactions.get(i).getServiceName().equals("mobile")))
                {
                    fundtoadd=Discount*0.30;
                    Discount=Discount*0.70;
                    walletBsl.wallet.balance+=fundtoadd;
                    return Discount;
                }
                else if(transactionBsl.transactionDatabase.transactions.get(i).isFirstUse()==true)
                {
                    fundtoadd=Discount*0.10;
                    Discount=Discount*0.90;
                    walletBsl.wallet.balance+=fundtoadd;
                    return Discount;
                }
                else if(transactionBsl.transactionDatabase.transactions.get(i).getServiceName().equals("mobile"))
                {
                    fundtoadd=Discount*0.10;
                    Discount=Discount*0.80;
                    walletBsl.wallet.balance+=fundtoadd;
                    return Discount;
                }
            }
        }
        return -1;
    }
}
