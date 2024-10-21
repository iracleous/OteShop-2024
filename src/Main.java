import models.Customer;
import models.PaymentCash;
import models.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Customer customer = new Customer();
        customer.setAddress("Athens");
        customer.setSurname("Irac");

        Product product = new Product();
        product.setPrice(20.00);
        product.setName("chips");

        double fpa = 0.24;
        PaymentCash payment = new PaymentCash();
        payment.setCustomer(customer);
        payment.setAmount(product.getPrice()*(1+fpa));

        System.out.println(payment.getAmount());


    }
}