public class calcFunctions {
    private double displayNumber;

    public double state() {
        return displayNumber;
    }

    public void update(double newDisplay){
        this.displayNumber = newDisplay;
    }

    public double clearFunction(){
        this.displayNumber = 0;
        return displayNumber;
    }
    public double add(double number) {
        double addition = displayNumber + number;
        update(addition);
        return addition;
    }
    public double subtract(double number){
        double sub = displayNumber - number;
        update(sub);
        return displayNumber;
    }
    public double multiply(double multi){
        double multiply = displayNumber * multi;
        update(multiply);
        return displayNumber;
    }
    public double divide(int divide){
        try{
            if (divide == 0){
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e){
            System.out.println("Err");
        }
        double division = displayNumber / divide;
        update(division);
        return this.displayNumber;
    }
    public double square(double square){
        double squared=Math.pow(displayNumber, square);
        update(squared);
        return displayNumber;
    }
    public double sqrt(){
        update(Math.sqrt(displayNumber));
        return displayNumber;
    }
    public double inv(){
        update(1/displayNumber);
        return displayNumber;
    }
    public double invert(){
        update(displayNumber*-1);
        return displayNumber;
    }
    public double expVar(double x, double y){
        update(Math.pow(x,y));
        return displayNumber;
    }








}
