/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bin;


import com.mycompany.entity.SedeParqueadero;
import com.mycompany.sessionBeanDao.SedeParqueaderoFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fm460
 */
@ManagedBean(name = "SedeParqueaderoMB")
@SessionScoped
public class SedeParqueaderoBean implements Serializable {

   @EJB
   private SedeParqueaderoFacadeLocal sedeParqueaderoFacade ;
   private SedeParqueadero sedeParqueadero;
   private List<SedeParqueadero> listaSedeParqueadero;
   
    public SedeParqueaderoBean() {
        sedeParqueadero = new SedeParqueadero ();
        
    }

    public List<SedeParqueadero> getListaSedeParqueadero() {
        listaSedeParqueadero = sedeParqueaderoFacade.findAll();
        return listaSedeParqueadero;
    }

    public SedeParqueadero getSedeParqueadero() {
        return sedeParqueadero;
    }

    public void setSedeParqueadero(SedeParqueadero sedeParqueadero) {
        this.sedeParqueadero = sedeParqueadero;
    }
    
    
    
}
