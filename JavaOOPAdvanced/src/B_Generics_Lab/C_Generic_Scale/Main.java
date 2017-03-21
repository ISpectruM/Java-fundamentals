package B_Generics_Lab.C_Generic_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(1,1);
        System.out.println(scale.getHeavier());
    }
}
