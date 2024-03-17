public class SturkturListTest2 {
    public static void main(String[] args)  
    {
        StrukturList list = new StrukturList();

        list.addHead(3);
        list.addHead(2);
        list.addHead(4);
        list.addHead(6);
        list.addHead(7);

        list.displayElement();
        System.out.println("\n" + list.size());
    }
}