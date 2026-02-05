package andi.u5d4.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table(name = "pizze")
@Getter
@Setter
@ToString
public class Pizza extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id_pizza;
    @Column
    private String name;
    @ManyToMany
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "id_pizza"),
            inverseJoinColumns = @JoinColumn(name = "id_topping")
    )
    private List<Topping> toppings;

    public Pizza( String name, List<Topping> toppings) {
        super(700, 13);
        this.name = name;
        this.toppings = toppings;
    }

    public Pizza(int calories, double price) {
        super(calories, price);
    }
}

