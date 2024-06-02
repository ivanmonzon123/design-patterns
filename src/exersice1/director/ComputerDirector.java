package exersice1.director;

import exersice1.builder.ComputerBuilder;
import exersice1.builder.DesktopBuilder;
import exersice1.builder.LaptopBuilder;

public class ComputerDirector<T extends ComputerBuilder> {
    private T builder;

    public ComputerDirector(T builder) {
        this.builder = builder;
    }

    public void setBuilder(T builder) {
        this.builder = builder;
    }

    public LaptopBuilder buildLaptop() {
        this.builder
                .setCpu("Laptop cpu")
                .setRam(16)
                .setStorage(256);

        return (LaptopBuilder) this.builder;
    }

    public DesktopBuilder buildDesktop() {
        this.builder
                .setCpu("Desktop cpu")
                .setRam(16)
                .setStorage(512);

        return (DesktopBuilder) this.builder;
    }
}
