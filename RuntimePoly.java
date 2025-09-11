// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class RuntimePoly {
    public static void main(String[] args) {
        Animal a;  // parent class reference

        a = new Dog();  // refers to Dog object
        a.sound();      // Output: Dog barks

        a = new Cat();  // refers to Cat object
        a.sound();      // Output: Cat meows
    }
}
