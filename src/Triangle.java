/**
 * @author Michael Riley
 * @author Marin Bizbiqi
 * @author  Sarah Guarino
 */
public class Triangle {
    public double calculatePerimeter (double s1, double s2, double s3){
        return s1 + s2 + s3;
    }

    public double calculateArea (double s1, double s2, double s3){
        double semiPerim = (s1 + s2 + s3) / 2;
        double area = (semiPerim * (semiPerim - s1) * (semiPerim - s2) * (semiPerim - s3)) ;
        area = Math.sqrt(area);
        area = (double)((int)(area * 100)) / 100;

        return area;
    }
}
