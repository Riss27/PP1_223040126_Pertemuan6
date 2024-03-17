public class StrukturListTest3 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(9);
        list.addHead(1);
        list.addHead(8);
        list.addHead(7);
        list.addHead(3);
        list.addHead(4);

        list.displayElement();
        list.removeAll();
        list.displayElement();
    }
}
