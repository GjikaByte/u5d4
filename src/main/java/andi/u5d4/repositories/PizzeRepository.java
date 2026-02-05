package andi.u5d4.repositories;

import andi.u5d4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeRepository extends JpaRepository<Pizza, Long> {
}