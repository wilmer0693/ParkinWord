





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bin;

import com.mycompany.entity.Vehiculo;
import com.mycompany.sessionBeanDao.VehiculoFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
































/**
 *
 * @author fm460
 */
@ManagedBean
@SessionScoped

public class VehivuloBin implements Serializable {
    @EJB
private VehiculoFacadeLocal vehiculoFacade;
    private List<Vehiculo> listaVehiculos;

    public List<Vehiculo> getListaVehiculos() {
        listaVehiculos=vehiculoFacade.findAll();
        return listaVehiculos;
    }
    
    public VehivuloBin() {
    }
    
}
