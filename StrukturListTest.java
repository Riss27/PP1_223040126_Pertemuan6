public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); 

        list.addHead(6);
        list.addHead(4);
        list.addHead(5);

        list.displayElement();
        System.out.println("\n" +list.find(6));
    }
}
