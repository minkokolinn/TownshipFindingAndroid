package com.example.user.townshipfinding;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> people=new ArrayList<>();

    public People(){
        people.add(new Person("Mg Mg",12,"Yangon"));
        people.add(new Person("Mg Mg",12,"Yangon"));
        people.add(new Person("Mg Mg",12,"Yangon"));
        people.add(new Person("Mg Mg",12,"Yangon"));
    }

    public List<Person> getPeople(){
        return people;
    }
}
