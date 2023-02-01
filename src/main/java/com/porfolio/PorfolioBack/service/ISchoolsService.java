
package com.porfolio.PorfolioBack.service;

import com.porfolio.PorfolioBack.model.Schools;
import java.util.List;


public interface ISchoolsService {
    
    public List<Schools> verEducacion ();
    public void crearEducacion (Schools edu);
    public void borrarEducacion (Long id);
    public Schools buscarEducacion (Long id);
    
}
