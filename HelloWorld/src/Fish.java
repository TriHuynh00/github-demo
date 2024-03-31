public class Fish extends Pet {
    int numOfFirs;

    public Fish(String name, int age, int numOfFirs) {
        super(name, age);
        this.numOfFirs = numOfFirs;
    }

    @Override
    public void move() {
        System.out.println("I am a fish, I swim from A to B with " + numOfFirs + " firs");
    }
}
