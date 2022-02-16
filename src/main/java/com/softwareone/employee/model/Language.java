package com.softwareone.employee.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Language implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(nullable=false, updatable= false)
    private Long id;
    private String languageName;
    private String level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Language(Long id, String languageName, String level) {
        this.id = id;
        this.languageName = languageName;
        this.level = level;
    }
    public  Language(){

    }
}
