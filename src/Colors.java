import processing.core.PApplet;


public class Colors extends PApplet {

drawing dw = new drawing();

        public  void draw_color_buttons() {
            //
            dw.strokeWeight(4);
            dw.stroke(0);
            //buttons
            fill(drawing.WHITE);
            rect(0, 0, 210, 50);
            fill(drawing.BLACK);
            textSize(25);
            text("Paintbrush", 25, 30);

            fill(drawing.WHITE);
            rect(210, 0, 210, 50);
            fill(drawing.BLACK);
            textSize(25);
            text("Square", 225, 30);

            fill(drawing.WHITE);
            rect(420, 0, 215, 50);
            fill(drawing.BLACK);
            textSize(25);
            text("Eraser", 435, 30);

            fill(drawing.WHITE);
            rect(635, 0, 215, 50);
            fill(drawing.BLACK);
            textSize(25);
            text("Clear screen", 645, 30);

            fill(drawing.BLACK);
            rect(0, 50, 50, 50);
            fill(drawing.WHITE);
            rect(50, 50, 50, 50);
            fill(drawing.BLUE);
            rect(100, 50, 50, 50);
            fill(drawing.RED);
            rect(150, 50, 50, 50);
            fill(drawing.YELLOW);
            rect(200, 50, 50, 50);
            fill(drawing.PURPLE);
            rect(250, 50, 50, 50);
            fill(drawing.LIME);
            rect(300, 50, 50, 50);
            fill(drawing.GREEN);
            rect(350, 50, 50, 50);
            fill(drawing.ORANGE);
            rect(400, 50, 50, 50);
            fill(drawing.BROWN);
            rect(450, 50, 50, 50);
            fill(drawing.TURQUOISE);
            rect(500, 50, 50, 50);
            fill(drawing.GREY);
            rect(550, 50, 50, 50);


            fill(drawing.WHITE);
            rect(600, 50, 50, 50);
            stroke(drawing.BLACK);
            strokeWeight(2);
            line(610, 75, 640, 75);
            strokeWeight(6);

            fill(drawing.WHITE);
            rect(650, 50, 50, 50);
            stroke(drawing.BLACK);
            strokeWeight(3);
            line(660, 75, 690, 75);
            strokeWeight(6);

            fill(drawing.WHITE);
            rect(700, 50, 50, 50);
            stroke(drawing.BLACK);
            strokeWeight(4);
            line(710, 75, 740, 75);
            strokeWeight(6);

            fill(drawing.WHITE);
            rect(750, 50, 50, 50);
            stroke(drawing.BLACK);
            strokeWeight(5);
            line(760, 75, 790, 75);
            strokeWeight(6);

            fill(drawing.WHITE);
            rect(800, 50, 50, 50);
            stroke(drawing.BLACK);
            strokeWeight(7);
            line(810, 75, 840, 75);
        }


    }






