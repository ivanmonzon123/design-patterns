package design_patterns.builder.car.schema;

import design_patterns.builder.car.builders.schema.CarBuilderSchema;
import design_patterns.builder.car.enums.CarModelType;

public abstract class CarSchema {
    private String color;
    private String height;
    private int doorsNumber;
    private CarModelType modelType;

    public <T extends CarSchema> CarSchema(CarBuilderSchema<T> builder) {
        this.color = builder.getColor();
        this.modelType = builder.getModelType();
        this.doorsNumber = builder.getDoorsNumber();
        this.modelType = builder.getModelType();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public CarModelType getModelType() {
        return modelType;
    }

    public void setModelType(CarModelType modelType) {
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "CarSchema{" +
                "color='" + color + '\'' +
                ", height='" + height + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", modelType=" + modelType +
                '}';
    }
}
