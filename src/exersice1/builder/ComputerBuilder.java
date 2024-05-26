package exersice1.builder;

import exersice1.computer.Computer;

public abstract class ComputerBuilder {
    private String gpu;
    private String cpu;
    private int ram;
    private int storage;

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public ComputerBuilder() {
        this.cpu = "Default CPU";
        this.ram = 16;
        this.storage = 512;
    }

    public ComputerBuilder(String cpu, int ram, int storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(int compCase) {
        this.ram = compCase;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public abstract Computer build();
}
