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
public class Work implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String form;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String context;
    private String distinctCharacteristic;
    private String intendedAudience;

    @ManyToMany
    private List<Person>pers;
    @OneToMany(mappedBy="works")
    private List<Expression> exprs;
    @ManyToMany(mappedBy="works")
    private List<CorporateBody>cbs;
    @ManyToMany(mappedBy="works")
    private List<Place>plcs;
    @ManyToMany(mappedBy="works")
    private List<Event>Evts;
    @ManyToMany(mappedBy="works")
    private List<Object>objs;
    @ManyToMany(mappedBy="works")
    private List<Concept>cpts;
    
    public Work() {
        
    }
    
    public Work(String title,String form,Date dt,String ctxt,String distCh,String intA){
        this.title=title;
        this.intendedAudience=intA;
        this.date=dt;
        this.form=form;
        this.context=ctxt;
        this.distinctCharacteristic=distCh;
        pers=new ArrayList<>();
        exprs=new ArrayList<>();
        cbs=new ArrayList<>();
        plcs=new ArrayList<>();
        Evts=new ArrayList<>();
        objs=new ArrayList<>();
        cpts=new ArrayList<>();
    }
    
     /*************** GETTER & SETTER *****************/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDistinctCharacteristic() {
        return distinctCharacteristic;
    }

    public void setDistinctCharacteristic(String distinctCharacteristic) {
        this.distinctCharacteristic = distinctCharacteristic;
    }

    public String getIntendedAudience() {
        return intendedAudience;
    }

    public void setIntendedAudience(String intendedAudience) {
        this.intendedAudience = intendedAudience;
    }

    public List<Expression> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expression> exprs) {
        this.exprs = exprs;
    }

    public List<Person> getPers() {
        return pers;
    }

    public void setPers(List<Person> pers) {
        this.pers = pers;
    }

    public List<CorporateBody> getCbs() {
        return cbs;
    }

    public void setCbs(List<CorporateBody> cbs) {
        this.cbs = cbs;
    }

    public List<Place> getPlcs() {
        return plcs;
    }

    public void setPlcs(List<Place> plcs) {
        this.plcs = plcs;
    }

    public List<Event> getEvts() {
        return Evts;
    }

    public void setEvts(List<Event> Evts) {
        this.Evts = Evts;
    }

    public List<Object> getObjs() {
        return objs;
    }

    public void setObjs(List<Object> objs) {
        this.objs = objs;
    }

    public List<Concept> getCpts() {
        return cpts;
    }

    public void setCpts(List<Concept> cpts) {
        this.cpts = cpts;
    }  

    @Override
    public String toString() {
        return "Work{" + "id=" + id + ", title=" + title + ", form=" + form + ", date=" + date + ", context=" + context + ", distinctCharacteristic=" + distinctCharacteristic + ", intendedAudience=" + intendedAudience + ", pers=" + pers + ", exprs=" + exprs + ", cbs=" + cbs + ", plcs=" + plcs + ", Evts=" + Evts + ", objs=" + objs + ", cpts=" + cpts + '}';
    }
    
    
}
