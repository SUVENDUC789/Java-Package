// package suvendu.python;

import java.util.LinkedList;

final public class Python {
    public static String type(Object input) {
        return "<class " + input.getClass().getTypeName() + ">";
    }

    /*
     * - Complie Time polymorphism
     * - Method Overloading
     */

    public static int[] range(int end) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < end; i++) {
            l.add(i);
        }
        return convertListToArray(l);
    }

    public static int[] range(int start, int end) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = start; i < end; i++) {
            l.add(i);
        }

        return convertListToArray(l);
    }

    public static int[] range(int start, int end, int step) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = start; i < end; i = i + step) {
            l.add(i);
        }
        return convertListToArray(l);
    }

    private static int[] convertListToArray(LinkedList<Integer> l) {
        int a[] = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }

}


