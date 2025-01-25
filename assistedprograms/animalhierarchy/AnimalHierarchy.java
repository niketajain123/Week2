package inheritance.assistedprograms.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal=new Animal("Animal",2);
        animal.makeSound();
        animal.display();
        animal=new Dog("Doggy",3);
        animal.makeSound();
        animal.display();
        animal=new Cat("Kitty",2);
        animal.makeSound();
        animal.display();
        animal=new Bird("Birdy",4);
        animal.makeSound();
        animal.display();

    }
}
