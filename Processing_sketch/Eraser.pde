class Eraser
{

  float posX, posY;
  int thickness;
  //color color_select = color(0,0,0);
 
  
   public void mouse_detect()
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

}

  
  