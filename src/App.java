public class App {
    public static void main(String[] args) {
        Author robertSalvatore = new Author("Роберт", "Сальваторе");
        Author andrzejSapkowski = new Author("Анджей", "Сапковский");
        Book darkElf = new Book("Кровь эльфов", andrzejSapkowski, 1990);
        System.out.println("darkElf = " + darkElf.getBookName() + " " + robertSalvatore.getAuthorName() + " " + robertSalvatore.getAuthorLastName() + " " + darkElf.getPublicationYear());

        darkElf.setPublicationYear(1991);
        System.out.println("Другой год публикации - " + darkElf.getPublicationYear());
        System.out.println();

        Book witcher = new Book("Кровь эльфов", andrzejSapkowski, 1994);
        System.out.println("witcher = " + witcher.getBookName() + " " + witcher.getAuthorFullName().getAuthorName() + " " + witcher.getAuthorFullName().getAuthorLastName() + " " + witcher.getPublicationYear());
//        System.out.println("witcher = " + witcher.getBookName() + " " + witcher.authorFullName() + " " + witcher.getPublicationYear());
        System.out.println(witcher);
        System.out.println(andrzejSapkowski);

        witcher.setPublicationYear(1995);
        System.out.println("Другой год публикации - " + witcher.getPublicationYear());

        System.out.println("Результат сравнения книг - " + darkElf.equals(witcher));
        System.out.println("Результат сравнения авторово - " + robertSalvatore.equals(andrzejSapkowski));

    }
}
