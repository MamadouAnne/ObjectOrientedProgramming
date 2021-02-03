package java.wrapper.classes;

public class AllInOne {
    public static void main(String[] args) {
        // convert int to string
        int x = 100;
        String y = Integer.toString(x); // wrapper class for int is Integer
        // convert string to integer object
        Integer b = new Integer(y);
        int z = b.intValue();
        Integer c = new Integer(z);
        String d = c.toString();
        int e = Integer.parseInt(d);
    }
}
