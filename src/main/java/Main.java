import recap.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
        System.out.println(names.contains("Lucinia"));
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

//        Person person1 = new Person();
//        person1.setFirstName("Stefan");
//        person1.setLastName("Cernescu");
//
//        Person person2 = new Person();
//        person2.setFirstName("Alex");
//        person2.setLastName("Ene");

        List<Person> people = new ArrayList<>();
//        people.add(person1);
//        people.add(person2);
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
//        List<String> list = new LinkedList<>();
        System.out.println("--------");
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(12);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);
        numbers.add(21);
        numbers.add(23);
        numbers.add(22);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("--------");

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

        int x = 11;
        List<Integer> nubers = Arrays.asList(1, 2, 2, 4, 1, 7, 5, 12);
        nubers.sort((x1, x2) -> x1 - x2);
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

        LinkedList list = new LinkedList();
        Node node = new Node();
        node.setValue(1);
        node.setNext(null);

        Node node2 = new Node();
        node2.setValue(2);
        node2.setNext(null);

        Node node3 = new Node();
        node3.setValue(3);
        node3.setNext(null);
        list.add(node)
                .add(node2)
                .add(node3);
        System.out.println("--------");
        list.printList();

        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();
        map.put("Cernescu", "Stefan");
        map.put("Ene", "Alex");
        map.put("Costiuc", "Sorin");

        System.out.println(map.get("Ene"));
        System.out.println("------------");
        Map<String, Car> cars = new HashMap<>();
        cars.put("SBC", new Car(Model.Volkswagen, 2008, "Blue"));
        cars.put("ABC", new Car(Model.BMW, 2017, "Black"));
        cars.put("AAA", new Car(Model.AUDI, 2010, "White"));
        cars.put("AAA", new Car(Model.Volvo, 2010, "White"));

        System.out.println(cars.get("SBC"));
        System.out.println(cars.get("AAA"));

        Map<Person, Car> newCars = new HashMap<>();
        System.out.println("--------");
        Person stefan = new Person("Cernesu", "Stefan");
        Person alex = new Person("Ene", "Alex");
        Person sorin = new Person("Costiuc", "Sorin");
        newCars.put(new Person("Cernesu", "Stefan"), new Car(Model.Volkswagen, 2021, "Blue"));
        newCars.put(alex, new Car(Model.AUDI, 2022, "Black"));
        newCars.put(sorin, new Car(Model.Volvo, 2022, "Black"));

        System.out.println(newCars.get(stefan));
        System.out.println(newCars.get(new Person("Cernesu", "Mihai")));
        System.out.println(stefan.equals(new Person("Cernesu", "Mihai")));
        System.out.println(stefan.hashCode() + " " + new Person("Cernesu", "Mihai").hashCode());


    }
}
