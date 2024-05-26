package exersice1.computer;

import exersice1.builder.ComputerBuilder;
import exersice1.builder.DesktopBuilder;

public class DesktopPc extends Computer {
    private String computerCase;

    public DesktopPc(DesktopBuilder builder) {
        this.cpu = builder.getCpu();
        this.gpu = builder.getGpu();
        this.ram = builder.getRam();
        this.storage = builder.getStorage();
        this.computerCase = builder.getComputerCase();
    }

    @Override
    public String toString() {
        return super.toString() + "CompCase: " + this.computerCase;
    }
}
