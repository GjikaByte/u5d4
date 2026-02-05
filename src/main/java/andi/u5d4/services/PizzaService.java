package andi.u5d4.services;

import andi.u5d4.entities.Pizza;
import andi.u5d4.exceptions.NotFoundException;
import andi.u5d4.exceptions.ValidationException;
import andi.u5d4.repositories.PizzeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class PizzaService {

    private final PizzeRepository pizzeRepository;

    @Autowired
    public PizzaService(PizzeRepository pizzeRepository) {
        this.pizzeRepository = pizzeRepository;
    }

    public void savePizza(Pizza newPizza) {
        if (newPizza.getName().length() < 2) throw new ValidationException("Il nome non può essere più corto di 2 caratteri");
        this.pizzeRepository.save(newPizza);
        log.info("La pizza " + pizzeRepository + " è stata salvata correttamente"); // Alternativa più PRO ai normali system out
    }
    public Pizza findById(long pizzaId) {

        return pizzeRepository.findById(pizzaId).orElseThrow(() -> new NotFoundException(pizzaId));
    }

    public void findByIdAndUpdate(long userId, Pizza upupdatePizza) {
        Pizza found = this.findById(userId);

        found.setName(upupdatePizza.getName());

        this.savePizza(found);

        log.info("La pizza " + found.getId_pizza() + " è stata modificata correttamente");
    }

    public void findByIdAndDelete(long userId) {
        Pizza found = this.findById(userId);
        pizzeRepository.delete(found);
        log.info("La pizza " + found.getId_pizza() + " è stata cancellata correttamente");
    }
}
