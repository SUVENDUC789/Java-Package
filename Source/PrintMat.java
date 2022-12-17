package suvendu.matrix2d;

import java.util.Arrays;

public class PrintMat {

    public void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    // public static void main(String[] args) {
    //     int [][]a={
    //         {1,2,3},
    //         {10,20,30},
    //     };
    //     PrintMat p = new PrintMat();

    //     p.printMatrix(a);
    // }

}

