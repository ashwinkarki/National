/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao;

import com.npsc.entity.Flat;
import com.npsc.entity.House;
import com.npsc.entity.Sale;
import com.npsc.entity.Secretary;
import java.util.List;

/**
 *
 * @author Ashwin
 */
public interface SalesDAO  extends GenericDAO<Sale>{
       public int getMaximumid();

    public List<Sale> getBySecretaryId();

    public List<Sale> getBySecretaryIdFlat();
}
