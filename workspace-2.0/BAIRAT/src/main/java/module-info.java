/*
 * Copyright 2021 Sͬeͥbͭaͭsͤtͬian
 */

/**
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
module BAIRAT {
  requires static lombok;   // efficient Java
  requires java.desktop;    // Robot
  requires tess4j;          // OCR
  
  
  requires java.sql;                // for database
  requires java.persistence;        // for Reflection with JPA 
  requires org.hibernate.orm.core;  // for JPA with Hibernate
  opens biz.ritter.bairat.pojo;     // for Reflection with JPA (Hibernate)
  
}