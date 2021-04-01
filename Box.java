import doodlepad.*;

public class Box {
    public static void main(String[] args) {
    
        Rectangle box = new Rectangle(50, 60, 700, 400);
        box.setFillColor(115, 77, 141);
        for(int y = 80; y < 380; y += 75) {
        	for(int x = 70; x <= 742; x +=71) {
        		new Oval(x, y, 30, 30);
        	}
        }
        for(int y = 0; y < 4; y++) {
        	for(int x = 0; x < 10; x++) {
        		new Oval(x*71 + 80, y*20 + 370, 5, 5);
        	}
        }
        
        Oval yellow = new Oval(800, 70, 30, 30);
        yellow.setFillColor(255, 255, 0);
        
        Oval green = new Oval(800, 136, 30, 30);
        green.setFillColor(0, 132, 0);
        
        Oval blue = new Oval(800, 202, 30, 30);
        blue.setFillColor(0, 0, 138);
        
        Oval red = new Oval(800, 268, 30, 30);
        red.setFillColor(227, 0, 0);
        
        Oval pink = new Oval(800, 334, 30, 30);
        pink.setFillColor(233, 0, 255);
        
        Oval orange = new Oval(800, 400, 30, 30);
        orange.setFillColor(255, 118, 0);
        
        Rectangle check = new Rectangle(350, 500, 100, 20);
        check.setFillColor(0, 0, 0, 25);
    }
}
