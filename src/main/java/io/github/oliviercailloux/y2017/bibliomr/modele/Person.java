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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author mrubrice
 */
@Entity @Table(name="Person")
public class Person implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long personId;
    private String name;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String title;
    private String designation;
    @ManyToMany(mappedBy="pers")
    private List<Expression> exprs;
    
    
    @ManyToMany(mappedBy="pers")
    private List<Work> works;
    @ManyToMany(mappedBy="pers")
    private List<Manifestation> manifestations;
    @ManyToMany(mappedBy="pers")
    private List<Item> items;

    public Person(){
        
    }
    
    public Person(String na,Date dt,String desg,String ttl){
        this.name=na;
        this.date=dt;
        this.designation=desg;
        this.title=ttl;
        exprs=new ArrayList<>();
        manifestations=new ArrayList<>();
        items=new ArrayList<>();
    }
    /*************** GETTER & SETTER *****************/
    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long id) {
        this.personId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
   

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public List<Expression> getExpressions() {
        return exprs;
    }

    public void setExpressions(List<Expression> expressions) {
        this.exprs = expressions;
    }

    public List<Manifestation> getManifestations() {
        return manifestations;
    }

    public void setManifestations(List<Manifestation> manifestations) {
        this.manifestations = manifestations;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + personId + ", name=" + name + ", date=" + date + ", title=" + title + ", designation=" + designation + ", works=" + works + ", expressions=" + exprs + ", manifestations=" + manifestations + ", items=" + items + '}';
    }


    
   
    
    
    
    
    
}
