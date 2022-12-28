# Java-Package
### This is my java package,i try to document all class and method and i added own exception handaling

## Example Code :
```java
import suvendu.matrix2d.*;
import suvendu.image2d.*;
import suvendu.mystring.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 },
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


        // This is my trim() method 
        MyStringMethod o = new MyStringMethod();

        System.out.println(o.trim("   Suvendu    "));
        System.out.println(o.trim("   Suvendu    ").length());

    }
}
```

## Output :
```
C:\Users\suven\Desktop\Java\String\Java-Package>java Main.java
Rotate image : Print matrix (After Rotate image) :
[70, 40, 10]
[80, 50, 20]
[90, 60, 30]
 Print matrix (Only transpose) :
[70, 80, 90]
[40, 50, 60]
[10, 20, 30]
Suvendu
7
```
