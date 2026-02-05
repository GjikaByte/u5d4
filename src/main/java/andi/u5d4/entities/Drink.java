package andi.u5d4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Drink extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_drink;
    @Column(nullable = false)
    private String name;

    public Drink(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

}
