package andi.u5d4.runners;

import andi.u5d4.entities.Menu;
import andi.u5d4.entities.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final ApplicationContext ctx;

    public MyRunner(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {
        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();

        Ordine ordine = ctx.getBean(Ordine.class);
        System.out.println(ordine);

    }
}
