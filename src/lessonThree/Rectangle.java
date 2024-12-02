package lessonThree;

public final class Rectangle {

    private final double width;
    private  final  double length;

     public Rectangle(double width, double length){
         if(width<=0||length<=0){
             throw new IllegalArgumentException("lenght and width must be positive");

         }
         this.width=width;
         this.length=length;
     }


     public double getWidth(){
         return  width;
     }

     public double getLength(){
         return length;
     }

     public double computeArea(){
         return  width*length;
     }



}
