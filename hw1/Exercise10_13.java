public class Exercise10_13 {
  public static void main(String[] args) {
    Rectangle2D r1 = new Rectangle2D(2, 2, 5.5, 4.9);
    System.out.println("Area is " + r1.getArea());
    System.out.println("Perimeter is " + r1.getPerimeter());
    System.out.println(r1.contains(3, 3));
    System.out.println(r1.contains(new Rectangle2D(4, 5, 10.5, 3.2)));
    System.out.println(r1.overlaps(new Rectangle2D(3, 5, 2.3, 6.7)));
  }
}

class Rectangle2D {
	private double x, y, width, height;
	public Rectangle2D(double x, double y,
			double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return (width * height);
	}
	public double getPerimeter() {
		return (width * 2 + height * 2);
	}
	public boolean contains(Rectangle2D r) {
		return ((r.x >= x) && (r.y >= y) && ((r.x + r.width) <= (x + width)) && ((r.y + r.height) <= (y + height)));
	}
	public boolean overlaps(Rectangle2D r) {
		return (contains(r.x, r.y) || contains(r.x + r.width, r.y) || contains(r.x, r.y + r.height) || contains(r.x + r.width, r.y + r.height));
	}
	public boolean contains(double x, double y) {
		return ((x >= this.x) && (y >= this.y) && (x <= (this.x + width)) && (y <= (this.y + height)));
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}

