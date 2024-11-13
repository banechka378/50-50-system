package task3_a;

class Author {
    private String name;
    private int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author.getName() + ", Год рождения автора: " + author.getBirthYear());
    }

    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", 1828);
        Book book = new Book("Война и мир", author);
        book.displayInfo();
    }
}