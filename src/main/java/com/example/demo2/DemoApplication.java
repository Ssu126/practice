package com.example.demo2;

import java.util.HashMap;
import java.util.Optional;

public class DemoApplication {
    private static final Map<Integer, Person> people = new HashMap<>(){
        {
            put(1, new Person(1, "Aaron", 10));
            put(2, new Person(2, "Baron", 12));
            put(3, new Person(3, "Caron", 15));
            put(4, new Person(4, "Daron", 17));
            put(5, new Person(5, "Earon", 21));
        }
    };

    private static Optional<Person> retrieve(int id){
    Person retrieved = people.get(id);
    return Optional.ofNullable(retrieved);
    }

    public static void main(String[] args){
        Optional<String> optionalMapped1 = optionalExist.map((Person) -> person.getName());
        Optional<String> optionalMapped2 = optionalExist.map(Person::getName);

        optionalExist.ifPresentOrElse((inner) -> {System.out.println("값이 존재하지 않을때 개별 호출");}
        );
        Optional<Person> optionalEmpty = retrieve(11);
        System.out.println(optionalEmpty);

        Person defaultValue = optionalEmpty.orElse(new Person(0, "Default", 0));
        Person defaultValueGet = optionalEmpty.orElseGet(() -> new Person(0, "Default", 0));
                optionalEmpty.orElseThrow(() -> new RuntimeException("미존재 시 예외 던지기"));
    }
}

