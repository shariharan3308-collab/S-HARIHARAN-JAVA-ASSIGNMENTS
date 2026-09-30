class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Subclass Dog
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Subclass Fox
class Fox extends Animal {
    void sound() {
        System.out.println("Fox makes a sound");
    }
}

// Subclass Rabbit
class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit jumps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog d = new Dog();
        Fox f = new Fox();
        Rabbit r = new Rabbit();

        System.out.println("Dog:");
        d.eat();
        d.bark();

        System.out.println("\nFox:");
        f.eat();
        f.sound();

        System.out.println("\nRabbit:");
        r.eat();
        r.jump();
    }
}
