public class Hexagon {

    public double a;

    public Hexagon(double A){
        this.a = A;
    }

    public double square(){
        return (3 * Math.sqrt(3 * (this.a * this.a))) / 2;
    }
}
