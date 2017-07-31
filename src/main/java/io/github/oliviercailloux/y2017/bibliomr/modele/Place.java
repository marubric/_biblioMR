/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.oliviercailloux.y2017.bibliomr.modele;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author mrubrice
 */
@Entity
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String place;
    
    @ManyToMany
    private List<Work>works;
    
    /*************** GETTER & SETTER *****************/ 
   
    public void setId(Long i){
        id=i;
    }
    
    public void setPlace(String pl){
        place=pl;
    }
    
    public String getPlace(){
        return place;
    }
        
    public Long getId(){
        return id;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Place{" + "id=" + id + ", place=" + place + ", works=" + works + '}';
    }
    
}
