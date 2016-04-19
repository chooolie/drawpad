import processing.core.PApplet;

/**
 * Created by Chloe on 19/04/2016.
 */
public class Draw_sqr extends PApplet
{

    float x, y, x2, y2;
    int col;
    public Draw_sqr(float initPosX, float initPosY, int col)
    {
        this.x = initPosX;
        this.y = initPosY;
        this.col = col;
    }

    public void updateSize(float endx, float endy)
    {
        x2 = endx;
        y2 = endy;
    }

    public Draw_sqr copy()
    {
        Draw_sqr s = new Draw_sqr(x,y,col);
        s.updateSize(x2,y2);
        return s;
    }

    public void display()
    {
        pushMatrix();
        translate(x,y);
        fill(col);
        rect(0,0,x2-x,y2-y);
        popMatrix();
    }
}
