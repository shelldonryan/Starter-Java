package com.apple.Main;

import com.apple.Model.BuyIphone;
import com.apple.Model.Payment;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nProgramação Orientada a objeto, Apple\n");

        System.out.println("Select features of the iphone\n");
        BuyIphone features = new BuyIphone("Iphone 14 pro max", "Silver", 256, 11499.00);

        System.out.printf("Your Model: %s\n", features.model);
        System.out.printf("Your Color: %s\n", features.color);
        System.out.printf("Your Storage: %dgb\n", features.storage);
        System.out.printf("The value of the iphone: R$ %.2f\n", features.value);

        features.inputCep(51102346);

        if (features.delivery() == true) {
            System.out.printf("\nYour CEP - %d - is valid", features.cep);
            features.putInBag();
            System.out.printf("\nYour Bag: %d\n", features.iphoneInBag);
        }
        else {
            System.out.printf("\nYour CEP - %d - is invalid\n", features.cep);
        }

        System.out.println("\nSelect form of the Payment\n");
        Payment order = new Payment("Credit card");

        order.creditCard("12/08", "1234 5678 9123 4567", 12, 12);

        System.out.printf("Method of Payment: %s\n", order.paymentMethod);
        System.out.println("\nCard Details");
        System.out.printf("Number of Card: %s\n", order.numberOfCard);
        System.out.printf("Your validity: %s\n", order.validity);
        System.out.printf("Your number of CVV: %d\n", order.cvv);
        
        double dividerValue = order.purchaseAmount(features.value, order.installment);

        System.out.printf("\nTotal Value: R$ %.2f\n", features.value);
        System.out.printf("Amount of installments: %d\n", order.installment);
         System.out.printf("The number of the installment: R$ %.2f\n", dividerValue);
    }
}
