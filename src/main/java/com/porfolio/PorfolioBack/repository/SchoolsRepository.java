
package com.porfolio.PorfolioBack.repository;

import com.porfolio.PorfolioBack.model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends JpaRepository <Schools, Integer> {
    
}
