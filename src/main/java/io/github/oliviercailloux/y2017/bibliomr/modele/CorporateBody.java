package io.github.oliviercailloux.y2017.bibliomr.modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author mrubrice
 */
@Entity
public class CorporateBody implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
     
    private String name;
    private int number;
    private String place;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String designation;

    @OneToMany(mappedBy="cbs")
    private List<Work> works;
    
    public CorporateBody(){
        
    }
    
    public CorporateBody(String dsg,Date dt,String pl,int nb,String name){
        this.name=name;
        this.date=dt;
        this.designation=dsg;
        this.number=nb;
        this.place=pl;
        works=new ArrayList<>();
    }
    
    /*************** GETTER & SETTER *****************/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "CorporateBody{" + "id=" + id + ", name=" + name + ", number=" + number + ", place=" + place + ", date=" + date + ", designation=" + designation + ", works=" + works + '}';
    }
    
    
}
