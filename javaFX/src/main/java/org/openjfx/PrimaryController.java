package org.openjfx;

import Animals.*;
import Logic.SaveToFile;
import Logic.WebShop;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PrimaryController {

    private WebShop _webShop;
    private SaveToFile _textFile;

    @FXML
    public void initialize() {
        _webShop = new WebShop();
        _textFile = SaveToFile.getInstance();
        animalType.getItems().addAll("Dog", "Cat");
        animalGender.getItems().addAll("Male", "Female");
    }

    @FXML
    public Button addAnimalBtn;

    @FXML
    public Button reserveAnimalBtn;

    @FXML
    public ComboBox animalType;

    @FXML
    public ComboBox animalGender;

    @FXML
    public TextField animalName;

    @FXML
    public TextField reservorName;

    @FXML
    public TextField badHabits;

    @FXML
    public ListView animalLv;

    @FXML
    public Button saveFileBtn;

    public void addAnimal() {
        String name = animalName.textProperty().get();

        String genderString = animalGender.getSelectionModel().getSelectedItem().toString();
        Gender gender = Gender.valueOf(genderString);

        String AnimalType = animalType.getSelectionModel().getSelectedItem().toString();

        if (AnimalType == "Dog") {
            Dog dog = new Dog(name, gender);
            _webShop.addAnimal(dog);
        } else {
            String habits = badHabits.textProperty().get();
            Cat cat = new Cat(name, gender, habits);
            _webShop.addAnimal(cat);
        }
        animalLv.getItems().clear();
        animalLv.getItems().addAll(_webShop.getAnimals());
    }

    public void SwitchType() {
        String AnimalType = animalType.getSelectionModel().getSelectedItem().toString();
        if (AnimalType == "Cat") {
            badHabits.setDisable(false);
        } else {
            badHabits.clear();
            badHabits.setDisable(true);
        }

    }

    public void Save() throws IOException {
        _textFile.Save(_webShop.getAnimals());
    }

    public void reserveAnimal() {
        int index = animalLv.getSelectionModel().getSelectedIndex();
        String name = reservorName.textProperty().get();
        _webShop.reserveAnimal(name, index);
        animalLv.getItems().clear();
        animalLv.getItems().addAll(_webShop.getAnimals());
    }
}
