import processing.core.PApplet;

public class Colors extends PApplet {
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

        public void draw_color_buttons() {
            strokeWeight(4);
            stroke(0);
            //buttons
            fill(WHITE);
            rect(0, 0, 210, 50);
            fill(BLACK);
            textSize(25);
            text("Paintbrush", 25, 30);

            fill(WHITE);
            rect(210, 0, 210, 50);
            fill(BLACK);
            textSize(25);
            text("Square", 225, 30);

            fill(WHITE);
            rect(420, 0, 215, 50);
            fill(BLACK);
            textSize(25);
            text("Eraser", 435, 30);

            fill(WHITE);
            rect(635, 0, 215, 50);
            fill(BLACK);
            textSize(25);
            text("Clear screen", 645, 30);

            fill(BLACK);
            rect(0, 50, 50, 50);
            fill(WHITE);
            rect(50, 50, 50, 50);
            fill(BLUE);
            rect(100, 50, 50, 50);
            fill(RED);
            rect(150, 50, 50, 50);
            fill(YELLOW);
            rect(200, 50, 50, 50);
            fill(PURPLE);
            rect(250, 50, 50, 50);
            fill(LIME);
            rect(300, 50, 50, 50);
            fill(GREEN);
            rect(350, 50, 50, 50);
            fill(ORANGE);
            rect(400, 50, 50, 50);
            fill(BROWN);
            rect(450, 50, 50, 50);
            fill(TURQUOISE);
            rect(500, 50, 50, 50);
            fill(GREY);
            rect(550, 50, 50, 50);


            fill(WHITE);
            rect(600, 50, 50, 50);
            stroke(BLACK);
            strokeWeight(2);
            line(610, 75, 640, 75);
            strokeWeight(6);

            fill(WHITE);
            rect(650, 50, 50, 50);
            stroke(BLACK);
            strokeWeight(3);
            line(660, 75, 690, 75);
            strokeWeight(6);

            fill(WHITE);
            rect(700, 50, 50, 50);
            stroke(BLACK);
            strokeWeight(4);
            line(710, 75, 740, 75);
            strokeWeight(6);

            fill(WHITE);
            rect(750, 50, 50, 50);
            stroke(BLACK);
            strokeWeight(5);
            line(760, 75, 790, 75);
            strokeWeight(6);

            fill(WHITE);
            rect(800, 50, 50, 50);
            stroke(BLACK);
            strokeWeight(7);
            line(810, 75, 840, 75);
        }


    }






