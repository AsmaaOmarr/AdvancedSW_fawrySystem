package sw.com.demo.controller;

import org.springframework.web.bind.annotation.*;
import sw.com.demo.BSL.RefundRequestBsl;
import sw.com.demo.model.Transaction;

import java.util.ArrayList;
@RestController
public class RefundRequestController {

    private RefundRequestBsl refundRequestBsl ;

    public RefundRequestController(RefundRequestBsl refundRequestBsl) {
        this.refundRequestBsl = refundRequestBsl;
    }

    public RefundRequestBsl getRefundRequestBsl() {
        return refundRequestBsl;
    }

    public void setRefundRequestBsl(RefundRequestBsl refundRequestBsl) {
        this.refundRequestBsl = refundRequestBsl;
    }

    @RequestMapping(value = "/User/Make/RefundRequest/{id}",method = RequestMethod.GET)
    public String makerefundrequest(@PathVariable("id") int id) {
        return refundRequestBsl.MakeRefundRequest(id);
    }

    @RequestMapping(path = "/Admin/Check/RefundRequests",method = RequestMethod.GET)
    public ArrayList<Transaction> checkRefundRequests() {
        return refundRequestBsl.CheckRefundRequests();
    }

    @DeleteMapping(value = "/Admin/Accept/RefundRequest/{id}")
    public String AcceptRefundRequest(@PathVariable("id") int id) {

        return refundRequestBsl.AcceptRefundRequest(id);
    }
    @DeleteMapping(value = "/Admin/Reject/RefundRequest/{id}")
    public String RejectRefundRequest(@PathVariable("id") int id) {

        return refundRequestBsl.RejectRefundRequest(id);
    }
}
