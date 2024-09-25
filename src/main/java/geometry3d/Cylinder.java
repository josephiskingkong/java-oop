package geometry3d;

import Exceptions.InvalidGeometryException;
import geometry2d.Circle;

public class Cylinder {
    private final Circle base;
    private final double height;

    public Cylinder(Circle base, double height) throws InvalidGeometryException {
        if (base == null) {
            throw new InvalidGeometryException("Base circle cannot be null.");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return this.base.area() * this.height;
    }
}
