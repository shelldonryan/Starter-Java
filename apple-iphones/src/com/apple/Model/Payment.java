package com.apple.Model;

public class Payment {
    public String paymentMethod;
    public String numberOfCard;
    public String validity;
    public int cvv;
    public int installment;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void creditCard(String validity, String numberOfCard, int numberOfCvv, int numberOfInstallment) {
        if (paymentMethod.toLowerCase().equals("credit card")) {
            this.numberOfCard = numberOfCard;
            this.validity = validity;
            this.cvv = numberOfCvv;
            this.installment = numberOfInstallment;
        }
        else {
            System.out.println("You method isn't credit card");
        }
        
    }

    public double purchaseAmount(double value, int installment) {
        return value / this.installment;
    }
}  