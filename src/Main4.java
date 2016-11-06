import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by andrey on 06.11.16.
 */
public class Main4 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();
        HBox buttons = new HBox(10);
        buttons.setAlignment(Pos.CENTER);
        HBox pic = new HBox();
        pic.setAlignment(Pos.CENTER);


        ToggleGroup toggleGroup = new ToggleGroup();


        RadioButton radioButton1 = new RadioButton("1");
        RadioButton radioButton2 = new RadioButton("2");
        RadioButton radioButton3 = new RadioButton("3");

        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);

        radioButton1.setUserData("1");
        radioButton2.setUserData("2");
        radioButton3.setUserData("3");

        ImageView imageView = new ImageView();

        toggleGroup.selectedToggleProperty().addListener(event -> {
            Image image = new Image(getClass().getResourceAsStream(toggleGroup.getSelectedToggle().getUserData() + ".jpg"));
            imageView.setImage(image);
            imageView.setFitHeight(300);
            imageView.setFitWidth(300);

        });


        radioButton2.setSelected(true);


        buttons.getChildren().addAll(radioButton1, radioButton2, radioButton3);
        pic.getChildren().addAll(imageView);

        root.setTop(buttons);
        root.setCenter(pic);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
