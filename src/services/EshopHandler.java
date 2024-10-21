package services;

import models.Customer;
import models.Payment;
import models.PaymentCash;
import models.Product;

public class EshopHandler {

    private static final double PRICE_LIMIT_1  = 10;
    private static final double PRICE_LIMIT_2 = 100;
    private static final double PERCENTAGE_1 = 0.1;
    private static final double PERCENTAGE_2 = 0.2;
    private static final double ZERO = 0;

    public static void work() {
        System.out.println("hello world");

        Customer customer = new Customer();
        customer.setAddress("Athens");
        customer.setSurname("Irac");

        Product product = new Product();
        product.setPrice(20.00);
        product.setName("chips");

        double fpa = 0.24;
        Payment payment = new PaymentCash();
        payment.setCustomer(customer);
        payment.setAmount(product.getPrice()*(1+fpa));

        System.out.println(payment.getAmount());

    }



    public static double discount(double price){
        if (price < PRICE_LIMIT_1)
            return ZERO;
        if (price < PRICE_LIMIT_2)
            return PERCENTAGE_1 * price;
        return PERCENTAGE_2 * price;
    }
    public static double discountChristmas(double price){
        if (price < PRICE_LIMIT_2)
            return ZERO;
        return PERCENTAGE_1 * price;
    }

}
