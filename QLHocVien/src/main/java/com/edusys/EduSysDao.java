/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edusys;

import java.util.List;

/**
 *
 * @author votha
 */
abstract public class EduSysDao<EntityType, keyTyne> {
    abstract public void intsert(EntityType etity);
    abstract public void Update(EntityType etity);
    abstract public void delete(EntityType id);
    abstract public EntityType SelectById(EntityType id);
    abstract public List<EntityType> SelectAll();
    abstract public List<EntityType> SelectAll(String sql, Object...args);
    
  
}
