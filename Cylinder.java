//using getter setter and constructor
public class Cylinder {
public int radius;
public int height;
public Cylinder(int r,int h)
{
	radius=r;
	height=h;
}

	public Cylinder() {
	// TODO Auto-generated constructor stub
}

	public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}
	public double surfacearea()
	{
		return 2*3.14*this.radius*this.radius+2*3.14*this.radius*this.height;
		
	}
	public double volume() {
        return 3.14 * radius * radius * height;
    }
	public static void main(String[] args) {
		Cylinder c=new Cylinder();
		c.setHeight(12);
		System.out.println("Height is:"+c.getHeight());
		c.setRadius(7);
		System.out.println("Radius is:"+c.getRadius());
		System.out.println("Surface area of cylinder is:"+c.surfacearea());
		System.out.println("Volume of cylinder is:"+c.volume());
	}

}
