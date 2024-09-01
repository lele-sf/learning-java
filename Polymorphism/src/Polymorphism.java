public class Polymorphism {
    public static void main(String[] args) throws Exception {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myCat.animalSound();
        myPig.animalSound();
    }
}
