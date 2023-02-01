
package com.porfolio.PorfolioBack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Schools {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String level;
    @NotNull
    private String instituto;
    private String career;
    private String title;
    @Size(max = 50)
    private String start;
    @Size(max = 50)
    private String end;
    @Size(max = 150)
    private String imglog;
    @Column (name = "persona_id")
    private Integer personaId;

    public Integer getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    public String getInstituto() {
        return instituto;
    }

    public String getCareer() {
        return career;
    }

    public String getTitle() {
        return title;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getImglog() {
        return imglog;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setImglog(String imglog) {
        this.imglog = imglog;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Schools() {
    }

    public Schools(String level, String instituto, String career, String title, String start, String end, String imglog, Integer personaId) {
        this.level = level;
        this.instituto = instituto;
        this.career = career;
        this.title = title;
        this.start = start;
        this.end = end;
        this.imglog = imglog;
        this.personaId = personaId;
    }
    
    
    
    
}
