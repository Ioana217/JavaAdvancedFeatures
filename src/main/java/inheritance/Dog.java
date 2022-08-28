package inheritance;

public class Dog extends Animal {

    public Dog() {
        expectedLifeInYears = 0;
    }

    @Override
    void makeSound() {
        expectedLifeInYears = 15;
        System.out.println("Ham ham");
    }
}
