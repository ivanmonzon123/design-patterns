package design_patterns.builder.car.builders.manual;

import design_patterns.builder.car.builders.schema.CarBuilderSchema;
import design_patterns.builder.car.manual.CarManual;

public class CarManualBuilder extends CarBuilderSchema<CarManual> {
    private int pageSize;

    public CarManualBuilder() {
        this.carInstance = new CarManual(this);
    }

    public int getPageSize() {
        return pageSize;
    }

    public CarManualBuilder setPageSize(int pageSize) {
        this.pageSize = pageSize;
        this.carInstance.setPageSize(pageSize);
        return this;
    }

    @Override
    public void reset() {
        super.reset();
        this.setPageSize(0);
        this.carInstance = new CarManual(this);
    }

    @Override
    public CarManual build() {
        return this.carInstance;
    }
}
