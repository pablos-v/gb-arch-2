package hw_1.model_elements;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;


    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D a) {
    }

    public void move(Point3D p) {
    }
}
