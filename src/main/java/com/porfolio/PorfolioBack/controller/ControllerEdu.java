
package com.porfolio.PorfolioBack.controller;

import com.porfolio.PorfolioBack.model.Schools;
import com.porfolio.PorfolioBack.service.ISchoolsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerEdu {
    
    @Autowired
    private ISchoolsService educServ;
    
    @PostMapping ("/new/educacions")
    public String agregarEducacion (@RequestBody Schools educa) {
        educServ.crearEducacion(educa);
        return "La Educación fue agregada correctamente";
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Schools> verEducacion() {
        return educServ.verEducacion();
    }
    
}
