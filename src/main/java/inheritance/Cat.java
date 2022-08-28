package inheritance;

public class Cat extends Animal {
    private int a;
    //private int expectedLifeInYears; this is the protected member from inheritance.Animal class.

    public Cat() {
        System.out.println("I am cat");
    }

    @Override
    void makeSound() {
        System.out.println("Miau miau");
    }

    public int getLifeExpectation() {
        return expectedLifeInYears;
    }

    // Example for encapsulation
//    public int getA() {
//        return a;
//    }
//
//    public void setA(final int a) {
//        if(a < 0) {
//            throw new ArithmeticException("Nu vreau numere mai mici ca 0");
//        }
//        this.a = a;
//    }
}
