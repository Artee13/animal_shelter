package com.keyin;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Bobik"));
        shelter.enqueue(new Cat("Ryzhak"));
        shelter.enqueue(new Dog("Sharik"));
        shelter.enqueue(new Cat("Vasyl"));

        Animal a1 = shelter.dequeueAny();
        System.out.println("dequeueAny -> " + (a1 == null ? "null" : a1.getName()));

        Cat c1 = shelter.dequeueCat();
        System.out.println("dequeueCat -> " + (c1 == null ? "null" : c1.getName()));

        Dog d1 = shelter.dequeueDog();
        System.out.println("dequeueDog -> " + (d1 == null ? "null" : d1.getName()));

        Animal a2 = shelter.dequeueAny();
        System.out.println("dequeueAny -> " + (a2 == null ? "null" : a2.getName()));

        Animal a3 = shelter.dequeueAny();
        System.out.println("dequeueAny (empty) -> " + a3);
    }
}
