package com.murita.spring_mongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murita.spring_mongo.domain.User;
import com.murita.spring_mongo.repository.UserRepository;
import com.murita.spring_mongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public List<User> findAll() {
    return repo.findAll();
  }

  public User findById(String id) {
    Optional<User> obj = repo.findById(id);

    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado!"));
  }
}
