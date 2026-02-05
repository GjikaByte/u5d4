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
        List<Topping> hamSalami = new ArrayList<>();

        Topping ham = (Topping) ctx.getBean("Ham");
        Topping salami = (Topping) ctx.getBean("Salami");

        toppingService.saveTopping(ham);
        toppingService.saveTopping(salami);

        hamSalami.add(ham);
        hamSalami.add(salami);

        Pizza pizzaHamSalami = new Pizza("Pizza HamSalami", hamSalami);
        pizzaService.savePizza(pizzaHamSalami);
    }
}
