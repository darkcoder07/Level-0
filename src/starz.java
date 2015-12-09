import org.teachingextensions.logo.Tortoise;



public class starz {

	public static void main(String[]args) {
	
int X = 150;	
Tortoise.setX(100);	
Tortoise.setSpeed(10);
Tortoise.show();	
for (int a=0; a<10; a++) {	
for (int i=0; i<20; i++) {	
Tortoise.move(30);	
Tortoise.turn(144);	

}	
	
Tortoise.penUp();
Tortoise.setX(X);	
Tortoise.penDown();
X=X+50;
}	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
