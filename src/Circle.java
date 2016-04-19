import processing.core.PApplet;

/**
 * Created by Chloe on 19/04/2016.
 */
public class Circle extends PApplet
{

    float x, y, x2, y2;
    int col;
    public Circle(float initPosX, float initPosY, int col) {
        this.x = initPosX;
        this.y = initPosY;
        this.col = col;
    }

    public void updateSize(float endx, float endy) {
        x2 = endx;
        y2 = endy;
    }

    public Circle copy() {
        Circle s = new Circle(x,y,col);
        s.updateSize(x2,y2);
        return s;
    }

    public void display() {
        pushMatrix();
        translate(x,y);
        fill(col);
        ellipse(0,0,x2-x,y2-y);
        popMatrix();
    }
}
