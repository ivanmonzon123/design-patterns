package design_patterns.builder.car;

import design_patterns.builder.car.builders.manual.CarManualBuilder;
import design_patterns.builder.car.builders.model.CarModelBuilder;
import design_patterns.builder.car.enums.CarModelType;
import design_patterns.builder.car.manual.CarManual;
import design_patterns.builder.car.model.CarModel;

public class BuilderMainExecutor {
    public static void main(String[] args) {
        CarModel lambo = new CarModelBuilder()
                .setColor("Red")
                .setHeight("1.5m")
                .setModelType(CarModelType.LAMBO)
                .setDoorsNumber(2).build();

        CarManual lamboManual = new CarManualBuilder()
                .setColor("Red")
                .setHeight("1.5m")
                .setModelType(CarModelType.LAMBO)
                .setDoorsNumber(2).build();

        System.out.println(lambo);
        System.out.println(lamboManual);
    }
}
