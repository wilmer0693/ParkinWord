/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionBeanDao;

import com.mycompany.entity.MedidasCupo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fm460
 */
@Local
public interface MedidasCupoFacadeLocal {

    void create(MedidasCupo medidasCupo);

    void edit(MedidasCupo medidasCupo);

    void remove(MedidasCupo medidasCupo);

    MedidasCupo find(Object id);

    List<MedidasCupo> findAll();

    List<MedidasCupo> findRange(int[] range);

    int count();
    
}
