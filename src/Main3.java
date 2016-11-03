import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by andrey on 03.11.16.
 */
public class Main3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        Button button = new Button();

        Image image = new Image(getClass().getResourceAsStream("2.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(40);
        imageView.setFitWidth(60);

        button.setGraphic(imageView);

        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.GREEN);
        shadow.setRadius(40);

        button.setStyle("-fx-base:#b6e7c9");

        button.setOnAction(event -> button.setEffect(shadow));

        root.getChildren().addAll(button);


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
