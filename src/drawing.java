import processing.core.PApplet;



public class drawing extends PApplet{
    public static int BLACK ;//creating variable for black
    public static int WHITE ;//variable for white
    public static int BLUE ;//variable for blue
    public static int RED ;//variable for red
    public static int YELLOW ;//variable for yellow
    public static int PURPLE ;
    public static int LIME ;
    public static int GREEN ;
    public static int ORANGE;
    public static int  BROWN ;
    public static int TURQUOISE;
    public static  int  GREY ;
   public static int color_select ;
    public  static int mode;



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
        BLACK = color(0);//creating variable for black
        WHITE = color(255);//variable for white
        BLUE = color(0,0,255);//variable for blue
        RED = color(185,0,0);//variable for red
        YELLOW = color(255,255,0);//variable for yellow
        PURPLE = color(156,23,176);
        LIME = color(0,255,9);
        GREEN = color(14,201,14);
        ORANGE = color(255,165,7);
        BROWN = color(139,106,47);
        TURQUOISE = color(52,240,140);
        GREY = color(160,160,160);

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
