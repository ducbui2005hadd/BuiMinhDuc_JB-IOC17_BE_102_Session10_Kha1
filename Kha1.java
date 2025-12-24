class Animal {
    protected String name;
    public void makeSound() {
        System.out.println(name + " says: Some animal sound");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
}
public class Kha1 {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.makeSound();
    }
}