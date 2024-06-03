package design_patterns.builder.car.manual;

import design_patterns.builder.car.builders.manual.CarManualBuilder;
import design_patterns.builder.car.schema.CarSchema;

public class CarManual extends CarSchema {

    private int pageSize;

    public CarManual(CarManualBuilder builder) {
        super(builder);
        this.pageSize = builder.getPageSize();
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "pageSize=" + pageSize +
                "} " + super.toString();
    }
}
