package hw_1.model_elements;

public class Camera {

    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D a) {
    }

    public void move(Point3D p) {
    }
}
