package Java66_Generic;

public class Main {
    public static void main(String[] args) {
        BoxWithoutGenerate Bwtg = new BoxWithoutGenerate(12);
        System.out.println("Giá trị: " + Bwtg.getValue());

        BoxWithGeneric<Integer> Bwg = new BoxWithGeneric<>(12);
        System.out.println("Giá trị: " + Bwg.getValue());

        BoxWithGeneric<String> Bwg1 = new BoxWithGeneric<>("12");
        System.out.println("Giá trị: " + Bwg.getValue());
    }

}
