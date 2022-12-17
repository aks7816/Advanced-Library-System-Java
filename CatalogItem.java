public class CatalogItem
{
    private LibraryItem myItem;
    private String  uniqueId;
    private boolean available;

    public CatalogItem(LibraryItem myItem, String id, boolean availability)
    {
        this.myItem = myItem;
        this.uniqueId = id;
        this.available = availability;
    }

    public LibraryItem getMyItem()
    {
        return this.myItem;
    }

    public String getId()
    {
        return this.uniqueId;
    }

    public boolean isAvailable()
    {
        return this.available;
    }

    public void setAvailable()
    {
        this.available = true;
    }

    public void setUnavailable()
    {
        this.available = false;
    }

    public String toString() {

        String val;
        val = myItem + ", " +  this.uniqueId+ ", " + this.available;
        return val;
    }
}
