public class Dog extends Animal {
    private String breed;
    private String bark;

    public Dog(String name, int age, String breed, String bark) {
        super(name, age);
        this.breed = breed;
        this.bark=bark;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", breed='" + breed + '\'' +
                ", bark='" + bark + '\'' +
                '}';
    }
}
