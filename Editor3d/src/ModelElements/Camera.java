package ModelElements;

import Staff.Angle3D;
import Staff.Point3D;

public class Camera {

    public Point3D location;
    public Angle3D angle;

    public Camera() {
        this.location = new Point3D();
        this.angle = new Angle3D();
    }

    public void rotate(Angle3D rotateAngle){}
    public void move(Point3D movePoint){}
}
