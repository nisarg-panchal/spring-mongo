package com.nisarg.springmongodb.springmongo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Jacksonized
@Document(collection = "people")
@AllArgsConstructor
public class Person {
    @Id
    String id;
    String name;
}
