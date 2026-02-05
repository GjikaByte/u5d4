package andi.u5d4.runners;

import andi.u5d4.entities.Menu;
import andi.u5d4.entities.Ordine;
import andi.u5d4.entities.Pizza;
import andi.u5d4.entities.Topping;
import andi.u5d4.repositories.ToppingsRepository;
import andi.u5d4.services.PizzaService;
import andi.u5d4.services.ToppingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    private final ApplicationContext ctx;
    private final PizzaService pizzaService;
    private ToppingService toppingService;

    public MyRunner(ApplicationContext ctx, PizzaService pizzaService, ToppingService toppingService) {
        this.ctx = ctx;
        this.pizzaService = pizzaService;
        this.toppingService = toppingService;
    }

    @Override
    public void run(String... args) throws Exception {
//        Menu menu = ctx.getBean(Menu.class);
//        menu.printMenu();
//
//        Ordine ordine = ctx.getBean(Ordine.class);
//        System.out.println(ordine);
//        List<Topping> hamSalami = new ArrayList<>();
//        List<Topping> hamPineapple = new ArrayList<>();
//
//
//        Topping ham = (Topping) ctx.getBean("Ham");
//        Topping salami = (Topping) ctx.getBean("Salami");
//        Topping pineapple = (Topping) ctx.getBean("Pineapple");
//
//
//        toppingService.saveTopping(ham);
//        toppingService.saveTopping(salami);
//        toppingService.saveTopping(pineapple);
//
//
//        Topping hamDB = toppingService.findById(1);
//        Topping salamiDB = toppingService.findById(2);
//        Topping pineappleDB = toppingService.findById(3);
//
//        hamSalami.add(hamDB);
//        hamSalami.add(salamiDB);
//
//        hamPineapple.add(hamDB);
//        hamPineapple.add(pineappleDB);
//
//        Pizza pizzaHamSalami = new Pizza("Pizza HamSalami", hamSalami);
//        Pizza pizzaHawaiian = new Pizza("Pizza Hawaiian", hamPineapple);

//        pizzaService.savePizza(pizzaHamSalami);
//        pizzaService.savePizza(pizzaHawaiian);
//        toppingService.findByIdAndDelete(4);
//        toppingService.findByIdAndDelete(5);
//        toppingService.findByIdAndDelete(6);
    }
}
