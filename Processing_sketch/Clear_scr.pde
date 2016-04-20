class Clear_scr
{
   void clearr()
   {
    rect(0,0,1900,1000);
   }
   
   void clear_squares()
   {
     
     //removes square array if its not empty
      if(squares.size() == 0)
    {

    }
    else
    {
    squares.remove(0);
    }
   }
   
   void clear_circles()
   {
     
     //emptys circles arraylist if not empty
     if(circles.size() == 0)
    {

    }
    else
    {
     circles.remove(0);
    }
   }
  
}