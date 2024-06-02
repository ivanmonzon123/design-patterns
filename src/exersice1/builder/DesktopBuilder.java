package exersice1.builder;

import exersice1.computer.Computer;
import exersice1.computer.DesktopPc;
import exersice1.computer.Laptop;

public class DesktopBuilder extends ComputerBuilder {

    private String computerCase;

    public String getComputerCase() {
        return computerCase;
    }

    public DesktopBuilder setComputerCase(String computerCase) {
        this.computerCase = computerCase;
        return this;
    }

    @Override
    public DesktopPc build() {
        return new DesktopPc(this);
    }
}
