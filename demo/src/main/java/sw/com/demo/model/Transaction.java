package sw.com.demo.model;

import lombok.Data;

@Data
public class Transaction {


    public int id;
    public boolean FirstUse;
    public String phoneNumber;
    public String  ServiceName;
    public String ServiceProvider="";
    public double amount;
    public String PaymentWay;
    public String FoundationeName="";
    public boolean RefundStatus = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFirstUse() {
        return FirstUse;
    }

    public void setFirstUse(boolean firstUse) {
        FirstUse = firstUse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getServiceProvider() {
        return ServiceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        ServiceProvider = serviceProvider;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentWay() {
        return PaymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        PaymentWay = paymentWay;
    }

    public String getFoundationeName() {
        return FoundationeName;
    }

    public void setFoundationeName(String foundationeName) {
        FoundationeName = foundationeName;
    }

    public boolean isRefundStatus() {
        return RefundStatus;
    }

    public void setRefundStatus(boolean refundStatus) {
        RefundStatus = refundStatus;
    }
}



