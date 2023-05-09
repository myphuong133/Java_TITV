public class Main {
    public static void main(String[] args) {
        String name = "Tùng";
        name.trim();
        name = name.substring(name.lastIndexOf(" ") + 1);
        System.out.println(name);
    }

}