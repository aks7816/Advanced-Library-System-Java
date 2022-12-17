import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Arrays;

public class CatalogItemLoaderCSV {

    String line = "";
    public ArrayList <CatalogItem> theList = new ArrayList<CatalogItem>();
    Movie movieFromCSV;
    LibraryItem itemFromLibrary;
    CatalogItem catalogItem_lib_movie;
    CatalogItem catalogItem_lib_book;
    boolean available;
    String publisher,isbn;

    public void loadItems(String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while((line = reader.readLine()) != null){

            String[] splitLine = line.split(",");

            if(splitLine.length == 9) {
                boolean available;
                String title = splitLine[2];
                String year = splitLine[3];
                String firstName = splitLine[5];
                String lastName = splitLine[6];
                String publisher = splitLine[7];
                String isbn = splitLine[8];

                if (!title.equals(" ") || !year.equals(" ") || !firstName.equals(" ") || !lastName.equals(" ") || !publisher.equals(" ") || !isbn.equals(" ")) {
                    LibraryItem bookFromCSV = new Book(title, Integer.valueOf(year), firstName, lastName, publisher, isbn);
                    if (Integer.valueOf(splitLine[1]) == 1) {
                        available = true;
                    } else {
                        available = false;
                    }

                    CatalogItem catalogItem_lib_book = new CatalogItem(bookFromCSV, splitLine[0], available);
                    theList.add(catalogItem_lib_book);
                }

            } else if (splitLine.length == 8) {
                boolean available;
                String title = splitLine[2];
                String year = splitLine[3];
                String firstName = splitLine[5];
                String lastName = splitLine[6];
                String rating = splitLine[7];
                String type = splitLine[4];

                System.out.println();
                if (!title.equals(" ") || !year.equals(" ") || !firstName.equals(" ") || !lastName.equals(" ")  || !rating.equals(" ")){
                    if (!rating.equals("978-0786863624")){
                        LibraryItem movieFromCSV = new Movie(splitLine[2], Integer.valueOf(splitLine[3]), splitLine[5], splitLine[6],splitLine[7]);

                        if (Integer.valueOf(splitLine[1]) == 1){
                            available = true;
                        }
                        else{
                            available = false;
                        }

                        CatalogItem catalogItem_lib_movie = new CatalogItem(movieFromCSV, splitLine[0],available);
                        theList.add(catalogItem_lib_movie);
                    }

                }

            }

        }
    }

    public ArrayList<CatalogItem> getItems(){
        return theList;
    }
}
