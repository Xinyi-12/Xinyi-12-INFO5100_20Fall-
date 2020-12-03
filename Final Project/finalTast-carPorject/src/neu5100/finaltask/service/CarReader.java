package neu5100.finaltask.service;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CarReader {

    //design the PATH on your own term
    String PATH = "D:\\finalTast-carPorject\\src\\neu5100\\finaltask\\dao\\";
    private ArrayList<CarItem> carList;

    /**
     * @param csv
     * put the CarItem object from same dealer into ArrayList
     */
    public void carDataReader(ArrayList<CarItem> carList,String csv){
       // List<CarItem> carList = new ArrayList<>();
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH + csv));

            while ((line = br.readLine()) != null) {
                String[] values = line.split("~");
                String id = (values[0]);
                String webId = (values[1]);
                String category = values[2];
                String year = (values[3]);
                String make = values[4];
                String model = values[5];
                String trim = values[6];
                String type = values[7];
                Double price = Double.valueOf(values[8]);
                String picture = values[9];
                CarItem item = new CarItem(id,webId,category,year,make,model,trim, type,price,picture);
                carList.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
