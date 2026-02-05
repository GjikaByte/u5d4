package andi.u5d4.services;

import andi.u5d4.entities.Topping;
import andi.u5d4.exceptions.ValidationException;
import andi.u5d4.repositories.ToppingsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingService {

    private final ToppingsRepository toppingRepository;

    @Autowired
    public ToppingService(ToppingsRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }

    public void saveTopping(Topping newTopping) {
        if (newTopping.getName() == null || newTopping.getName().length() < 2) {
            throw new ValidationException("Il nome del topping non può essere più corto di 2 caratteri");
        }
        this.toppingRepository.save(newTopping);
        log.info("Il topping '" + newTopping.getName() + "' è stato salvato correttamente");
    }
}
