import exersice1.builder.DesktopBuilder;
import exersice1.builder.LaptopBuilder;
import exersice1.computer.DesktopPc;
import exersice1.computer.Laptop;
import exersice1.director.ComputerDirector;

public class Main {
    //Account example

    /**
     * public static void main(String[] args) {
     * Account account = new Account("This is a title", 150.0);
     * account.addAmount(170.0);
     * System.out.println(account.toString());
     * }
     */

    //Builder example
    public static void main(String[] args) {
        Laptop laptop = (Laptop) new ComputerDirector(new LaptopBuilder()).buildLaptop().setSize(17).build();
        DesktopPc desktopPc = (DesktopPc) new ComputerDirector(new DesktopBuilder()).buildDesktop().setComputerCase("This is the case").build();
        System.out.println(laptop.toString());
        System.out.println(desktopPc.toString());
    }
}