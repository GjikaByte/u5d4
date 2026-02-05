package andi.u5d4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Table(name = "toppings")
@Getter
@Setter
@ToString
public class Topping extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_toppings;
    @Column(nullable = false)
    private String name;

    public Topping(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    protected Topping() {
        super(0, 0);
    }

}
