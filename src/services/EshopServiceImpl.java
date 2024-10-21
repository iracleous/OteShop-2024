package services;

import models.*;

public class EshopServiceImpl implements EshopService {

    private Product product;
    private Customer customer;
    private Payment payment;

    @Override
    public void register(Customer customer) {
        this.customer = customer;
    }

    @Override
    public double calculateProductPrice(Product product, int quantity) {
        this.product = product;
        return product.getPrice() * quantity
                - EshopHandler.discount(product.getPrice() * quantity);
    }

    @Override
    public Payment pay(double amount, PaymentMethod paymentMethod) {
        Payment payment;
//        switch (paymentMethod) {
//            case PaymentMethod.CASH :
//                payment = new PaymentCash();
//                break;
//            case PaymentMethod.CREDIT_CARD  :
//                payment =  new PaymentCreditCard();
//                break;
//            case PaymentMethod.INSTALLMENTS  :
//                payment = new PaymentInstallments();
//                break;
//            default :  return null;
//        }

//        if (paymentMethod == PaymentMethod.CASH){
//            payment = new PaymentCash();
//        }
//        else  if (paymentMethod == PaymentMethod.CREDIT_CARD){
//            payment = new PaymentCreditCard();
//        }
//        else  if (paymentMethod == PaymentMethod.INSTALLMENTS){
//            payment = new PaymentInstallments();
//        }
//        else {
//            return null;
//        }

       switch (paymentMethod) {
            case PaymentMethod.CASH ->
                    payment = new PaymentCash();
            case PaymentMethod.CREDIT_CARD  ->
                payment =  new PaymentCreditCard();
             case PaymentMethod.INSTALLMENTS  ->
                payment = new PaymentInstallments();
            default -> {
                        return null;
                    }
        }

        payment.setAmount(amount);
        this.payment = payment;
        return payment;
    }
}



