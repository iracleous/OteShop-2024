package services;

import models.Customer;
import models.Payment;
import models.PaymentCash;
import models.Product;

public class EshopServiceImpl implements EshopService {
    @Override
    public void buy() {

    }

    @Override
    public void work() {
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


}
