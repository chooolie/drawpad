class Clear_scr
{
   void clearr()
   {
    rect(0,0,1900,1000);
   }
   
   void clear_squares()
   {
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
     if(circles.size() == 0)
    {

    }
    else
    {
     circles.remove(0);
    }
   }
  
}