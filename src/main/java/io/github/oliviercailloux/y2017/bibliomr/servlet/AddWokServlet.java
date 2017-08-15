package io.github.oliviercailloux.y2017.bibliomr.servlet;

import io.github.oliviercailloux.y2017.bibliomr.modele.*;
import io.github.oliviercailloux.y2017.bibliomr.session.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mrubrice
 */
public class AddWokServlet extends HttpServlet {

    @EJB
    private ConceptFacade conceptFacade;

    @EJB
    private EventFacade eventFacade;

    @EJB
    private ObjectFacade objectFacade;

    @EJB
    private PlaceFacade placeFacade;

    @EJB
    private ItemFacade itemFacade;

    @EJB
    private ExpressionFacade expressionFacade;

    @EJB
    private ManifestationFacade manifestationFacade;

    @EJB
    private WorkFacade workFacade;

    @EJB
    private PersonFacade personFacade;
    public static final String VUE = "/Web Pages/addWork.jsp";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateW,dateP,exibitD;
        String title, form, context, distCh, intA, nameP,desig,titleP;
        //titleEx,formEx,langEx,contxtEx,criticEx,distEx,ttlMa,editMa,staR,pubPL,publisher,dtMa,srcAcq,typeFace,identifier,provenance;
        
        /*****************WORK*******************/
        
        try{
            title = request.getParameter("title");
            form = request.getParameter("form");
            String data=request.getParameter("date");
            dateW =  sdf.parse(data);
            context = request.getParameter("context");
            distCh = request.getParameter("characteristic");
            intA = request.getParameter("audience");        
            Work wk=new Work(title,form,dateW,context,distCh,intA);
            
            data= request.getParameter("dateP");
            dateP = sdf.parse(data);
            nameP= request.getParameter("nameP");
            titleP = request.getParameter("titleP");
            desig = request.getParameter("desig");
            Person pers=new Person(nameP,dateP,desig,titleP);
            
            // association person with work
            wk.getPers().add(pers);
            
            System.out.println("Creation de l'oeuvre id :"+wk.getId());
        }catch(ParseException e){
            System.out.println("Unperseable using "+ sdf);
        }
        
        
        /*Expression exp = new Expression(titleEx, formEx, dateEx, langEx,distEx,contxtEx,criticalEx);
        Manifestation manif=new Manifestation(ttlMa,editMa,staR,pubPL,publisher,dtMa,srcAcq,typeFace);
        Item itm=new Item(identifier,provenance,exibitD);
       
        wk.getExprs().add(exp);
        exp.getManifs().add(manif);
        exp.setWork(wk);
        exp.getPers().add(pers);
        manif.getExprs().add(exp);
        manif.setItm(itm);
        expressionService.create(exp);
        workService.create(wk);
        manifestationService.create(manif);
        itemService.create(itm);
        */
        
        //Object obj=new Object();
        //objectService.create(obj);
        //Place plc=new Place();
        //placeService.create(plc);
        //Event evt=new Event();
        //eventService.create(evt);
        //Concept cpt=new Concept();
        //conceptService.create(cpt);
        //System.out.println("Creation de l'expression id :"+exp.getId());
        //System.out.println("Creation de l'item id :"+itm.getId());
    }

}
