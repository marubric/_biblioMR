/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.oliviercailloux.y2017.bibliomr.servlet;

import io.github.oliviercailloux.y2017.bibliomr.modele.*;
import io.github.oliviercailloux.y2017.bibliomr.session.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mrubrice
 */
public class AddWokServlet extends HttpServlet {
    public static final String VUE = "/Web Pages/addWork.jsp";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    
        PersonFacade personService = new PersonFacade();
        WorkFacade workService = new WorkFacade();
        ManifestationFacade manifestationService = new ManifestationFacade();
        ExpressionFacade expressionService = new ExpressionFacade();
        ItemFacade itemService = new ItemFacade();
        ObjectFacade objectService = new ObjectFacade();
        PlaceFacade placeService = new PlaceFacade();
        EventFacade eventService = new EventFacade();
        ConceptFacade conceptService = new ConceptFacade();
        
        Date date,dateP,exibitD;
        String title, form, context, distCh, intA, nameP,desig,titleP,titleEx,formEx,langEx,contxtEx,criticEx,distEx,ttlMa,editMa,staR,pubPL,publisher,dtMa,srcAcq,typeFace,identifier,provenance;
        
        /*****************WORK*******************/
        title = request.getParameter("title");
        form = request.getParameter("form");
        date = request.getParameter("date");
        context = request.getParameter("context");
        distCh = request.getParameter("distinctCharacteristic");
        intA = request.getParameter("intendeAudience");
        /*******************Person************************/
        nameP= request.getParameter("nameP");
        desig = request.getParameter("desig");
        titleP = request.getParameter("titleP");
        dateP = request.getParameter("dateP");
        /********************Expression****************************/
        titleEx = request.getParameter("titleEx");
        formEx = request.getParameter("formEx");
        langEx = request.getParameter("langEx");
        contxtEx = request.getParameter("contxtEx");
        criticEx = request.getParameter("criticEx");
        distEx = request.getParameter("distEx");
        /**********************Manifestation*********************************/
        ttlMa = request.getParameter("ttlMa");
        editMa = request.getParameter("editMa");
        staR = request.getParameter("staR");
        pubPL = request.getParameter("pubPL");
        publisher = request.getParameter("publisher");
        dtMa = request.getParameter("dtMa");
        srcAcq = request.getParameter("srcAcq");
        typeFace = request.getParameter("typeFace");
        /************************Item**************************************/
        identifier = request.getParameter("identifier");
        provenance = request.getParameter("provenance");
        exibitD = request.getParameter("exibitD");        
        
        
        Work wk=new Work(title,form,date,context,distCh,intA);
        Expression exp = new Expression(titleEx, formEx, dateEx, langEx,distEx,contxtEx,criticalEx);
        Manifestation manif=new Manifestation(ttlMa,editMa,staR,pubPL,publisher,dtMa,srcAcq,typeFace);
        Item itm=new Item(identifier,provenance,exibitD);
        Person pers=new Person(nameP,dateP,desig,titleP);
        
        wk.getExprs().add(exp);
        wk.getPers().add(pers);
        exp.getManifs().add(manif);
        exp.setWork(wk);
        exp.getPers().add(pers);
        manif.getExprs().add(exp);
        manif.setItm(itm);
        expressionService.create(exp);
        workService.create(wk);
        manifestationService.create(manif);
        itemService.create(itm);
        
        //Object obj=new Object();
        //objectService.create(obj);
        //Place plc=new Place();
        //placeService.create(plc);
        //Event evt=new Event();
        //eventService.create(evt);
        //Concept cpt=new Concept();
        //conceptService.create(cpt);
        
        
        System.out.println("Creation de l'oeuvre id :"+wk.getId());
        System.out.println("Creation de l'expression id :"+exp.getId());
        System.out.println("Creation de l'item id :"+itm.getId());
    }

}
