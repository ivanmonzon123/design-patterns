package exersice1.builder;

import exersice1.computer.Laptop;

public class LaptopBuilder extends ComputerBuilder {

    private int size;

    public int getSize() {
        return size;
    }

    public LaptopBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public Laptop build() {
        return new Laptop(this);
    }
}
