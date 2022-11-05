package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;
import model.Fruit;

public class ItemController {
    @FXML
    private ImageView img;

    @FXML
    private Label nameLabel;

    @FXML
    private Label pricecLabel;

    private Fruit fruit;

    public void setData(Fruit fruit) {
        this.fruit = fruit;
        nameLabel.setText(fruit.getName());
        pricecLabel.setText(Main.CURRENCY + fruit.getPrice());
        Image image = new Image(getClass().getResourceAsStream(fruit.getImgSrc()));
        img.setImage(image);
    }
}
