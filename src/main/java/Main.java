import examples.Bike;
import examples.Car;
import examples.Truck;
import examples.Vehicle;
import recap.Pizza;

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
    }
}
