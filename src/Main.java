import java.util.*;


public class Main {
    public static void main(String[] args) {
        /*1*/
        Set<Animal> set = new HashSet<>();
        set.add(new Animal("Bill", 10));
        set.add(new Animal("Bill1", 2));
        set.add(new Animal("Bill2", 7));
        set.add(new Animal("Bill3", 12));


        List<Dog> dogs =new ArrayList<>();
        dogs.add(new Dog("Lusi", 1, "Laika", "Yes"));
        dogs.add(new Dog("Lus1i", 2, "Type2", "Yes"));
        dogs.add(new Dog("Lusi2", 3, "Type3", "No"));

        getCollection(set);
        getCollection(dogs);

        /*2*/

       GenericClass<Integer> operation1 = new GenericClass(2 ,2,1);
       GenericClass<Integer> operation2 = new GenericClass(3 ,4,2);
       GenericClass<Integer> operation3 = new GenericClass(6 ,2,3);
       GenericClass<Integer> operation4 = new GenericClass(5 ,2,4);

    }
    public static void getCollection(Collection<? extends Animal> array){
        for(Animal animal: array){
            System.out.println(animal);
        }
    }

}