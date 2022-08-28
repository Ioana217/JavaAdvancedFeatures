package inheritance;

public class ShibaInu extends Dog {
    @Override
    void makeSound() {
        expectedLifeInYears = 20;
        System.out.println("Shiba screaaaam!!!");
    }
}
