//import processing.core.PApplet;
//
//public class Paint extends PApplet
//
//{
//    float posX, posY;
//    int thickness = 1;
//    int color_select = color(0,0,0);
//
//
//
//
//    public void mouse_detect()
//    {
//
//        if(mousePressed)
//        {
//
//
//
//            if (mouseY > 50 && mouseY < 100)
//            {
//                if (mouseX > 0 && mouseX < 50)
//                {
//                    color_select = drawing.BLACK;
//                    //thickness = 2;
//                }
//                else if (mouseX > 50 && mouseX < 100)
//                {
//                    color_select = drawing.WHITE;
//                    //thickness = 2;
//                }
//                else if (mouseX > 100 && mouseX < 150)
//                {
//                    color_select = drawing.BLUE;
//                    //thickness = 2;
//                }
//                else if (mouseX > 150 && mouseX < 200)
//                {
//                    color_select = drawing.RED;
//                    //thickness = 2;
//                } else if (mouseX > 200 && mouseX < 250)
//                {
//                    color_select = drawing.YELLOW;
//                    //thickness = 2;
//                }
//                else if (mouseX > 250 && mouseX < 300) {
//                    color_select = drawing.PURPLE;
//                    //thickness = 2;
//                }
//                else if (mouseX > 300 && mouseX < 350)
//                {
//                    color_select = drawing.LIME;
//                    //thickness = 2;
//                }
//                else if (mouseX > 350 && mouseX < 400)
//                {
//                    color_select = drawing.GREEN;
//                    //thickness = 2;
//                }
//                else if (mouseX > 400 && mouseX < 450)
//                {
//                    color_select = drawing.ORANGE;
//                    //thickness = 2;
//                }
//                else if (mouseX > 450 && mouseX < 500)
//                {
//                    color_select = drawing.BROWN;
//                    //thickness = 2;
//                }
//                else if (mouseX > 500 && mouseX < 550)
//                {
//                    color_select = drawing.TURQUOISE;
//                    //thickness = 2;
//                }
//                else if (mouseX > 550 && mouseX < 600)
//                {
//                    color_select = drawing.GREY;
//                    //thickness = 2;
//                }
//                else if (mouseX > 600 && mouseX < 650)
//                {
//                    thickness = 2;
//                }
//                else if (mouseX > 650 && mouseX < 700)
//
//                {
//                    thickness = 3;
//                }
//                else if (mouseX > 700 && mouseX < 750)
//                {
//                    thickness = 4;
//                }
//                else if (mouseX > 750 && mouseX < 800)
//                {
//                    thickness = 5;
//                }
//                else if (mouseX > 800 && mouseX < 850)
//                {
//                    thickness = 6;
//                }
//                else if (mouseX > 850 && mouseX < 900)
//                {
//                    thickness = 7;
//                }
//
//
//            }
//
//
//            stroke(color_select);
//            strokeWeight(thickness);
//            strokeCap(ROUND);
//            line(posX, posY, mouseX, mouseY);
//
//        }
//        posX = mouseX;
//        posY = mouseY;
//    }
//
//
//}
//
