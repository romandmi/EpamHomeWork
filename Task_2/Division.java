package HomeWork_170624.Task_2;


import java.io.IOException;

public class Division {

    public static int modulu(int x, int y) {

        if (x > y) {
            int z = x / y;
            int a = z * y;
            int b = x - a;
            return b;
        }

//        if (y == 0) {
//
//            int result = 0;
//             try {
//
//                int c = x / y;
//                   result = c;
//                 } catch(ArithmeticException ex) {
//                result = 0;
//                 }
//            return result;
//        }

        else
            return 0;

    }


}