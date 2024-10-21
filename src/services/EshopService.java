package services;

import models.Customer;
import models.Payment;
import models.PaymentMethod;
import models.Product;

public interface EshopService {


    void register(Customer customer );
    double calculateProductPrice(Product product, int quantity);
     Payment pay(double amount, PaymentMethod paymentMethod);

    //view
    //search
    //compare
    //addToCart
    //checkCart
    //buy
    //discount
    //pay
    //refund
}
