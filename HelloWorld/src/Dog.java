public class Dog extends Pet {
    int numOfLegs;

    public Dog(String name, int age, int numOfLegs) {
        super(name, age);
        this.numOfLegs = numOfLegs;
    }

    @Override
    public void move() {
        System.out.println("I am a Dog, I walk from A to B with " + numOfLegs + " legs");
    }
}
