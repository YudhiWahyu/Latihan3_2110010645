package geometri;

public class Lingkaran {

    private double radius;
    
    //RUMUS LUAS LINGKARAN
    double Luas () {
        return 3.14 * (radius * radius);
    }
    //KELILING LINGKARAN
    double Keliling () {
        return 2 * 3.14 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    
}
    

