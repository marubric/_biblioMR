/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.oliviercailloux.y2017.bibliomr.modele;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author mrubrice
 */
@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String identifier;
    private String provenance;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date exhibitionDate;
    
    @OneToMany(mappedBy="itm")
    private List<Manifestation>manifs;
    @ManyToMany
    private List<Person>pers;
    
    public Item(){
        
    }
    
    public Item(String ident,String prov,Date dt){
        this.exhibitionDate=dt;
        this.identifier=ident;
        this.provenance=prov;
        pers=new ArrayList<>();
        manifs=new ArrayList<>();
    }
    
    /*************** GETTER & SETTER *****************/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public Date getExhibitionDate() {
        return exhibitionDate;
    }

    public void setExhibitionDate(Date exhibitionDate) {
        this.exhibitionDate = exhibitionDate;
    }

    public List<Manifestation> getManifs() {
        return manifs;
    }

    public void setManifs(List<Manifestation> manifs) {
        this.manifs = manifs;
    }

    public List<Person> getPers() {
        return pers;
    }

    public void setPers(List<Person> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", identifier=" + identifier + ", provenance=" + provenance + ", exhibitionDate=" + exhibitionDate + ", manifs=" + manifs + ", pers=" + pers + '}';
    }
    
    
    
}
