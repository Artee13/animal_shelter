package com.keyin;

public abstract class Animal {
    private int order;
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public boolean isOlderThan(Animal other) {
        return this.order < other.getOrder();
    }
}
