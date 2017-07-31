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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author mrubrice
 */
@Entity
public class Manifestation implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String edition;
    private String statementResponsibility;
    private String publicationPlace;
    private String publisher;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String ManifestationID;
    private String sourceAcquisition;
    private String typeFace;

    @ManyToOne
    private Item itm;
    @ManyToMany(mappedBy="manifs")
    private List<Expression>exprs;
    @ManyToMany
    private List<Person>pers;
    
    public Manifestation(){
        
    }
    
    public Manifestation(String ttlMa,String editMa,String staR,String puPL,String publisher,Date dtMa,String srcAcq,String typeFace){
        this.date=dtMa;
        this.edition=editMa;
        this.publicationPlace=puPL;
        this.publisher=publisher;
        this.title=ttlMa;
        this.typeFace=typeFace;
        this.statementResponsibility=staR;
        this.sourceAcquisition=srcAcq;
        itm=new Item();
        pers=new ArrayList<>();
        exprs=new ArrayList<>();
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getStatementResponsibility() {
        return statementResponsibility;
    }

    public void setStatementResponsibility(String statementResponsibility) {
        this.statementResponsibility = statementResponsibility;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getManifestationID() {
        return ManifestationID;
    }

    public void setManifestationID(String ManifestationID) {
        this.ManifestationID = ManifestationID;
    }

    public String getSourceAcquisition() {
        return sourceAcquisition;
    }

    public void setSourceAcquisition(String sourceAcquisition) {
        this.sourceAcquisition = sourceAcquisition;
    }

    public String getTypeFace() {
        return typeFace;
    }

    public void setTypeFace(String typeFace) {
        this.typeFace = typeFace;
    }

    public Item getItm() {
        return itm;
    }

    public void setItm(Item itm) {
        this.itm = itm;
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

    @Override
    public String toString() {
        return "Manifestation{" + "id=" + id + ", title=" + title + ", edition=" + edition + ", statementResponsibility=" + statementResponsibility + ", publicationPlace=" + publicationPlace + ", publisher=" + publisher + ", date=" + date + ", ManifestationID=" + ManifestationID + ", sourceAcquisition=" + sourceAcquisition + ", typeFace=" + typeFace + ", itm=" + itm + ", exprs=" + exprs + ", pers=" + pers + '}';
    }
    
    
    
    
}
