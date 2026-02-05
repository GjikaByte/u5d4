package andi.u5d4.repositories;

import andi.u5d4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingsRepository extends JpaRepository<Topping, Long>{
}
