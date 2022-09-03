import recap.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println(cat.getLifeExpectation());
//        cat.eat();
//        cat.setExpectedLifeInYears(15);
//        cat.makeSound();
//        inheritance.ShibaInu shibaInu = new inheritance.ShibaInu();
//        shibaInu.makeSound();
        // Example for encapsulation
//        cat.setA(2);
//        System.out.println(cat.getA());

//        Vehicle bike = new Bike();
//        // We can call the first that is getIdentity(final String vehicle)
//        System.out.println(bike.getIdentity("MountainBike"));
//
//        Vehicle car = new Car();
//        System.out.println(car.getIdentity());
//
//        Vehicle truck = new Truck();
//        System.out.println(truck.getIdentity());
//
//        Vehicle []vehicles = new Vehicle[3];
//        vehicles[0] = bike;
//        vehicles[1] = car;
//        vehicles[2] = truck;
//
//        for(Vehicle vehicle: vehicles) {
//            System.out.println(vehicle.getIdentity());
//        }
        Pizza pizza = new Pizza();
        pizza.addIngredient("dough");
        pizza.addIngredient("salami");
        pizza.addIngredient("onions");
//        pizza.setIngredients(new String[]{"dough", "salami", "onions"});
        pizza.mixIngredients();
//        System.out.println("Surprise!!!!");

//        Backery food = new Backery() {
//            @Override
//            public void mixIngredients() {
//                System.out.println("Mixing ingredients");
//            }
//        };
//
//        food.mixIngredients();
//        System.out.println(Coffee.getByValue("americano").getPrice());
        Coffee latte = new Coffee();
        latte.setName("latte");
        latte.setPrice(5);

        Coffee irish = new Coffee();
        irish.setName("irish");
        irish.setPrice(10);

        Coffee[] coffees = new Coffee[]{latte, irish};

        for (Coffee coffee : coffees) {
            if ("irish".equals(coffee.getName())) {
                System.out.println(coffee.getPrice());
            }
        }

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Sorin");
        names.add("Alexandra");
        names.add("Lucinia");

        names.remove("Alexandra");
        System.out.println(names.isEmpty());
        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            if (name.equals("Sorin")) {
                System.out.println("Te-am gasit!");
            }
        }

        if (names.contains("Sorin")) {
            System.out.println("Te-am gasit");
        }

        String[] namesAsArray = new String[]{"Sorin", "Alexandra"};
        List<String> namesAsList = Arrays.asList(namesAsArray);
        System.out.println("-------------");
        names.addAll(namesAsList);
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.get(names.indexOf("Sorin")));

        Person person1 = new Person();
        person1.setFirstName("Stefan");
        person1.setLastName("Cernescu");

        Person person2 = new Person();
        person2.setFirstName("Alex");
        person2.setLastName("Ene");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        for (Person person : people) {
            if (person.getFirstName().equals("Stefan")) {
                System.out.println(person.getLastName());
            }
        }

        Grocery backery = new Backery();
        backery.setName("CupCake");
        backery.setPrice(5);

        Grocery cola = new Drink();
        cola.setName("Coca Cola");
        cola.setPrice(10);

        List<Grocery> groceries = new ArrayList<>();
        groceries.add(backery);
        groceries.add(cola);
        System.out.println("--------");
        for (String name : names) {
            System.out.println(name);
        }

        names.removeAll(List.of("Alexandra", "Alex"));
        System.out.println("--------");
        for (String name : names) {
            System.out.println(name);
        }

        String[] arrayList = new String[8];
        List<String> list = new LinkedList<>();
        System.out.println("--------");
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(2);
//        for(Integer number: numbers) {
//            System.out.println(number);
//        }

        System.out.println("--------");
//        Set<String> setNames = new HashSet<>(); nu pastreaza ordinea la inserare
        Set<String> setNames = new LinkedHashSet<>();
        setNames.add("Andrei");
        setNames.add("Alexandra");
        setNames.add("Ramon");
        setNames.add("George");

        for (String name : setNames) {
            System.out.println(name + " " + name.hashCode());
        }

        int  x = 11;
        List<Integer> nubers = Arrays.asList(1, 2, 2, 4, 1, 7, 5, 12);
        nubers.sort((x1,x2) -> x1-x2);
        for (int i = 0; i < nubers.size(); i++) {
            for (int j = i + 1; j < nubers.size(); j++) {
                if (nubers.get(i) + nubers.get(j) == x) {
                    System.out.println("I have found the number");
                }
            }
        }

        Set<Integer> foundNumbers = new HashSet<>();
        for (int i = 0; i < nubers.size(); i++) {
            if (foundNumbers.contains(nubers.get(i))) {
                System.out.println("I have found the number");
            } else {
                foundNumbers.add(x - nubers.get(i));
            }
        }
    }
}
