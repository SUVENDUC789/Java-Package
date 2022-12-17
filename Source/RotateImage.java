package suvendu.image2d;

public class RotateImage {
    public void rotate(int[][] a) {
        // Transpose of a matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }

        }

        // Coloumn wise reverse of a matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][a[i].length - 1 - j];
                a[i][a[i].length - 1 - j] = temp;
            }

        }

    }

}
