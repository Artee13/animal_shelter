package com.keyin;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private final Queue<Dog> dogs = new LinkedList<>();
    private final Queue<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order++);

        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else {
            throw new IllegalArgumentException("Only dogs and cats are allowed.");
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) return null;
        if (dogs.isEmpty()) return dequeueCat();
        if (cats.isEmpty()) return dequeueDog();

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        return dog.isOlderThan(cat) ? dogs.poll() : cats.poll();
    }

    public Dog dequeueDog() {
        return dogs.isEmpty() ? null : dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.isEmpty() ? null : cats.poll();
    }
}
