package sw.com.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sw.com.demo.BSL.WalletBsl;
import sw.com.demo.Database.WalletTransactionsDatanase;
import sw.com.demo.model.Wallet;
@RestController
public class WalletController {
    private WalletBsl walletBsl;
    WalletTransactionsDatanase walletTransactionsDatanase;


    public WalletController(WalletBsl walletBsl,WalletTransactionsDatanase walletTransactionsDatanase) {
        this.walletBsl = walletBsl;
        this.walletTransactionsDatanase=walletTransactionsDatanase;
    }

    public WalletTransactionsDatanase getWalletTransactionsDatanase() {
        return walletTransactionsDatanase;
    }

    public void setWalletTransactionsDatanase(WalletTransactionsDatanase walletTransactionsDatanase) {
        this.walletTransactionsDatanase = walletTransactionsDatanase;
    }

    public WalletBsl getWalletBsl() {
        return walletBsl;
    }

    public void setWalletBsl(WalletBsl walletBsl) {
        this.walletBsl = walletBsl;
    }

    @RequestMapping(value = "/User/AddToWallet",method = RequestMethod.POST)
    public String AddToWallet(@RequestBody Wallet wallet) {
        return walletBsl.AddToWallet(wallet);
    }

    @RequestMapping(value = "/User/CheckBalance",method = RequestMethod.GET)
    public Double CheckBalance() {
        return walletBsl.CheckBalance();
    }
}
