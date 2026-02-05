package andi.u5d4.entities;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfig {
    @Bean(name = "toppings_tomato")
    public Topping toppingTomato() {
        return new Topping(0, 0,"Tomato");
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheese() {
        return new Topping( 92, 1.2,"Cheese");
    }

    @Bean (name= "Salami")
    public Topping toppingSalami() { return new Topping (123,1.3, "Salami");}

    @Bean (name = "Ham")
    public Topping toppingHam() {
        return new Topping(35,0.99,"Ham");
    }
    @Bean (name="Pineapple")
    public Topping toppingPineapple(){
        return new Topping(24,0.79,"Pineapple");
    }
    @Bean(name="Onion")
    public Topping toppingOnions(){
        return new Topping(22,0.69,"Onions");
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargherita() {
        List<Topping> toppingsList = new ArrayList<>();
        toppingsList.add(toppingTomato());
        toppingsList.add(toppingCheese());
        return new Pizza("Pizza Margherita", toppingsList);
    }

    @Bean
    public Pizza pizzaHawaiian(){
        List<Topping> toppingsList = new ArrayList<>();
        toppingsList.add(toppingTomato());
        toppingsList.add(toppingCheese());
        toppingsList.add(toppingHam());
        toppingsList.add(toppingPineapple());
        return new Pizza("Hawaiian Pizza",toppingsList);
    }


    @Bean (name="pizza_salami")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomato());
        tList.add(toppingCheese());
        tList.add(toppingSalami());
        return new Pizza("Pizza Salami", tList);
    }

    @Bean(name= "Water")
    public Drink drinkWater(){
        return new Drink(0,1.29,"Water");
    }
    public Drink drinkLemonade(){return new Drink(128,1.29,"Lemonade");}
    public Drink drinkWine(){ return new Drink (607,7.49, "Wine");}

    @Bean
    public List<Pizza> pizzaList(){
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(pizzaMargherita());
        pizze.add(pizzaSalamiBean());
        pizze.add(pizzaHawaiian());
        return pizze;
    }

    @Bean
    public List<Drink> drinksList(){
        List<Drink> drinks = new ArrayList<>();
        drinks.add(drinkWater());
        drinks.add(drinkLemonade());
        drinks.add(drinkWine());
        return drinks;
    }

    @Bean
    public Tavolo tavolo1(){
        return new Tavolo(StatoTavolo.LIBERO,4,1 );
    }

    @Bean
    public Ordine ordine1 (@Value("${prezzo_coperto}") double prezzoCoperto){
        List<Item> itemsOrdine = new ArrayList<>();
        itemsOrdine.add(drinkWater());
        itemsOrdine.add(drinkWater());
        itemsOrdine.add(drinkWater());
        itemsOrdine.add(pizzaHawaiian());
        itemsOrdine.add(pizzaHawaiian());
        itemsOrdine.add(pizzaHawaiian());
        return new Ordine(tavolo1(),itemsOrdine,1,StatoOrdine.IN_CORSO,3, LocalDate.now(), prezzoCoperto);
    }
}