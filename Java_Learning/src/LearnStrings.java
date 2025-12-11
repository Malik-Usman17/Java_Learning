public class LearnStrings {
    public static void main(String[] args) {
        String messsage = "Hell!o World" + "!!";
        System.out.println(messsage);
        System.out.println(messsage.endsWith("!!"));
        System.out.println(messsage.startsWith("!!"));
        System.out.println(messsage.length());
        System.out.println(messsage.indexOf('l'));
        System.out.println(messsage.indexOf("sky"));
        System.out.println(messsage.replace("!", "*"));
    }
}
