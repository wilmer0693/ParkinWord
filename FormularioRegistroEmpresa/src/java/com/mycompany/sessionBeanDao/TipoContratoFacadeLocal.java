/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionBeanDao;

import com.mycompany.entity.TipoContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fm460
 */
@Local
public interface TipoContratoFacadeLocal {

    void create(TipoContrato tipoContrato);

    void edit(TipoContrato tipoContrato);

    void remove(TipoContrato tipoContrato);

    TipoContrato find(Object id);

    List<TipoContrato> findAll();

    List<TipoContrato> findRange(int[] range);

    int count();
    
}
