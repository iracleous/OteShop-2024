import models.*;
import services.EshopHandler;
import services.EshopService;
import services.EshopServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      // EshopService service = new EshopServiceImpl();
      // service.work();


       Customer customer = new Customer();
       customer.setSurname("Ira");
        System.out.println(customer);


        EshopHandler.work();


    }
}