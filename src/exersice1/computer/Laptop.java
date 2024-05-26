package exersice1.computer;

import exersice1.builder.LaptopBuilder;

public class Laptop extends Computer {
    private int size;

    public Laptop(LaptopBuilder builder) {
        this.cpu = builder.getCpu();
        this.gpu = builder.getGpu();
        this.ram = builder.getRam();
        this.storage = builder.getStorage();
        this.size = builder.getSize();
    }

    @Override
    public String toString() {
        return super.toString() + "Size: " + this.size;
    }
}
