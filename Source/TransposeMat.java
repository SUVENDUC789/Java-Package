package suvendu.matrix2d;

public class TransposeMat {

    public void transposeOfAMat(int[][] a) {
        try {
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a[i].length; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        } catch (Exception e) {
            System.out.println("NOTE : transposeOfAMat(int[][] a) ---> work only a Square of a matrix ");
        }
    }

    // public static void main(String[] args) {
    //     int[][] a = {
    //             { 1, 2, 3 },
    //             { 10, 20, 30 },
    //             // { 11, 22, 33 }
    //     };
    //     TransposeMat t = new TransposeMat();
    //     t.transposeOfAMat(a);

    //     PrintMat p = new PrintMat();
    //     p.printMatrix(a);
    // }

}
