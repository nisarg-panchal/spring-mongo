package com.nisarg.springmongodb.springmongo.repository;

import com.nisarg.springmongodb.springmongo.bean.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<Person, String> {
}
