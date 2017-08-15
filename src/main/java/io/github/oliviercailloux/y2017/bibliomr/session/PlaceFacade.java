package io.github.oliviercailloux.y2017.bibliomr.session;

import io.github.oliviercailloux.y2017.bibliomr.modele.Place;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrubrice
 */
@Stateless
public class PlaceFacade extends AbstractFacade<Place> {

    @PersistenceContext(unitName = "biblioMRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlaceFacade() {
        super(Place.class);
    }
    
}
