//This Book class is the subclass of LibraryItem. I am using inheritance.

public class Book extends LibraryItem
{

    public Book(String title, int year, String firstName, String lastName, String publisher, String isbn){

        super(title, year, firstName, lastName, publisher, isbn);
    }

    @Override
    boolean matches(String keyword){

        if (keyword.equals(this.title) ||keyword.equals(String.valueOf(this.year)) || keyword.equals(this.firstName) || keyword.equals(this.lastName) || keyword.equals(this.publisher) || keyword.equals(this.isbn) ){
            return true;
        }

        else{
            return false;
        }
    }


    public String getPublisher(){

        return this.publisher;
    }


    public String getIsbn(){

        return this.isbn;
    }


    @Override
    public String toString()
    {
        String val;
        val = (this.title+", " + this.year + ", " +this.firstName+", "+this.lastName + ", " + this.publisher+ ", "+ this.isbn);
        return val;

    }
}
