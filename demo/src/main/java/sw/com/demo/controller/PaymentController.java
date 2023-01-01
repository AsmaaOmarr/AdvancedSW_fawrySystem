package sw.com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sw.com.demo.BSL.CashBsl;
import sw.com.demo.BSL.CreditCardBsl;
import sw.com.demo.BSL.TransactionBsl;
import sw.com.demo.BSL.WalletBsl;

@RestController
public class PaymentController {
    TransactionBsl transactionBsl;
    CreditCardBsl creditCardBsl;
    CashBsl cashBsl;
    WalletBsl walletBsl;

    public PaymentController(TransactionBsl transactionBsl, CreditCardBsl creditCardBsl,CashBsl cashBsl,WalletBsl walletBsl) {
        this.transactionBsl = transactionBsl;
        this.creditCardBsl = creditCardBsl;
        this.cashBsl=cashBsl;
        this.walletBsl=walletBsl;
    }

    public CreditCardBsl getCreditCardBsl() {
        return creditCardBsl;
    }

    public void setCreditCardBsl(CreditCardBsl creditCardBsl) {
        this.creditCardBsl = creditCardBsl;
    }

    public CashBsl getCashBsl() {
        return cashBsl;
    }

    public void setCashBsl(CashBsl cashBsl) {
        this.cashBsl = cashBsl;
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

    @RequestMapping(path = "/User/pay/Credit/{id}",method = RequestMethod.GET)
    public Double  paycredit(@PathVariable("id") int id) {
        return creditCardBsl.pay(id);
    }

    @RequestMapping(path = "/User/pay/Cash/{id}",method = RequestMethod.GET)
    public Double  paycash(@PathVariable("id") int id) {
        return cashBsl.pay(id);
    }

    @RequestMapping(path = "/User/pay/Wallet/{id}",method = RequestMethod.GET)
    public Double  paywallet(@PathVariable("id") int id) {
        return walletBsl.pay(id);
    }
}
