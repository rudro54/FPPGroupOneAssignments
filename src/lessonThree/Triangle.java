package lessonThree;

public record Triangle(double base, double height) {

    public Triangle{
        if(base<=0||height<=0){
            throw new IllegalArgumentException("Base and Height Should Be Positive");
        }
    }

    public double computeArea(){
        return 0.5*base*height;
    }

}
