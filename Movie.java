//This class Movie is a subclass. I am using inheritance. The superclass is LibraryItem


public class Movie extends LibraryItem {

    public Movie(String title, int year, String firstName, String lastName, String rating){
	    super(title, year, firstName, lastName, rating);
    }

    @Override
    boolean matches(String keyword){

        if (keyword.equals(this.title) ||keyword.equals(String.valueOf(this.year)) || keyword.equals(this.firstName) || keyword.equals(this.lastName) || keyword.equals(this.rating) ){
            return true;
        }
        else{
            return false;
        }
    }

    public String getRating(){

        return this.rating;
    }

    @Override
    public String toString()
    {
        return new String(this.title+", "+ this.year +", "+this.firstName+", "+this.lastName + ", "+ this.rating);
    }


}
