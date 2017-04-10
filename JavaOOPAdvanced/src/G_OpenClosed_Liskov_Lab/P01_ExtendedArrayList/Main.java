package G_OpenClosed_Liskov_Lab.P01_ExtendedArrayList;

public class Main {
    public static void main(String[] args) {
        ExtendedArrayList<Integer> list = new ExtendedArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.max());
        System.out.println(list.min());
    }
}
