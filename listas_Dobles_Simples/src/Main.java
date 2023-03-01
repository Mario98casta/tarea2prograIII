public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(10);
        list.add(66);
        list.add(35);
        list.print();
        list.remove(10);
        System.out.println("---------");
        list.print();

    }
}