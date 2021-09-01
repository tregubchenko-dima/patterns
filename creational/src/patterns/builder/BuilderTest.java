package patterns.builder;

import patterns.builder.v1.Person;
import patterns.builder.v2.Car;
import patterns.builder.v2.CarDirector;
import patterns.builder.v2.SportCarBuilder;

public class BuilderTest {

    public static void main(String[] args){
        Person person = new Person.Builder()
                .withFirstName("Dima")
                .withLastName("Tregu")
                .withEmail("somegmail@some.com")
                .withPhoneNumber("+12345678910")
                .build();

        System.out.println(person.toString());

        CarDirector carDirector = new CarDirector();
        carDirector.setCarBuilder(new SportCarBuilder());

        Car car = carDirector.build();

        System.out.println(car.toString());
    }
}
