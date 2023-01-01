package sw.com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sw.com.demo.BSL.*;
import sw.com.demo.Database.TransactionDatabase;

@RestController
public class DiscountController {
    CashDiscountBsl cashDiscountBsl;
    CreditcardDiscountBsl creditcardDiscountBsl;

    WalletDiscountBsl walletDiscountBsl;
    TransactionBsl transactionBsl;
    CashBsl cashBsl;
    CreditCardBsl creditCardBsl;
    WalletBsl walletBsl;
    TransactionDatabase transactionDatabase;


    public DiscountController(CashDiscountBsl cashDiscountBsl, CreditcardDiscountBsl creditcardDiscountBsl,
                              WalletDiscountBsl walletDiscountBsl, TransactionBsl transactionBsl,
                              CashBsl cashBsl, CreditCardBsl creditCardBsl, WalletBsl walletBsl,
                              TransactionDatabase transactionDatabase) {
        this.cashDiscountBsl = cashDiscountBsl;
        this.creditcardDiscountBsl = creditcardDiscountBsl;
        this.walletDiscountBsl = walletDiscountBsl;
        this.transactionBsl = transactionBsl;
        this.cashBsl = cashBsl;
        this.creditCardBsl = creditCardBsl;
        this.walletBsl = walletBsl;
        this.transactionDatabase=transactionDatabase;
    }

    public TransactionDatabase getTransactionDatabase() {
        return transactionDatabase;
    }

    public void setTransactionDatabase(TransactionDatabase transactionDatabase) {
        this.transactionDatabase = transactionDatabase;
    }

    public CashDiscountBsl getCashDiscountBsl() {
        return cashDiscountBsl;
    }

    public void setCashDiscountBsl(CashDiscountBsl cashDiscountBsl) {
        this.cashDiscountBsl = cashDiscountBsl;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }

    public CashBsl getCashBsl() {
        return cashBsl;
    }

    public void setCashBsl(CashBsl cashBsl) {
        this.cashBsl = cashBsl;
    }

    public CreditcardDiscountBsl getCreditcardDiscountBsl() {
        return creditcardDiscountBsl;
    }

    public void setCreditcardDiscountBsl(CreditcardDiscountBsl creditcardDiscountBsl) {
        this.creditcardDiscountBsl = creditcardDiscountBsl;
    }

    public CreditCardBsl getCreditCardBsl() {
        return creditCardBsl;
    }

    public void setCreditCardBsl(CreditCardBsl creditCardBsl) {
        this.creditCardBsl = creditCardBsl;
    }

    public WalletDiscountBsl getWalletDiscountBsl() {
        return walletDiscountBsl;
    }

    public void setWalletDiscountBsl(WalletDiscountBsl walletDiscountBsl) {
        this.walletDiscountBsl = walletDiscountBsl;
    }

    public WalletBsl getWalletBsl() {
        return walletBsl;
    }

    public void setWalletBsl(WalletBsl walletBsl) {
        this.walletBsl = walletBsl;
    }

    @RequestMapping(path = "/User/Get/CashDiscount/{id}",method = RequestMethod.GET)
    public Double  CashDiscount(@PathVariable("id") int id) {
        return cashDiscountBsl.CashDiscountBsl(id);
    }

    @RequestMapping(path = "/User/Get/creditCardDiscount/{id}",method = RequestMethod.GET)
    public Double  CardDiscount(@PathVariable("id") int id) {
        return creditcardDiscountBsl.CreditcardDiscountBsl(id);
    }

    @RequestMapping(path = "/User/Get/walletDiscount/{id}",method = RequestMethod.GET)
    public Double  walletDiscount(@PathVariable("id") int id) {
        return walletDiscountBsl.WalletDiscountBsl(id);
    }
}
