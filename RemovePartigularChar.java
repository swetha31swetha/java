package Exmple250;

public class RemovePartigularChar {
    public static void main(String[] args) {
        String str = "techStudy.org";
        System.out.println(removeCharAt(str,6));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);

    }
}

