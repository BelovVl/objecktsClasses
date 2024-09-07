public class Main {
    public static void main(String[] args) {
        //
        Author author = new Author("Mit", " Belov");
        System.out.println("Имя автора: " + author.getFirstName() + ". Фамилия автора: " + author.getLastName() + ".");
        Author author1 = new Author("Nas", " Belova");
        System.out.println("Имя автора: " + author1.getFirstName() + ". Фамилия автора: " + author1.getLastName() + ".");
        System.out.println(" ");
        //
        Book life = new Book("love", author, 1990);
        if (life.isAdult()) {
            System.out.println("Подлежит для публикиции.");
        } else {
            System.out.println("К сожалению данный год не подлежит для публикации!!!");
        }
        System.out.println(" ");
        //
        System.out.println("Автор: " + author.getFirstName() + author.getLastName() + ". Название: " + life.getTitleBook() + ". Год: " + life.getPublisherYear() + ".");
        life.setPublisherYear(1991);
        System.out.println(life.getPublisherYear());
        System.out.println(" ");
        //
        Book life1 = new Book("love", author1, 1995);
        if (life1.isAdult()) {
            System.out.println("Подлежит для публикиции.");
        } else {
            System.out.println("К сожалению данный год не подлежит для публикации!!!");
        }
        System.out.println(" ");
        //
        System.out.println("Автор: " + author1.getFirstName() + author.getLastName() + ". Название: " + life1.getTitleBook() + ". Год: " + life1.getPublisherYear() + ".");
        System.out.println(" ");
        //
        System.out.println(life);
        System.out.println(life1);
        System.out.println(" ");
        //
        System.out.println(author);
        System.out.println(author1);
        System.out.println(" ");
        //
        life = new Book("love", author, 1990);
        life1 = life;
        System.out.println(life.equals(life1));
        System.out.println(" ");
        //
        author = new Author("Mit", " Belov");
        author1 = author;
        System.out.println(author.equals(author1));
        System.out.println(" ");
    }
}
