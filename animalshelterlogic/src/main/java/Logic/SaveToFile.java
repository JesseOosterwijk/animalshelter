package Logic;

import Animals.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToFile {
    private static SaveToFile instance;

    private SaveToFile(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new SaveToFile();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static SaveToFile getInstance(){
        return instance;
    }

    public void Save(List<Animal> animals) throws IOException {
        FileWriter writer = new FileWriter("output.txt", true);
        for (Animal animal: animals) {
            writer.write(animal + System.lineSeparator());
        }
        writer.close();
    }
}
