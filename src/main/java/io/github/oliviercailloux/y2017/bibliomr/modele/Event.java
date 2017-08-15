package io.github.oliviercailloux.y2017.bibliomr.modele;


import java.io.Serializable;
import java.util.ArrayList;
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
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String term;
    
    @ManyToMany
    private List<Work>works;
    
    public Event(){
        
    }
    
    public Event(String trm){
        this.term=trm;
        works=new ArrayList<>();
    }
    /*************** GETTER & SETTER *****************/
    
    private void setId(Long i){
        id=i;
    }
    public Long getId(){
        return id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", term=" + term + ", works=" + works + '}';
    }
    
    
}
