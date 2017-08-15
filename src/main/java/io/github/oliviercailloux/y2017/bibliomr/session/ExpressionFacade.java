package io.github.oliviercailloux.y2017.bibliomr.session;

import io.github.oliviercailloux.y2017.bibliomr.modele.Expression;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrubrice
 */
@Stateless
public class ExpressionFacade extends AbstractFacade<Expression> {

    @PersistenceContext(unitName = "biblioMRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExpressionFacade() {
        super(Expression.class);
    }
    
}
