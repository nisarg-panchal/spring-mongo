package com.nisarg.springmongodb.springmongo.controller;

import com.nisarg.springmongodb.springmongo.bean.Person;
import com.nisarg.springmongodb.springmongo.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor
@Slf4j
public class PeopleController {

    private PeopleRepository peopleRepository;

    @GetMapping("/echo")
    public String echo() {
        log.info("Echo!");
        return "Service " + this.getClass().getCanonicalName() + " service is alive!";
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        log.info("Fetching all people");
        return new ResponseEntity<>(peopleRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> add(@RequestBody Person person) {
        log.info("Adding new person:{}", person);
        return new ResponseEntity<>(peopleRepository.insert(person), HttpStatus.CREATED);
    }
}
