public class Main {
    public static void main(String[] args) {

        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("Петя");
        magicBox1.add("Саша");
        magicBox1.add("Коля");
        magicBox1.add("Паша");
        magicBox1.add("Андрей");

        System.out.println(magicBox1.add("Юра"));
        magicBox1.print();

        System.out.println();
        System.out.println();

        MagicBox<Integer> magicBox2 = new MagicBox<>(5);
        magicBox2.add(8);
        magicBox2.add(6);
        magicBox2.add(3);
        magicBox2.add(1);
        magicBox2.add(5);

        System.out.println(magicBox2.add(45));
        magicBox2.print();

        System.out.println();
        System.out.println();

        System.out.println(magicBox1.pick());
        System.out.println(magicBox2.pick());
    }
}