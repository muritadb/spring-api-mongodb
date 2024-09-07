package com.murita.spring_mongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public ObjectNotFoundException(String msg) {
    super(msg);
  }
}
