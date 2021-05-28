import doodlepad.*;
import java.util.ArrayList;

public class Box {
	//yellow Oval 
	public static  Point shppos;
	//public static  Oval yellow;
	static Oval[] checkColors = new Oval[4];
	static String[] strColors = new String[4]; 
	static String[] checkArr = new String[4];
	static ArrayList<Oval> guess = new ArrayList<Oval>();
	static ArrayList<Oval> pins = new ArrayList<Oval>();
	private static Check c1;// = new Check(strColors, colors1, pins);
	
	//declares the ovals in array
	public static Oval green;
	public static Oval yellow;
	public static Oval red;
	public static Oval blue;
	public static Oval pink;
	public static Oval orange;
	
	public static void onRelease(Shape shp, double x, double y, int button) {
		shppos = shp.getLocation();
		//z is the y-coordinate of the original position of the oval so it will come back to that position
		int z;
		if ( shp.equals(green)) {
    		z = 136;		
    	}
    	else if(shp.equals(yellow) == true) {
    		z = 70;
    	}
    	else if(shp.equals(red) == true) {
    		z = 268;
    	}
    	else if(shp == pink) {
    		z = 334;
    	}
    	else if(shp == orange) {
    		z = 400;
    	}
    	else if((Oval) shp == blue) {
    		z = 202;
    	}
    	else {
    		z = 70; }
		
		//for (int  = 0; j < 10; j++) {
			for (int i = 0; i < 4; i++) {
				if (((Math.abs(shppos.getX() - ((9 - c1.getT()) * 71.0 + 70.0))) <= 20.0)
						&& ((Math.abs(shppos.getY() - (i * 75.0 + 80.0))) <= 20.0)) {
					//supposed to assign the oval to that spot
					//now it assigns that color to the oval
					guess.get(guess.size() - 4 - (4*c1.getT()) + i).setFillColor(shp.getFillColor()); 
					shp.setLocation((9-c1.getT()) * 71.0 + 70.0, i * 75.0 + 80.0);
					//returns oval to its initials pos
					shp.setLocation(800, z);
					//checkColors[i] = (Oval) shp; 
					/*for(int r = 0; r < 4; r++) {
				    	if (checkColors[r].equals(green)) {
				    		strColors[r] = "G";
				    	}
				    	else if(checkColors[r] == yellow) {
				    		strColors[r] = "Y";
				    	}
				    	else if(checkColors[r] == red) {
				    		strColors[r] = "R";
				    	}
				    	else if(checkColors[r] == pink) {
				    		strColors[r] = "P";
				    	}
				    	else if(checkColors[r] == orange) {
				    		strColors[r] = "O";
				    	}
				    	else if(checkColors[r] == blue) {
				    		strColors[r] = "B";
				    	}
					}*/
					//checkArr[i] = "x";
					
				}
			}			
		
		for(int i = 0; i < 4; i++) {
	    	if (guess.get(guess.size() - 4 - (4*c1.getT()) + i).getFillColor().equals(green.getFillColor())) {
	    		strColors[i] = "G";
	    	}
	    	else if(guess.get(guess.size() - 4 - (4*c1.getT()) + i).getFillColor() == yellow.getFillColor()) {
	    		strColors[i] = "Y";
	    	}
	    	else if(guess.get(guess.size() - 4 - (4*c1.getT()) + i).getFillColor() == red.getFillColor()) {
	    		strColors[i] = "R";
	    	}
	    	else if(guess.get(guess.size() - 4 - (4*c1.getT()) + i).getFillColor() == pink.getFillColor()) {
	    		strColors[i] = "P";
	    	}
	    	else if(guess.get(guess.size() - 4 - (4*c1.getT()) + i).getFillColor() == orange.getFillColor()) {
	    		strColors[i] = "O";
	    	}
	    	else if(guess.get(guess.size() - 4 - (4*c1.getT()) + i).getFillColor() == blue.getFillColor()) {
	    		strColors[i] = "B";
	    	}
		}
		//colorToString();
		
		for(int i = 0; i < 4; i++) {
			System.out.println(strColors[i]);
			//System.out.println(checkArr[i]);
		}
	}
	
	/*public Box() {
		
		//int turn = 0;
				Rectangle box = new Rectangle(50, 60, 700, 400);
				box.setFillColor(115, 77, 141);
				//Ovals for the user's guesses
				for (int y = 80; y < 380; y += 75) {
					for (int x = 70; x <= 742; x += 71) {
						new Oval(x, y, 30, 30);
					}
				}
				//Ovals for pins
				for (int y = 0; y < 4; y++) {
					for (int x = 0; x < 10; x++) {
						new Oval(x * 71 + 80, y * 20 + 370, 5, 5);
					}
				}
				
				

				Oval yellow = new Oval(800, 70, 30, 30);
				yellow.setFillColor(255, 255, 0);
				yellow.setDraggable(true);
				Point yelpos = yellow.getCenter();
				yellow.setMouseReleasedHandler(Box::onRelease);

				
				


				Oval green = new Oval(800, 136, 30, 30);
				green.setFillColor(0, 132, 0);
				green.setDraggable(true);

				Oval blue = new Oval(800, 202, 30, 30);
				blue.setFillColor(0, 0, 138);
				blue.setDraggable(true);

				Oval red = new Oval(800, 268, 30, 30);
				red.setFillColor(227, 0, 0);
				red.setDraggable(true);

				Oval pink = new Oval(800, 334, 30, 30);
				pink.setFillColor(233, 0, 255);
				pink.setDraggable(true);

				Oval orange = new Oval(800, 400, 30, 30);
				orange.setFillColor(255, 118, 0);
				orange.setDraggable(true);

				Check c = new Check();

	}*/
	
	public void colorToString() {
		for(int i = 0; i < 4; i++) {
	    	if (checkColors[i] == green) {
	    		strColors[i] = "G";
	    	}
	    	else if(checkColors[i] == yellow) {
	    		strColors[i] = "Y";
	    	}
	    	else if(checkColors[i] == red) {
	    		strColors[i] = "R";
	    	}
	    	else if(checkColors[i] == pink) {
	    		strColors[i] = "P";
	    	}
	    	else if(checkColors[i] == orange) {
	    		strColors[i] = "O";
	    	}
	    	else if(checkColors[i] == blue) {
	    		strColors[i] = "B";
	    	}
		}
	}
	public static void main(String[] args) {
		
		
		Rectangle box = new Rectangle(50, 60, 700, 400);
		box.setFillColor(115, 77, 141);
		//Ovals for the user's guesses
		for (int x = 70; x <= 742; x += 71) {
			for (int y = 80; y < 380; y += 75) {
				Oval g = new Oval(x, y, 30, 30);
				guess.add(g);
			}
		}
		System.out.println(guess.size());
		
		//Ovals for pins
		
			for (int x = 0; x < 10; x++) {
				for (int y = 0; y < 4; y++) {
				Oval p = new Oval(x * 71 + 80, y * 20 + 370, 5, 5);
				pins.add(p);
			}
		}
		System.out.println(pins.size());
		
		//creates an array list to store all the color of the Ovals
		ArrayList<Oval> colors = new ArrayList<Oval>();
		//Oval[] checkColors = new Oval[4];
		yellow = new Oval(800, 70, 30, 30);
		yellow.setFillColor(255, 255, 0);	
		colors.add(yellow);
		

		green = new Oval(800, 136, 30, 30);
		green.setFillColor(0, 132, 0);		
		colors.add(green);
		
		
		blue = new Oval(800, 202, 30, 30);
		blue.setFillColor(0, 0, 138);		
		colors.add(blue);
		
		red = new Oval(800, 268, 30, 30);
		red.setFillColor(227, 0, 0);
		colors.add(red);
		

		pink = new Oval(800, 334, 30, 30);
		pink.setFillColor(233, 0, 255);
		colors.add(pink);

		orange = new Oval(800, 400, 30, 30);
		orange.setFillColor(255, 118, 0);
		colors.add(orange);
		
		for(Oval oval: colors) {
			//makes them dragable
			oval.setDraggable(true);
			//makes them click into place
			double x = oval.getX();
			oval.setMouseReleasedHandler(Box::onRelease);
		}
		
		
		/*for(int i = 0; i < 4; i++) {
	    	if (checkColors[i] == green) {
	    		strColors[i] = "G";
	    	}
	    	else if(checkColors[i] == yellow) {
	    		strColors[i] = "Y";
	    	}
	    	else if(checkColors[i] == red) {
	    		strColors[i] = "R";
	    	}
	    	else if(checkColors[i] == pink) {
	    		strColors[i] = "P";
	    	}
	    	else if(checkColors[i] == orange) {
	    		strColors[i] = "O";
	    	}
	    	else if(checkColors[i] == blue) {
	    		strColors[i] = "B";
	    	}
		}*/
		
		
		/*for(int i = 0; i < 4; i++) {
			System.out.println(strColors[i]);
		}*/ 
		/*for(int i = 0; i < 4; i++) {
	    	if (guess.get(guess.size() - 4 + i).getFillColor().equals(green.getFillColor())) {
	    		strColors[i] = "G";
	    	}
	    	else if(guess.get(guess.size() - 4 + i).getFillColor() == yellow.getFillColor()) {
	    		strColors[i] = "Y";
	    	}
	    	else if(guess.get(guess.size() - 4 + i).getFillColor() == red.getFillColor()) {
	    		strColors[i] = "R";
	    	}
	    	else if(guess.get(guess.size() - 4 + i).getFillColor() == pink.getFillColor()) {
	    		strColors[i] = "P";
	    	}
	    	else if(guess.get(guess.size() - 4 + i).getFillColor() == orange.getFillColor()) {
	    		strColors[i] = "O";
	    	}
	    	else if(guess.get(guess.size() - 4 + i).getFillColor() == blue.getFillColor()) {
	    		strColors[i] = "B";
	    	}
		}*/
		
		for(int i = 0; i < 4; i++) {
			System.out.println(strColors[i]);
			//System.out.println(checkArr[i]);
		}
		Board b1 = new Board();
		b1.pickColorsFrom();
		String[] colors1 = b1.setColors();
		for(int i = 0; i < 4; i++) {
			System.out.println(colors1[i]);
		}
		c1 = new Check(strColors, colors1, pins);
		
		
		
		
		//int[] redBlackPins = c1.getPins();
		
		
		
		
		
		//c1.checkColors(String [] strColors[i]);

	}
}
