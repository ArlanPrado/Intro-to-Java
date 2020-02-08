package hw08a;
import java.awt.Rectangle;

public class RectanglesTester
{


	public static void main(String[] args)
	{
		Rectangle[] recs = {
				new Rectangle(30, 50,  5, 20),
				new Rectangle(20, 40, 50, 40),
				new Rectangle(10, 10, 20, 10),
				new Rectangle(50, 10, 2, 8)
		};

		Rectangles processor = new Rectangles(recs);


		System.out.printf("Average: %.2f\n", processor.averageArea());
		System.out.println("Expected: 579.00");

		processor.swapMaxAndMin();
		System.out.println(processor.toString());
		System.out.println("Expected: [java.awt.Rectangle[x=30,y=50,width=5,height=20], java.awt.Rectangle[x=50,y=10,width=2,height=8], java.awt.Rectangle[x=10,y=10,width=20,height=10], java.awt.Rectangle[x=20,y=40,width=50,height=40]]");

		Rectangle[] recs2 = {
				new Rectangle(30, 50,  5, 20),
				new Rectangle(20, 40, 50, 40),
				new Rectangle(10, 10, 20, 10),
		};

		Rectangles processor2 = new Rectangles(recs2);


		System.out.printf("Average: %.2f\n", processor2.averageArea());
		System.out.println("Expected: 766.67");

		processor2.swapMaxAndMin();
		System.out.println(processor2.toString());
		System.out.println("Expected: [java.awt.Rectangle[x=20,y=40,width=50,height=40], java.awt.Rectangle[x=30,y=50,width=5,height=20], java.awt.Rectangle[x=10,y=10,width=20,height=10]]");

	}
}