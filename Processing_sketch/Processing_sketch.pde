//creating an array list of squares and circles
//used to store the squares and circles until 
//user releases the mouse key
ArrayList<Draw_sqr> squares;
ArrayList<Circle> circles;

//initialising all the colors
//can be passed to the other classes
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
   Eraser eraser;
   Clear_scr clear_scr;
   Draw_sqr currentSqare;
   Circle currentCircle;

   public void setup()
   {
       size(1900,1000);
       smooth();
       frameRate(30);
       background(255);
        
        col = new Colors();
        paint = new Paint();
        square = new Square();
        eraser = new Eraser();
        clear_scr = new Clear_scr();
       // sqr_shape = new Sqr_shape();
       frameRate(30);
       squares = new ArrayList<Draw_sqr>();
       circles = new ArrayList<Circle>();
       
        

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
        if(pnt_or_sq == 3)
       {
         eraser.mouse_detect();
       }
        if(pnt_or_sq == 4)
       {
         clear_scr.clearr();
          clear_scr.clear_squares();
          clear_scr.clear_circles();
         col.draw_color_buttons();
         pnt_or_sq= 1;
       }
       
       if(pnt_or_sq == 5)
       {
         
         drawing_square();
       }
       if(pnt_or_sq == 6)
       {
         
         drawing_circle();
       }
       
        
        
        
   }

void drawing_square()
{
     //draw all stored squares first
        for(Draw_sqr sq : squares)
        {
          sq.display();
        }
    
        //if we pressed the mouse
        //and added a new square
        if (currentSqare != null) 
        {
            currentSqare.updateSize(mouseX, mouseY);
            currentSqare.display();
        } 
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
  
 if(mouseX> 420 && mouseX <635 && mouseY >0 && mouseY<50)
 {
   pnt_or_sq = 3;
 }
 if(mouseX> 635 && mouseX <850 && mouseY >0 && mouseY<50)
 {
   pnt_or_sq = 4;
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
    
 }//end mouse pressed
    

void mouseReleased() 
{
  if(pnt_or_sq == 5)
 {
    squares.add(currentSqare.copy());
    currentSqare = null;
 }
 
 if(pnt_or_sq == 6)
 {
    circles.add(currentCircle.copy());
    currentCircle = null;
 }
}

void square_color()
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
  