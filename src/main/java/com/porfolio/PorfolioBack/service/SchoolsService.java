
package com.porfolio.PorfolioBack.service;

import com.porfolio.PorfolioBack.model.Schools;
import com.porfolio.PorfolioBack.repository.SchoolsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolsService implements ISchoolsService {

    @Autowired
    public SchoolsRepository educRepo;

    @Override
    public List<Schools> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void crearEducacion(Schools edu) {
        educRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Schools buscarEducacion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
}
