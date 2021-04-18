/**
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */
package biz.ritter.bairat.io;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import biz.ritter.bairat.pojo.Scan;

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class DatabaseUtil {

  static boolean first = true;
  static int id = 0;
  
  private EntityManagerFactory entityManagerFactory;
  
  public DatabaseUtil () {
      this.entityManagerFactory = Persistence.createEntityManagerFactory( "bairat" );
  }
  
  public Scan test (Scan toStore) {
    var entityManager = this.entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(toStore);
    entityManager.getTransaction().commit();
    
    entityManager.getTransaction().begin();
    var result= entityManager.createQuery("from Scan", toStore.getClass()).getResultList().get(0);
    entityManager.getTransaction().commit();
    entityManager.close();

    return result;
  }
}
