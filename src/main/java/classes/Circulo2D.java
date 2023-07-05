/**
 * CONSTRUCT CIRCLES.
 */
package classes;

public class Circulo2D {
    private final double coordX;
    private double coordY;
    private double raio;


    /**
     * Set circle center as x and y and radius as r.
     *
     * @param x the coordinate of center in x axis
     * @param y the coordinate of center in y axis
     * @param z the radius of the circle
     */
    public Circulo2D (double x, double y, double r){
        this.coordX = x;
        this.coordY = y;
        this.raio = r;
    }

    public Circulo2D(){
        this.coordX = 0;
        this.coordY = 0;
        this.raio = 1;

    }


    /**
     * Create an arrays to store x coordinates circle.
     *
     * @param x the coordinate of center in x axis
     * @param z the radius of the circle
     */

    public double[] SetXPoints (double x, double r) {
        double m = 0.00001;
        double negRaio = (-1)*(raio)
        int sizeArray = (int) ((raio/m)*2);
        double xPoints[] = new double[sizeArray];
        int n = 0;


        for (double i = raio; i >= negRaio; i - m) {
            xPoints[n] = i;
            n++;
        }


        return xPoints;
    }


    /**
     * Create an arrays to store y coordinates circle.
     *
     * @param y the coordinate of center in x axis
     * @param z the radius of the circle
     */

    public double[] SetXPoints (double y, double r) {
        int sizeArray = (int) ((raio/0.00001)*2);
        double yPoints[] = new double[sizeArray];
        int n = 0;

        for (double i=raio; i >= (-raio); i-0.00001) {
            yPoints[n] = i;
            n++;
        }


        return yPoints;
    }


    public boolean contem (double x, double y) {
        Circulo2D circulo = new Circulo2D(coordX, coordY, raio);
        double[] xPoints = SetXPoints (coordX,raio);
        double[] yPoints = SetXPoints (coordY,raio);
        boolean inX;
        boolean inY;

        for (int i=0; i = xPoints.length; i++ ){
            if (x == xPoints[i]) {
                inX = true;
                break;
            }

        }

        for (int i=0; i = yPoints.length; i++ ) {
            if (y == yPoints[i]) {
                inY = true;
                break;
            }

        }

        if (inX && inY) {
            return true;

            else{
                return false;
            }
        }



    }


    public String toString() {

        String strX = coordX + "";
        String strY = coordY + "";
        String strRaio = raio + "";

        System.out.println("centro = (", strX, strY,") raio = ",strRaio);

        return null;
    }




}
