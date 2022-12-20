package Exmple250;

public class Html_Tags {

        public static void main(String a[]){
            String text = "<p>I don't want this p tag<\\p>";
            System.out.println(text);
            text = text.replaceAll("\\<.*?\\>", "");
            System.out.println(text);
        }
}
