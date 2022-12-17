import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class Driver{

    public static void main(String[] args) {

        String line = "";
        int numArgs = args.length;

        if (numArgs < 1){
            System.out.println("Usage: java Driver <CSV FILE>Submitting Your Assignment");
            return;
        }

        try{
            CatalogItemLoaderCSV itemload = new CatalogItemLoaderCSV();
            try{
                itemload.loadItems(args[0]);
            } catch (Exception IOException){
                System.out.println("Cannot be loaded");
                return;
            }

            ArrayList<CatalogItem> argList;
            argList  = itemload.getItems();

            Catalog argCatalog = new Catalog(argList);

            ArrayList<String> argResult;
            try{
                argResult = argCatalog.search("Mike");
            } catch (Exception IllegalArgumentException){
                System.out.println("ERROR");
                return;
            }
	    System.out.println("Items with Mike");

            for (int x = 0; x < argResult.size(); x++){
                String finalitem = (argResult.get(x));
                System.out.println(argCatalog.getItem(finalitem));
            }
        } catch (Exception error){
            System.out.println("ERROR " + error.getMessage());
        }
    }

}
