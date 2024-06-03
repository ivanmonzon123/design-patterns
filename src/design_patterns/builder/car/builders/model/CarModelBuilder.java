package design_patterns.builder.car.builders.model;

import design_patterns.builder.car.builders.schema.CarBuilderSchema;
import design_patterns.builder.car.model.CarModel;

import java.util.Date;

public class CarModelBuilder extends CarBuilderSchema<CarModel> {
    private Date releaseDate;

    public CarModelBuilder() {
        this.carInstance = new CarModel(this);
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public CarModelBuilder setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        this.carInstance.setReleaseDate(releaseDate);
        return this;
    }

    @Override
    public void reset() {
        super.reset();
        this.setReleaseDate(null);
        this.carInstance = new CarModel(this);
    }

    @Override
    public CarModel build() {
        return this.carInstance;
    }
}
