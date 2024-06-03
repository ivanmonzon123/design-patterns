package design_patterns.builder.car.model;

import design_patterns.builder.car.builders.model.CarModelBuilder;
import design_patterns.builder.car.schema.CarSchema;

import java.util.Date;

public class CarModel extends CarSchema {

    private Date releaseDate;

    public CarModel(CarModelBuilder builder) {
        super(builder);
        this.releaseDate = builder.getReleaseDate();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "releaseDate=" + releaseDate +
                "} " + super.toString();
    }
}
