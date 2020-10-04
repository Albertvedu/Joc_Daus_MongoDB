package com.springboot.mongo_db.service;

import com.springboot.mongo_db.model.Plays;
import com.springboot.mongo_db.model.User;
import com.springboot.mongo_db.repository.IPlaysMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaysMongoService implements IPlaysMongoService{

    @Qualifier("IPlaysMongoRepository")
    @Autowired
    IPlaysMongoRepository repoPlays;



    @Override
    public List<Plays> findAllByUserId(Integer id) {
        return repoPlays.findAllByUserId(id);
    }
}
