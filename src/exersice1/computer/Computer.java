package exersice1.computer;

import exersice1.builder.ComputerBuilder;

public abstract class Computer {
    public String cpu;
    public String gpu;
    public int ram;
    public int storage;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", Storage='" + storage + '\'' +
                (gpu != null ? ", GPU='" + gpu + '\'' : "") +
                '}';
    }
}
