/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionBeanDao;

import com.mycompany.entity.ModeloVehiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fm460
 */
@Local
public interface ModeloVehiculoFacadeLocal {

    void create(ModeloVehiculo modeloVehiculo);

    void edit(ModeloVehiculo modeloVehiculo);

    void remove(ModeloVehiculo modeloVehiculo);

    ModeloVehiculo find(Object id);

    List<ModeloVehiculo> findAll();

    List<ModeloVehiculo> findRange(int[] range);

    int count();
    
}
