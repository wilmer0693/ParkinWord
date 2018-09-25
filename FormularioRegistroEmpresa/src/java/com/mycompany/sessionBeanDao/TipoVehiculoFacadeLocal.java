/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionBeanDao;

import com.mycompany.entity.TipoVehiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fm460
 */
@Local
public interface TipoVehiculoFacadeLocal {

    void create(TipoVehiculo tipoVehiculo);

    void edit(TipoVehiculo tipoVehiculo);

    void remove(TipoVehiculo tipoVehiculo);

    TipoVehiculo find(Object id);

    List<TipoVehiculo> findAll();

    List<TipoVehiculo> findRange(int[] range);

    int count();
    
}
