package design_patterns.builder.car.builders.schema;

import design_patterns.builder.car.builders.interfaces.Builder;
import design_patterns.builder.car.enums.CarModelType;
import design_patterns.builder.car.schema.CarSchema;

public abstract class CarBuilderSchema<T extends CarSchema> implements Builder<T> {
    private String color;
    private String height;
    private int doorsNumber;
    private CarModelType modelType;
    protected T carInstance;

    //TODO: Those methods are going to be implemented in their concrete classes
    @Override
    public void reset() {
        this.setColor(null);
        this.setModelType(null);
        this.setHeight(null);
        this.setDoorsNumber(0);
    }

    ;
//    public abstract CarSchema build();

    public String getColor() {
        return color;
    }

    public CarBuilderSchema<T> setColor(String color) {
        this.color = color;
        this.carInstance.setColor(color);
        return this;
    }

    public String getHeight() {
        return height;
    }

    public CarBuilderSchema<T> setHeight(String height) {
        this.height = height;
        this.carInstance.setHeight(height);
        return this;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public CarBuilderSchema<T> setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
        this.carInstance.setDoorsNumber(doorsNumber);
        return this;
    }

    public CarModelType getModelType() {
        return modelType;
    }

    public CarBuilderSchema<T> setModelType(CarModelType modelType) {
        this.modelType = modelType;
        this.carInstance.setModelType(modelType);
        return this;
    }
}
