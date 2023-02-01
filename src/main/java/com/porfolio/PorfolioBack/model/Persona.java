
package com.porfolio.PorfolioBack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;




@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(min = 1, max = 50)
    private String nombre;
    private String apellido;
    private String profesion;
    private String banner;
    @Lob
    @Column(length=3000)
    private String about;
    @Size (max = 150)
    private String urlperfil;
    
    @OneToMany (mappedBy = "personaId")
    private List<Schools> estudio;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getBanner() {
        return banner;
    }

    public String getAbout() {
        return about;
    }

    public String getUrlperfil() {
        return urlperfil;
    }

    public List<Schools> getEstudio() {
        return estudio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setUrlperfil(String urlperfil) {
        this.urlperfil = urlperfil;
    }

    public void setEstudio(List<Schools> estudio) {
        this.estudio = estudio;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String banner, String about, String urlperfil, List<Schools> estudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.banner = banner;
        this.about = about;
        this.urlperfil = urlperfil;
        this.estudio = estudio;
        
        estudio = new ArrayList();
    }
    
    
    

    

    
    
    
    
    
    
}
