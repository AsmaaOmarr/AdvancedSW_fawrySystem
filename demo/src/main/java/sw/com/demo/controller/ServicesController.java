package sw.com.demo.controller;

import org.springframework.web.bind.annotation.*;
import sw.com.demo.BSL.TransactionBsl;
import sw.com.demo.model.Transaction;

@RestController
public class ServicesController {

    private TransactionBsl transactionBsl;

    public ServicesController(TransactionBsl transactionBsl) {
        this.transactionBsl=transactionBsl;
    }

    public TransactionBsl getTransactionBsl() {
        return transactionBsl;
    }

    public void setTransactionBsl(TransactionBsl transactionBsl) {
        this.transactionBsl = transactionBsl;
    }

    @RequestMapping(value ="/User/Service/Communications",method = RequestMethod.POST)
    public String CommunicationsServiceProviders(@RequestBody Transaction transaction) {
        return transactionBsl.AddService(transaction);
    }

    @RequestMapping(value = "/User/Service/Donations",method = RequestMethod.POST)
    public String DonationsService(@RequestBody Transaction transaction) {

        return transactionBsl.AddService(transaction);
    }
    @RequestMapping(value = "/User/Service/Landline",method = RequestMethod.POST)
    public String LandlineService(@RequestBody Transaction transaction) {

        return transactionBsl.AddService(transaction);
    }









}







