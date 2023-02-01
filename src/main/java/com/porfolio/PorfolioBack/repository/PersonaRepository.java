
package com.porfolio.PorfolioBack.repository;

import com.porfolio.PorfolioBack.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    
}
