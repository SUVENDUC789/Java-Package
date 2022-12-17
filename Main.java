import suvendu.matrix2d.*;
import suvendu.image2d.*;

public class Main {
    public static void main(String[] args) {
        int [][]a={
            {10,20,30},
            {40,50,60},
            {70,80,90},
        };

        System.out.print("Rotate image :");
        RotateImage r = new RotateImage();
        r.rotate(a);
        
        System.out.println(" Print matrix (After Rotate image) :");
        PrintMat p1 = new PrintMat();
        p1.printMatrix(a);
        
        System.out.println(" Print matrix (Only transpose) :");
        TransposeMat t = new TransposeMat();
        t.transposeOfAMat(a);

        PrintMat p = new PrintMat();
        p.printMatrix(a);
    }
}
