import java.util.ArrayList;

import doodlepad.*;

public class Check extends Rectangle {
	//counts turns
	private int t = 0;
	
	//creates a board class
	Board b1 = new Board();
	
	//string[] of color guesses
	private String[] strColors;
	//actual colors
	private String[] actColors;
	//number of red and black pins in an array
	private int[] pins;
	
	//all ovals that are pin ovals
	static ArrayList<Oval> pinOvals = new ArrayList<Oval>(); 
	
	//check constructor
    public Check(String[] strColors, String[] colors, ArrayList<Oval> pinOvals) {
    	//sends stuff to parent rectangle class
        super(350, 500, 100, 20);
        //check button
        this.setFillColor(0, 0, 0, 25);
        this.strColors = strColors;
        actColors = colors;
        //writes Check in the box  - button like
        new Text("Check!", 380, 505);
        //instructions about pins
        new Text("Black pins are color, red pins are position and color", 340, 530);
        pins = new int[2];
        this.pinOvals = pinOvals; 
        //the actual check part of the button
        this.setMouseClickedHandler(this::onPressed);
        
    }


	public void onPressed(Shape shp, double x, double y, int button) {
//now connect colors into array and send array to mastermind code
    	t++;
    	//turn augment
    	System.out.println(strColors[0]);
        this.setFillColor(0, 125, 0);//turns button green
        pins = b1.checkGuesses(strColors, actColors);//checking part of the code
        //System.out.println(pins[1]);
        for(int i = 0; i < 2; i++) {
			System.out.println(pins[i]);	
		}
        //this prints red pins
        for(int j = pinOvals.size() - 1 - (4*(t-1)); j > pinOvals.size() - 1 - pins[0]- (4*(t-1)); j--) {
			pinOvals.get(j).setFillColor(227, 0, 0);
		}
        //prints black pins
        int min = pinOvals.size() - pins[0] - 1- (4*(t-1));
        
        for(int k = min; k > min - pins[1]; k--) {
			pinOvals.get(k).setFillColor(0, 0, 0, 255);
		}
        
        //if we win the game, it prints out you win
        if(pins[0] == 4) {
        	new Text("YOU WIN!", 500, 500, 24);
        }
       //for(int a = pinOvals.size() - 1
        
    }
	//accessor method
	public int getT() {
		return t;
	}
	
	
    
   /* public void checkColors(String[] strColors) {
    	int[] pins = b1.checkGuesses(strColors);
    	
    }*/
    
    
}