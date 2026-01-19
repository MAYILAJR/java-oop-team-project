
import java.io.*;

public class FileStorage {

    private static final String FILE_NAME = "university_data.dat";

    // Save data to file
    public static void save(DataStore dataStore) {
        try {
            FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(dataStore);
            out.close();
            fileOut.close();
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data.");
            e.printStackTrace();
        }
    }

    // Load data from file
    public static DataStore load() {
        try {
            FileInputStream fileIn = new FileInputStream(FILE_NAME);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            DataStore dataStore = (DataStore) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Data loaded successfully.");
            return dataStore;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous data found. Creating new data.");
            return new DataStore();
        }
    }
}
