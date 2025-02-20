package com.nisarg.springmongodb.springmongo.startup;

import com.nisarg.springmongodb.springmongo.bean.Person;
import com.nisarg.springmongodb.springmongo.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
@Slf4j
public class StartupRunner implements CommandLineRunner {

    private PeopleRepository peopleRepository;

    @Override
    public void run(String... args) {
        log.info("Adding startup data...");
        peopleRepository.insert(new Person(UUID.randomUUID().toString(), "AAA"));
        peopleRepository.insert(new Person(UUID.randomUUID().toString(), "BBB"));
        peopleRepository.insert(new Person(UUID.randomUUID().toString(), "CCC"));
        peopleRepository.insert(new Person(UUID.randomUUID().toString(), "DDD"));
        peopleRepository.insert(new Person(UUID.randomUUID().toString(), "EEE"));
        peopleRepository.insert(new Person(UUID.randomUUID().toString(), "FFF"));
        log.info("Adding startup data...Done!");
    }
}
