package inheritance;

public abstract class Animal {
    protected Integer expectedLifeInYears;

    public Animal() {
        expectedLifeInYears = 1;
        System.out.println("I am an animal");
    }

    public void eat() {
        System.out.println("I am eating food");
    }
    abstract void makeSound();

    // This can be used by all child classes.
    public int getExpectedLifeInYears() {
        return expectedLifeInYears;
    }

    // This can be used by all child classes.
    public void setExpectedLifeInYears(final int expectedLifeInYears) {
        this.expectedLifeInYears = expectedLifeInYears;
    }
}
