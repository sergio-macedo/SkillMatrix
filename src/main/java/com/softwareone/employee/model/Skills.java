package com.softwareone.employee.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(nullable=false, updatable= false)
    private Long id;
    private String skillName;
    private String category;
    private String proficiency;



    public Skills(){


    }



    public Skills(Long id, String skillName, String category, String proficiency) {
        super();
        this.id = id;
        this.skillName = skillName;
        this.category = category;
        this.proficiency= proficiency;
    }



    public Long getId() {
        return id;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getProficiency() {
        return proficiency;
    }





    public String getCategory() {
        return category;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public void setId(Long id) {
        this.id = id;
    }




    public void setCategory(String category) {
        this.category = category;
    }


}
