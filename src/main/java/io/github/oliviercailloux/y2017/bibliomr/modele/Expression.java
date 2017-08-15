
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author mrubrice
 */
@Entity @Table(name="Expression")
public class Expression implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

 
    
    private String title;
    private String form;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String language;
    private String distinctCharacteristic;
    private String context;
    private String criticalResponse;
    
    @ManyToOne
    private Work work;
    @ManyToMany
    private List<Manifestation>manifs;
    @OneToMany
    private List<Person> pers;
    
    public Expression(){
        
    }
    
    public Expression(String fm,String ttl,Date dt,String lang,String dist,String contxt,String resp ){
        this.context=contxt;
        this.criticalResponse=resp;
        this.date=dt;
        this.form=fm;
        this.language=lang;
        this.title=ttl;
        this.distinctCharacteristic=dist;
        pers=new ArrayList<>();
        manifs=new ArrayList<>();
        work=new Work();
    }
    
    /*************** GETTER & SETTER *****************/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setTitle(String ttl){
        title=ttl;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setForm(String frm){
        form=frm;
    }
    
    public String getForm(){
        return form;
    }
    
    public void setDate(Date dt){
        date=dt;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setLanguage(String lang){
        language=lang;
    }
    
    public String getLanguage(){
        return language;
    }
    
    public void setDistinctCharacteristic(String distCh){
        distinctCharacteristic=distCh;
    }
    
    public String getDistinctCharacteristic(){
        return distinctCharacteristic;
    }
    
    public void setContext(String cont){
        context=cont;
    }
    
    public String getContext(){
        return context;
    }
    
    public void setCriticalResponse(String criticResp){
        criticalResponse=criticResp;
    }
    
    public String getCriticalResponse(){
        return criticalResponse;
    }

    public List<Manifestation> getManifs() {
        return manifs;
    }

    public void setManifs(List<Manifestation> manifs) {
        this.manifs = manifs;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public List<Person> getPers() {
        return pers;
    }

    public void setPers(List<Person> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "Expression{" + "id=" + id + ", title=" + title + ", form=" + form + ", date=" + date + ", language=" + language + ", distinctCharacteristic=" + distinctCharacteristic + ", context=" + context + ", criticalResponse=" + criticalResponse + ", work=" + work + ", manifs=" + manifs + ", pers=" + pers + '}';
    }
    
    
    
}
