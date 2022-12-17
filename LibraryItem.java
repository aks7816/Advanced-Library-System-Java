//parent class

public class LibraryItem {

    protected String title;
    protected int year;
    protected String firstName;
    protected String lastName;
    protected String publisher;
    protected String isbn;
    protected String rating;

    public LibraryItem(String title, int year, String firstName, String lastName, String rating){

        this.title = title;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
    }

    public LibraryItem(String title, int year, String firstName, String lastName, String publisher, String isbn){

        this.title = title;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.publisher = publisher;
        this.isbn = isbn;
    }


    boolean matches(String keyword){

        if (keyword.equals(this.title) ||keyword.equals(String.valueOf(this.year)) || keyword.equals(this.firstName) || keyword.equals(this.lastName) ){
            return true;
        }
        else{
            return false;
        }
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public int getYear(){

        return this.year;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String toString()
    {
        return new String(this.title+", " + this.year + ", " +this.firstName+", "+this.lastName);
    }
}
