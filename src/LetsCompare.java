public class LetsCompare {
    public static void main(String[] args) {
        String name = "Trevor";
        String name1 = "Trevor";
        String name2 = "Fred";
        String name4 = "Trevor";
        String name3 = new String("Trevor");
        System.out.println(name + " = " + name3);
        System.out.println(name == name3);
    }
}
