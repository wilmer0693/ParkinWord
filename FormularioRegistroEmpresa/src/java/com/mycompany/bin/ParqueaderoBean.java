/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bin;


import com.mycompany.entity.Parqueadero;
import com.mycompany.entity.SedeParqueadero;
import com.mycompany.sessionBeanDao.ParqueaderoFacadeLocal;
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
@ManagedBean (name = "ParqueaderoMB")
@SessionScoped
public class ParqueaderoBean implements Serializable {
    @EJB 
    private ParqueaderoFacadeLocal parqueaderoFacade;
    @EJB
    private SedeParqueaderoFacadeLocal sedeParqueaderoFacade;
    
    
    private Parqueadero parqueadero;
    private SedeParqueadero sedeParqueadero;
    private List<Parqueadero> listaParqueadero;

    
 
    public ParqueaderoBean() {
        parqueadero = new Parqueadero();
        sedeParqueadero =  new SedeParqueadero();
    }
    
    public List<Parqueadero> getListaParqueadero() {
        listaParqueadero = parqueaderoFacade.findAll();
        return listaParqueadero;
    }
    
    public String validaSaveOrUpdate(){
        if (parqueadero.getIdParqueadero() == null) {
            parqueadero.setIdParqueadero(0);
        }        
        if (parqueaderoFacade.find(parqueadero.getIdParqueadero()) == null ) {
            parqueadero.setIdSedeParqueadero(sedeParqueaderoFacade.find(sedeParqueadero.getIdSedeParqueadero()));
            parqueaderoFacade.create(parqueadero);
        }else{
            parqueadero.setIdSedeParqueadero(sedeParqueaderoFacade.find(sedeParqueadero.getIdSedeParqueadero()));
            parqueaderoFacade.edit(parqueadero);
        }
       
        return "Parqueadero.xhtml";
    }
    
    
    
    public String limpiar(){
        parqueadero =  new Parqueadero();
        return "Parqueadero.xhtml";
    }
    
    
    public String deleteParqueadero(){        
        parqueadero.setIdSedeParqueadero(sedeParqueaderoFacade.find(sedeParqueadero.getIdSedeParqueadero()));
        parqueaderoFacade.remove(parqueadero);
        return "Parqueadero.xhtml";
    }

    public SedeParqueadero getSedeParqueadero() {
        return sedeParqueadero;
    }

    public void setSedeParqueadero(SedeParqueadero sedeParqueadero) {
        this.sedeParqueadero = sedeParqueadero;
    }

    
    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
    
    
    
}
