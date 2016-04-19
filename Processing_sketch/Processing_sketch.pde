


   color BLACK = color(0);//creating variable for black
   color WHITE = color(255);//variable for white
   color BLUE = color(0,0,255);//variable for blue
   color RED = color(185,0,0);//variable for red
   color YELLOW = color(255,255,0);//variable for yellow
   color PURPLE = color(156,23,176);
   color LIME = color(0,255,9);
   color GREEN = color(14,201,14);
   color ORANGE = color(255,165,7);
   color BROWN = color(139,106,47);
   color TURQUOISE = color(52,240,140);
   color GREY = color(160,160,160);
    
   int pnt_or_sq = 1;
   color color_select = color(0,0,0);


   Colors col;
   Paint paint;
   Square square;
   

   public void setup()
   {
       size(1900,1000);
       smooth();
       frameRate(30);
       background(255);
        
        col = new Colors();
        paint = new Paint();
        square = new Square();
      
       
        

    // initialize collection
   }
    


   public void draw()
   {
       //mouse_detect();
       //background(255);
       fill(0);
       stroke(0);
       strokeWeight(2);
       rect(0,0,852,100);//background of color picker

       col.draw_color_buttons();
       if(pnt_or_sq == 1)
       {
         paint.mouse_detect();
       }
        if(pnt_or_sq == 2)
       {
         square.mouse_detect();
       }
     
       
        
        
        
   }




      
 void keyPressed()
 {
 if (key == 'p')
 {
      
   pnt_or_sq = 1;
 }
     if (key == 's')
 {
      
   pnt_or_sq = 2;
 }
  
  
      

  
    
    
    
 }
  
  
 void mousePressed()
 {
 if(mouseX > 0 && mouseX <210 && mouseY >0 && mouseY <50)
 {
  pnt_or_sq =1; 
 }
 if(mouseX> 210 && mouseX <420 && mouseY >0 && mouseY<50)
 {
   pnt_or_sq = 2;
 }
  
 
    
 }//end mouse pressed