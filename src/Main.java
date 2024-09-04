public class Main {
    public static void main(String[] args) {
        Author belov = new Author("Mit", " Belov");
        System.out.println(belov.getFirstName()+belov.getLastName());
        Author belova = new Author("Nas", " Belova");
        System.out.println(belova.getFirstName()+belova.getLastName());

        System.out.println("");

        Book life=new Book("love",belov,1990);
        System.out.println(belov.getLastName());
        System.out.println(life.getPublisherYear());
        life.setPublisherYear(1991);
        System.out.println(life.getPublisherYear());
        System.out.println(life.getTitleBook());
        Book life1=new Book("love",belova,1995);
        System.out.println(life1.getTitleBook());
        System.out.println(belova.getLastName());
        System.out.println(life1.getPublisherYear());
    }
}
