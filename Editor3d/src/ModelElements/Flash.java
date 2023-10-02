package ModelElements;

import Staff.Angle3D;
import Staff.Color;
import Staff.Point3D;

public class Flash {
    
    public Point3D location;
    public Angle3D angle3D;
    public Color color;
    public Float power;

    public Flash() {
        this.location = new Point3D();
        this.angle3D = new Angle3D();
        this.color = new Color();
        this.power = null;
    }

    public void rotate(Angle3D rotateAngle){}
    public void move(Point3D movePoint){}
}
