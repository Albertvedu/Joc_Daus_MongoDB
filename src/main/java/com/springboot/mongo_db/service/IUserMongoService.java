package com.springboot.mongo_db.service;

import com.springboot.mongo_db.model.User;
import com.springboot.mongo_db.repository.IUserMongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service("iUserMongoService")
public interface IUserMongoService extends IUserMongoRepository {
    @Override
    List<User> findByIdUser(Integer id);
}