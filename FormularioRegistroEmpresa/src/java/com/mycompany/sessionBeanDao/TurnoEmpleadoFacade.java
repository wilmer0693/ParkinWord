/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionBeanDao;

import com.mycompany.entity.TurnoEmpleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fm460
 */
@Stateless
public class TurnoEmpleadoFacade extends AbstractFacade<TurnoEmpleado> implements TurnoEmpleadoFacadeLocal {

    @PersistenceContext(unitName = "FormularioRegistroEmpresaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TurnoEmpleadoFacade() {
        super(TurnoEmpleado.class);
    }
    
}
