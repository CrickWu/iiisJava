import java.util.Scanner;

public class Exercise08_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a, b, c, d, e, f: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();

    LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

    if (equation.isSolvable()) {
      System.out.println("x is " +
        equation.getX() + " and y is " + equation.getY());
    }
    else {
      System.out.println("The equation has no solution");
    }
  }
}

class LinearEquation {
	private double a, b, c, d, e, f;
	public LinearEquation(double a, double b, double c,
			double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getD() {
		return this.d;
	}
	public double getE() {
		return this.e;
	}
	public double getF() {
		return this.f;
	}
	public boolean isSolvable() {
		return !(Math.abs(a * d - b * c) <= 1e-6);
	}
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}

