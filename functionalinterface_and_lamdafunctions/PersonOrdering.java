package functionalinterface_and_lamdafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;
    double salary;
    Person(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Name : "+name+"- Age : "+age+"\n";
    }
}
public class PersonOrdering {
    public static void main(String[] args){
        ArrayList<Person> persons=new ArrayList<>();
        Person person1=new Person("Unnimaya",22,40000);
        Person person2=new Person("Sandra",20,42000);
        Person person3=new Person("Sinta",21,75000);
        persons.add(person3);
        persons.add(person1);
        persons.add(person2);
        List<Person> sorted_list=
                persons.stream()
                        .sorted((s1,s2)->Integer.compare(s1.age,s2.age))
                        .collect(Collectors.toList());
        System.out.println(sorted_list);
    }
}
//Create a list of Person objects with attributes such as name, age, and salary.
//Sort the list
//by age in ascending order using lambda expressions.
