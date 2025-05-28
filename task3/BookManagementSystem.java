public class BookManagementSystem {
    public static void main(String[] args) {
        
         Library library = new Library();        
         Book english = new Book(1,"English Literature","John",1);
         library.addBook(english);
         Book tamil = new Book(2,"Tamil Literature","Karthik",1);
         library.addBook(tamil);
         Book computer = new Book(3,"Java Programming","Thomas",1);
         library.addBook(computer);
         Book science = new Book(4,"Physics","Albert",1);
         library.addBook(science);
         Book english_novel = new Book(5,"English Novel","Shakespeare",1);
         library.addBook(english_novel);
         Book tamil_novel = new Book(6,"Tamil Novel","Kumar",1);
         library.addBook(tamil_novel);

         // Method call to remove book
         library.replaceBook(3);

         Book english_story = new Book(9,"Sleep stories","John",1);
         library.addBook(english_story);

         //method call to display books
         library.displayBooks();


    }
}

class Book{
    //Book attributes
    private int book_id;
    private String title;
    private String author;
    private int is_available;

    //Constructor to initialize book attributes
    Book(int book_id, String title, String author, int is_available) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.is_available = is_available;
    }

    //Getters and Setters for book attributes
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIs_available() {
        return is_available;
    }

    public void setIs_available(int is_available) {
        this.is_available = is_available;
    }
}
class Library {
    private Book[] books;

    Library(){
        this.books = new Book[5];
    }

    //Method to add a book to the library.
    public void addBook(Book new_book) {
        int index = 0;
        for (Book book:books) {
            if (book == null) {
                this.books[index] = new_book;
                System.out.println(new_book.getTitle()+" book added successfully.");
                break;
            }
            index++;
            if(index == books.length) {
                System.out.println("Library is full, cannot add more books!!");
                break;
            }
        }
    
    }

    //Method to remove a book from the library
    public void replaceBook(int book_id) {
        int index = 0;
        for (Book book : books) {
            if(book != null && book.getBook_id() == book_id) {
                books[index] = null;
                System.out.println("-->"+book.getTitle()+" book removed successfully.");
            }
            index++;
        }
    }

    //Method to display all books is the library
    public void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println("==========================");
                System.out.println("Book id: "+ book.getBook_id());
                System.out.println("Book title: "+ book.getTitle());
                System.out.println("Author name: "+ book.getAuthor());
                System.out.println("Available books: "+ book.getIs_available());

            }
            
        }
    }

}