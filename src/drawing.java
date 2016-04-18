import processing.core.PApplet;



public class drawing extends PApplet{
    int BLACK = color(0);//creating variable for black
    int WHITE = color(255);//variable for white
    int BLUE = color(0,0,255);//variable for blue
    int RED = color(185,0,0);//variable for red
    int YELLOW = color(255,255,0);//variable for yellow
    int PURPLE = color(156,23,176);
    int LIME = color(0,255,9);
    int GREEN = color(14,201,14);
    int ORANGE = color(255,165,7);
    int BROWN = color(139,106,47);
    int TURQUOISE = color(52,240,140);
    int GREY = color(160,160,160);
    int color_select = color(0,0,0);
    int mode;

    float posX, posY;
    int thickness = 1;

    Colors col;




    public void settings()
    {

        size(1900,1000);
        smooth();
        col = new Colors();

    }

    public void setup()
    {
        background(255);
    }

    public void draw()
    {

        //background(255);
        col.draw_color_buttons();
        //increase_size();

    }


    public static void main(String[] args) {
        PApplet.main(drawing.class.getName());
    }
}
