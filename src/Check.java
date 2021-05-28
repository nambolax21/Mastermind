import java.util.ArrayList;

import doodlepad.*;

public class Check extends Rectangle {
	//counts turns
	private int t = 0;
	Board b1 = new Board();
	
	
	private String[] strColors;
	private String[] actColors;
	private int[] pins;
	static ArrayList<Oval> pinOvals = new ArrayList<Oval>(); 
	

    public Check(String[] strColors, String[] colors, ArrayList<Oval> pinOvals) {
        super(350, 500, 100, 20);
        this.setFillColor(0, 0, 0, 25);
        this.strColors = strColors;
        actColors = colors;
        //writes Check in the box  - button like
        new Text("Check!", 380, 505);
        new Text("Black pins are color, red pins are position and color", 340, 530);
        pins = new int[2];
        this.pinOvals = pinOvals; 
        this.setMouseClickedHandler(this::onPressed);
        
    }


	public void onPressed(Shape shp, double x, double y, int button) {
//now connect colors into array and send array to mastermind code
    	t++;
    	System.out.println(strColors[0]);
        this.setFillColor(0, 125, 0);
        pins = b1.checkGuesses(strColors, actColors); 
        System.out.println(pins[1]);
        for(int i = 0; i < 2; i++) {
			System.out.println(pins[i]);	
		}
        
        for(int j = pinOvals.size() - 1 - (4*(t-1)); j > pinOvals.size() - 1 - pins[0]- (4*(t-1)); j--) {
			pinOvals.get(j).setFillColor(227, 0, 0);
		}
        
        int min = pinOvals.size() - pins[0] - 1- (4*(t-1));
        
        for(int k = min; k > min - pins[1]; k--) {
			pinOvals.get(k).setFillColor(0, 0, 0, 255);
		}
        
        if(pins[0] == 4) {
        	new Text("YOU WIN!", 500, 500, 24);
        }
       //for(int a = pinOvals.size() - 1
        
    }
	
	public int getT() {
		return t;
	}
	
	
    
   /* public void checkColors(String[] strColors) {
    	int[] pins = b1.checkGuesses(strColors);
    	
    }*/
    
    
}