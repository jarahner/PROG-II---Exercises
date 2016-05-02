package exercise02;

/******* AUFGABE FERTIG BEARBEITET *******/ 

public class Triangle implements Polygon {
	
	private Point[] vertexes = new Point[3];
	
	//main method
	public static void main(String[] args) {
		Triangle t1 = new Triangle(new Point(0.0, 0.0), new Point(1.0, 0.0), new Point(0.0, 1.0));
		System.out.println("Point1: " + t1.allVertexes()[0].toString());
		System.out.println("Point2: " + t1.allVertexes()[1].toString());
		System.out.println("Point3: " + t1.allVertexes()[2].toString());
		
		System.out.println("Umfang: " + t1.perimeter());
		System.out.println("Fläche: " + t1.area());
		
		System.out.println("Move the polygon by the distance: +2.0, -2.0");
		t1.move(2.0, -2.0);
		System.out.println("Point1: " + t1.allVertexes()[0].toString());
		System.out.println("Point2: " + t1.allVertexes()[1].toString());
		System.out.println("Point3: " + t1.allVertexes()[2].toString());
	}//endmethod main

	
	//Konstruktor
	public Triangle(Point p1, Point p2, Point p3) {
		vertexes[0] = p1;
		vertexes[1] = p2;
		vertexes[2] = p3;
	}//end Konstruktor
	
	
	@Override
	public Point[] allVertexes() {
		return vertexes;
	}

	@Override
	public double perimeter() {
		return vertexes[0].distance(vertexes[1]) + vertexes[1].distance(vertexes[2]) + vertexes[2].distance(vertexes[0]);
	}

	@Override
	public double area() {
		double s = perimeter()/2;
		double a = vertexes[0].distance(vertexes[1]);
		double b = vertexes[1].distance(vertexes[2]);
		double c = vertexes[0].distance(vertexes[2]);
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public void move(double dx, double dy) {
		for(int i=0; i<vertexes.length; i++){
			//System.out.println("Point" + i + ": " + vertexes[i].toString());
			vertexes[i] = vertexes[i].moved(dx, dy);
			//System.out.println("Moved Point" + i + ": " + vertexes[i].toString());
		}
	}//endmethod move
	
} //end class Triangle




