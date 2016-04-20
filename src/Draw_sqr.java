import processing.core.PApplet;


/**
 * Created by Chloe on 19/04/2016.
 */
public class Draw_sqr extends PApplet
{

    float x, y, x2, y2;
    //Square has 4 points and a colour
    //later passing mouse position and the colour to it
    int col;
    public Draw_sqr(float initPosX, float initPosY, int col)
    {
        this.x = initPosX;
        this.y = initPosY;
        this.col = col;
    }

    public void updateSize(float endx, float endy)
    {
        //pass the current mouse position
        // allows the square to be resized
        x2 = endx;
        y2 = endy;
    }
    //once mouse released square shouldnt change in size
    //but still needs to be shown
    //so collection to save all the squares need to be created
    //a current square and one untill mouse is released

    public Draw_sqr copy()
    {
        Draw_sqr s = new Draw_sqr(x,y,col);
        s.updateSize(x2,y2);
        return s;
    }

    public void display()
    {
        //creates the square
        pushMatrix();
        translate(x,y);
        fill(col);
        rect(0,0,x2-x,y2-y);
        popMatrix();
    }
}
