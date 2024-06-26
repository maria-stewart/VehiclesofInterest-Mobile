/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.ReasonForInterest;

/**
 *
 * @author moore
 */
@Stateless
public class ReasonForInterestFacade extends AbstractFacade<ReasonForInterest> {

    @PersistenceContext(unitName = "VOIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReasonForInterestFacade() {
        super(ReasonForInterest.class);
    }
    
}
