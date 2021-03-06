import processing.core.PApplet;
import java.util.ArrayList;


public class drawing extends PApplet
{
    ArrayList<Draw_sqr> squares;
    ArrayList<Circle> circles;

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
    // int mode;
    float posX, posY;
    int thickness = 1;
    int color_select = color(0,0,0);
    int pnt_or_sq = 1;

    Draw_sqr currentSqare;
    Circle currentCircle;

    public void settings()
    {

        size(1900,1000);
        smooth();
        //add  new square when mouse is pressed
        //store in the arraylist
        //keep copy of the square
        squares = new ArrayList<Draw_sqr>();
        circles = new ArrayList<Circle>();
    }

    public void setup()
    {
        background(255);
    }

    public void draw()
    {
        draw_color_buttons();
        if(pnt_or_sq == 1)
        {
            mouse_detect_sq();
        }
        if(pnt_or_sq == 2)
        {
           mouse_detect_cl();
        }
        if(pnt_or_sq == 3)
        {
            mouse_detect_er();
        }

        if(pnt_or_sq == 4)
        {
//            clear_scr.clearr();
//            clear_scr.clear_squares();
//            clear_scr.clear_circles();
//            col.draw_color_buttons();
           pnt_or_sq= 1;
        }

        if(pnt_or_sq == 5)
        {
            drawing_square();
            //so it wont cover color buttons
            draw_color_buttons();

        }
        if(pnt_or_sq == 6)
        {

            drawing_circle();
            // so it wont cover color buttons
            draw_color_buttons();
        }

        //background(255);

        //increase_size();

    }
    void drawing_circle()
    {
        //draw all stored squares first
        for(Circle ce : circles)
        {
            ce.display();
        }

        //if we pressed the mouse
        //and added a new square
        if (currentCircle != null)
        {
            currentCircle.updateSize(mouseX, mouseY);
            currentCircle.display();
        }
    }


    public void draw_color_buttons()
    {

                strokeWeight(4);
                stroke(0);
                //buttons
                fill(WHITE);
                rect(0,0,210,50);
                fill(BLACK);
                textSize(25);
                text("Paintbrush", 25,30);

                fill(WHITE);
                rect(210,0,210,50);
                fill(BLACK);
                textSize(25);
                text("Square", 225,30);

                fill(WHITE);
                rect(420,0,215,50);
                fill(BLACK);
                textSize(25);
                text("Eraser", 435,30);

                fill(WHITE);
                rect(635,0,215,50);
                fill(BLACK);
                textSize(25);
                text("Clear screen", 645,30);

                fill(WHITE);
                rect(850,0,215,50);
                fill(BLACK);
                textSize(25);
                text("Square shape", 860,30);

                fill(WHITE);
                rect(850,50,215,50);
                fill(BLACK);
                textSize(25);
                text("Circle shape", 860,80);

        fill(BLACK);
                rect(0,50,50,50);
                fill(WHITE);
                rect(50,50,50,50);
                fill(BLUE);
                rect(100,50,50,50);
                fill(RED);
                rect(150,50,50,50);
                fill(YELLOW);
                rect(200,50,50,50);
                fill(PURPLE);
                rect(250,50,50,50);
                fill(LIME);
                rect(300,50,50,50);
                fill(GREEN);
                rect(350,50,50,50);
                fill(ORANGE);
                rect(400,50,50,50);
                fill(BROWN);
                rect(450,50,50,50);
                fill(TURQUOISE);
                rect(500,50,50,50);
                fill(GREY);
                rect(550,50,50,50);


                fill(WHITE);
                rect(600,50,50,50);
                stroke(BLACK);
                strokeWeight(2);
                line(610, 75,640, 75 );
                strokeWeight(6);

                fill(WHITE);
                rect(650,50,50,50);
                stroke(BLACK);
                strokeWeight(3);
                line(660, 75,690, 75 );
                strokeWeight(6);

                fill(WHITE);
                rect(700,50,50,50);
                stroke(BLACK);
                strokeWeight(4);
                line(710, 75,740, 75 );
                strokeWeight(6);

                fill(WHITE);
                rect(750,50,50,50);
                stroke(BLACK);
                strokeWeight(5);
                line(760, 75,790, 75 );
                strokeWeight(6);

                fill(WHITE);
                rect(800,50,50,50);
                stroke(BLACK);
                strokeWeight(7);
                line(810, 75,840, 75 );



    }



    public void mouse_detect_cl()//circle paintbrush
    {

        if(mousePressed)
        {



            if (mouseY > 50 && mouseY < 100)
            {
                if (mouseX > 0 && mouseX < 50)
                {
                    color_select = BLACK;
                    //thickness = 2;
                }
                else if (mouseX > 50 && mouseX < 100)
                {
                    color_select = WHITE;
                    //thickness = 2;
                }
                else if (mouseX > 100 && mouseX < 150)
                {
                    color_select = BLUE;
                    //thickness = 2;
                }
                else if (mouseX > 150 && mouseX < 200)
                {
                    color_select = RED;
                    //thickness = 2;
                } else if (mouseX > 200 && mouseX < 250)
                {
                    color_select = YELLOW;
                    //thickness = 2;
                }
                else if (mouseX > 250 && mouseX < 300) {
                    color_select = PURPLE;
                    //thickness = 2;
                }
                else if (mouseX > 300 && mouseX < 350)
                {
                    color_select = LIME;
                    //thickness = 2;
                }
                else if (mouseX > 350 && mouseX < 400)
                {
                    color_select = GREEN;
                    //thickness = 2;
                }
                else if (mouseX > 400 && mouseX < 450)
                {
                    color_select = ORANGE;
                    //thickness = 2;
                }
                else if (mouseX > 450 && mouseX < 500)
                {
                    color_select = BROWN;
                    //thickness = 2;
                }
                else if (mouseX > 500 && mouseX < 550)
                {
                    color_select = TURQUOISE;
                    //thickness = 2;
                }
                else if (mouseX > 550 && mouseX < 600)
                {
                    color_select = GREY;
                    //thickness = 2;
                }
                else if (mouseX > 600 && mouseX < 650)
                {
                    thickness = 2;
                }
                else if (mouseX > 650 && mouseX < 700)

                {
                    thickness = 3;
                }
                else if (mouseX > 700 && mouseX < 750)
                {
                    thickness = 4;
                }
                else if (mouseX > 750 && mouseX < 800)
                {
                    thickness = 5;
                }
                else if (mouseX > 800 && mouseX < 850)
                {
                    thickness = 6;
                }
                else if (mouseX > 850 && mouseX < 900)
                {
                    thickness = 7;
                }


            }


            stroke(color_select);
            strokeWeight(thickness);
            strokeCap(ROUND);
            line(posX, posY, mouseX, mouseY);

        }
        posX = mouseX;
        posY = mouseY;
    }

    public void mouse_detect_sq()//square painbrush
    {

        if(mousePressed)
        {



            if (mouseY > 50 && mouseY < 100)
            {
                if (mouseX > 0 && mouseX < 50)
                {
                    color_select = BLACK;
                    //thickness = 2;
                }
                else if (mouseX > 50 && mouseX < 100)
                {
                    color_select = WHITE;
                    //thickness = 2;
                }
                else if (mouseX > 100 && mouseX < 150)
                {
                    color_select = BLUE;
                    //thickness = 2;
                }
                else if (mouseX > 150 && mouseX < 200)
                {
                    color_select = RED;
                    //thickness = 2;
                } else if (mouseX > 200 && mouseX < 250)
                {
                    color_select = YELLOW;
                    //thickness = 2;
                }
                else if (mouseX > 250 && mouseX < 300) {
                    color_select = PURPLE;
                    //thickness = 2;
                }
                else if (mouseX > 300 && mouseX < 350)
                {
                    color_select = LIME;
                    //thickness = 2;
                }
                else if (mouseX > 350 && mouseX < 400)
                {
                    color_select = GREEN;
                    //thickness = 2;
                }
                else if (mouseX > 400 && mouseX < 450)
                {
                    color_select = ORANGE;
                    //thickness = 2;
                }
                else if (mouseX > 450 && mouseX < 500)
                {
                    color_select = BROWN;
                    //thickness = 2;
                }
                else if (mouseX > 500 && mouseX < 550)
                {
                    color_select = TURQUOISE;
                    //thickness = 2;
                }
                else if (mouseX > 550 && mouseX < 600)
                {
                    color_select = GREY;
                    //thickness = 2;
                }
                else if (mouseX > 600 && mouseX < 650)
                {
                    thickness = 2;
                }
                else if (mouseX > 650 && mouseX < 700)

                {
                    thickness = 3;
                }
                else if (mouseX > 700 && mouseX < 750)
                {
                    thickness = 4;
                }
                else if (mouseX > 750 && mouseX < 800)
                {
                    thickness = 5;
                }
                else if (mouseX > 800 && mouseX < 850)
                {
                    thickness = 6;
                }
                else if (mouseX > 850 && mouseX < 900)
                {
                    thickness = 7;
                }


            }


            stroke(color_select);
            fill(color_select);
            strokeWeight(thickness);
            strokeCap(PROJECT);
            line(posX, posY, mouseX, mouseY);


        }
        posX = mouseX;
        posY = mouseY;
    }

    public void mouse_detect_er()//eraser
    {

        if(mousePressed)
        {
            if (mouseX > 600 && mouseX < 650)
            {
                thickness = 10;
            }
            else if (mouseX > 650 && mouseX < 700)

            {
                thickness = 20;
            }
            else if (mouseX > 700 && mouseX < 750)
            {
                thickness = 30;
            }
            else if (mouseX > 750 && mouseX < 800)
            {
                thickness = 40;
            }
            else if (mouseX > 800 && mouseX < 850)
            {
                thickness = 50;
            }
            else if (mouseX > 850 && mouseX < 900)
            {
                thickness = 60;
            }

            stroke(255);
            strokeWeight(thickness);
            //strokeCap(PROJECT);
            line(posX, posY, mouseX, mouseY);

        }
        posX = mouseX;
        posY = mouseY;
    }

    void drawing_square()
    {
        //stored squares drawn
        for(Draw_sqr sq : squares)
        {
            sq.display();
        }

        //new square added if we press the mouse
        if (currentSqare != null)
        {
            currentSqare.updateSize(mouseX, mouseY);
            currentSqare.display();
        }
    }


     public void keyPressed()
    {
        if (key == 'p')
        {

            pnt_or_sq = 1;
        }
        if (key == 's')
        {

            pnt_or_sq = 2;
        }

        if (key == 'e')
        {

            pnt_or_sq = 3;
        }
        if (key == 'c')
        {

            pnt_or_sq = 4;
        }
        if (key == 'r')
        {

            pnt_or_sq = 5;
        }
        if (key == 'e')
        {

            pnt_or_sq = 6;
        }




    }


    public void mousePressed()
    {
        if (mouseX > 0 && mouseX < 210 && mouseY > 0 && mouseY < 50)
        {
            pnt_or_sq = 1;
        }
        if (mouseX > 210 && mouseX < 420 && mouseY > 0 && mouseY < 50)
        {
            pnt_or_sq = 2;
        }

        if (mouseX > 420 && mouseX < 635 && mouseY > 0 && mouseY < 50)
        {
            pnt_or_sq = 3;
        }
        if (mouseX > 635 && mouseX < 850 && mouseY > 0 && mouseY < 50)
        {
            pnt_or_sq = 4;
        }
        if(mouseX >850 && mouseX <1015 && mouseY >0 && mouseY <50)
        {
            pnt_or_sq = 5;
        }
        if(mouseX >850 && mouseX <1015 && mouseY >50 && mouseY <100)
        {
            pnt_or_sq = 6;
        }

        if(pnt_or_sq == 5)
        {

            currentSqare = new Draw_sqr(mouseX,mouseY,color(color_select));
            square_color();

        }
        if(pnt_or_sq == 6)
        {

            currentCircle = new Circle(mouseX,mouseY,color(color_select));
            square_color();

        }
    }

    public void mouseReleased()
    {
        if (pnt_or_sq == 5) {
            squares.add(currentSqare.copy());
            currentSqare = null;
        }
        if(pnt_or_sq == 6)
        {
            circles.add(currentCircle.copy());
            currentCircle = null;
        }
    }//for square and circle
    public void square_color()
    {

        if(mousePressed)
        {



            if (mouseY > 50 && mouseY < 100)
            {
                if (mouseX > 0 && mouseX < 50)
                {
                    color_select = BLACK;
                    //thickness = 2;
                }
                else if (mouseX > 50 && mouseX < 100)
                {
                    color_select = WHITE;
                    //thickness = 2;
                }
                else if (mouseX > 100 && mouseX < 150)
                {
                    color_select = BLUE;
                    //thickness = 2;
                }
                else if (mouseX > 150 && mouseX < 200)
                {
                    color_select = RED;
                    //thickness = 2;
                } else if (mouseX > 200 && mouseX < 250)
                {
                    color_select = YELLOW;
                    //thickness = 2;
                }
                else if (mouseX > 250 && mouseX < 300) {
                    color_select = PURPLE;
                    //thickness = 2;
                }
                else if (mouseX > 300 && mouseX < 350)
                {
                    color_select = LIME;
                    //thickness = 2;
                }
                else if (mouseX > 350 && mouseX < 400)
                {
                    color_select = GREEN;
                    //thickness = 2;
                }
                else if (mouseX > 400 && mouseX < 450)
                {
                    color_select = ORANGE;
                    //thickness = 2;
                }
                else if (mouseX > 450 && mouseX < 500)
                {
                    color_select = BROWN;
                    //thickness = 2;
                }
                else if (mouseX > 500 && mouseX < 550)
                {
                    color_select = TURQUOISE;
                    //thickness = 2;
                }
                else if (mouseX > 550 && mouseX < 600)
                {
                    color_select = GREY;
                    //thickness = 2;
                }



            }


        }

    }


    public static void main(String[] args) {
        PApplet.main(drawing.class.getName());
    }
}
