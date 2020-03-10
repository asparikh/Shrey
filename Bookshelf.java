public class Bookshelf {
    Book[] bookshelf;
    private int nextEmpty;
    public Bookshelf(){
        this.bookshelf = new Book[20];
        this.nextEmpty = 0;
    }
    public Bookshelf(int shelfLength){
        this.bookshelf = new Book[shelfLength];
        this.nextEmpty = 0;
    }
    public boolean add(Book newBook){
        if (this.nextEmpty == this.bookshelf.length){
            return false;
        }
        else {
            this.bookshelf[this.nextEmpty] = newBook;
            this.nextEmpty += 1;
            return true;
        }
    }
    public Bookshelf getBooksByAuthor(String author){
        Bookshelf authorShelf = new Bookshelf();
        for (int i = 0; i < nextEmpty; i++) {
            String authorName = bookshelf[i].getAuthor();
            if (authorName == author){
                authorShelf.add(bookshelf[i]);
            }
        }
        return authorShelf;
    }
    public String toString(){
        String s1 = "";
        for (int i = 0; i < nextEmpty; i++) {
            String s2 = bookshelf[i].toString();
            s1 += s2 + "\n";
        }
        return s1;
    }
    public void sort(char sortBy){
        for (int i = 0; i < nextEmpty; i++) {
            for (int j = i+1 ; j < nextEmpty; j++) {
                if (bookshelf[i].compareTo(bookshelf[j], sortBy) > 0){
                    Book tempBook = bookshelf[i];
                    bookshelf[i] = bookshelf[j];
                    bookshelf[j] = tempBook;
                }
            }
        }
    }

    public static void main(String[] args){
        Bookshelf shelf1 = new Bookshelf();
        Bookshelf shelf2 = new Bookshelf(5);
        Book harryPotter1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 3.5);
        Book harryPotter2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 3.5);
        Book harryPotter3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 4.0);
        Book lotr1 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 4.5);
        Book lotr2 = new Book("The Two Towers", "J.R.R. Tolkien", 4.0);
        Book lotr3 = new Book("The Return of the King", "J.R.R. Tolkien", 5.0);
        Book devilCity = new Book("The Devil in the White City", "Erik Larson", 4.0);
        Book steveJobs = new Book("Steve Jobs", "Walter Issacson", 4.5);
        Book frankenstein = new Book("Frankenstein", "Mary Shelley", 3.0);
        System.out.println(shelf1.add(harryPotter1));
        System.out.println(shelf1.add(harryPotter2));
        System.out.println(shelf1.add(harryPotter3));
        System.out.println(shelf1.add(lotr1));
        System.out.println(shelf1.add(lotr2));
        System.out.println(shelf1.add(lotr3));
        System.out.println(shelf1.add(devilCity));
        System.out.println(shelf1.add(steveJobs));
        System.out.println(shelf1.add(frankenstein));
        System.out.println(shelf2.add(harryPotter1));
        System.out.println(shelf2.add(lotr1));
        System.out.println(shelf2.add(lotr2));
        System.out.println(shelf2.add(lotr3));
        System.out.println(shelf2.add(devilCity));
        System.out.println(shelf2.add(steveJobs));
        System.out.println(shelf2.add(frankenstein));
        Bookshelf rowling = shelf1.getBooksByAuthor("J.K. Rowling");
        Bookshelf tolkien = shelf2.getBooksByAuthor("J.R.R. Tolkien");
        System.out.println(tolkien.toString());
        System.out.println(rowling.toString());
        shelf1.sort('A');
        System.out.println(shelf1.toString());
    }
}
