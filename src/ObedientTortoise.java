
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
public class ObedientTortoise {
public static void main(String[] args) {
Tortoise.setSpeed(8);
Color tortoisecolor = Color.BLACK;	
	
	
	
String color = JOptionPane.showInputDialog("What color do you want? (pls be kind and only do primaries/secondaries) ");	
if (color.equalsIgnoreCase("red")) {
tortoisecolor=Color.RED;	
}
 if (color.equalsIgnoreCase("blue")) {
	 tortoisecolor=Color.BLUE;	
}
if (color.equalsIgnoreCase("green")) {
	tortoisecolor=Color.GREEN;	
}
if (color.equalsIgnoreCase("yellow")) {
	tortoisecolor=Color.YELLOW;	
}
if (color.equalsIgnoreCase("orange")) {
	tortoisecolor=Color.ORANGE;
}
if (color.equalsIgnoreCase("purple")) {
	tortoisecolor=Color.MAGENTA;	
}
if (color.equalsIgnoreCase("cyan")) {
	tortoisecolor=Color.CYAN;	
}
if (color.equalsIgnoreCase("dark gray")) {
	tortoisecolor=Color.DARK_GRAY;
}
if (color.equalsIgnoreCase("gray")) {
	tortoisecolor=Color.GRAY;
	
	if (color.equalsIgnoreCase("black")) {
		tortoisecolor=Color.BLACK;	
	}
	if (color.equalsIgnoreCase("light gray")) {
		tortoisecolor=Color.LIGHT_GRAY;	
	}
}
String shape = JOptionPane.showInputDialog("Which shape do you want? (All polygons up to 7 and circles)");		
if (shape.equalsIgnoreCase("square")) {
Tortoise.setPenColor(tortoisecolor);
drawSquare();	
	
}
else if (shape.equalsIgnoreCase("circle")) {	
	Tortoise.setPenColor(tortoisecolor);
	turnCircle();	
	
}
else if (shape.equalsIgnoreCase("triangle")) {
	Tortoise.setPenColor(tortoisecolor);
	drawTriangle();		
}
else if (shape.equalsIgnoreCase("pentagon")) {
	Tortoise.setPenColor(tortoisecolor);
	drawPentagon();		
}
else if (shape.equalsIgnoreCase("hexagon")) {
	Tortoise.setPenColor(tortoisecolor);
	drawHectagon();		
}
else if (shape.equalsIgnoreCase("septagon")) {
	Tortoise.setPenColor(tortoisecolor);
	drawSeptagon();		
}












}	

	private static void turnCircle() {
for (int i=0; i<360/5; i++) {
		Tortoise.turn(5);
		Tortoise.move(4);
}	
	}

	private static void drawSquare() {
		for (int i=0; i<4; i++) {
		
		
		Tortoise.move(100);
		Tortoise.turn(90);
		}
	}
	private static void drawTriangle() {
		for (int i=0; i<3; i++) {
		
		
		Tortoise.move(100);
		Tortoise.turn(120);
		}
	}
	private static void drawPentagon() {
		for (int i=0; i<5; i++) {
		
		
		Tortoise.move(100);
		Tortoise.turn(360/5);
		}
	}
	private static void drawHectagon() {
		for (int i=0; i<6; i++) {
		
		
		Tortoise.move(100);
		Tortoise.turn(360/6);
		}
	}
	private static void drawSeptagon() {
		for (int i=0; i<7; i++) {
		
		
		Tortoise.move(100);
		Tortoise.turn(360/7);
		}
	}
} 
