package lessonThree;

public record Circle(double radius) {

    public  Circle{
        if(radius<=0){
            throw new IllegalArgumentException("radius should be positive");
        }
    }

    double computeArea(){
        return Math.PI*radius*radius;
    }
}
