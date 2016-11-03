import javafx.application.Application;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.ContentDisplay;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by учитель on 03.11.2016.
 */
public class Main extends Application{

    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        Label label = new Label();
        label.setText("Hello!");

        Image image = new Image(getClass().getResourceAsStream("1.jpg"));
        ImageView img = new ImageView(image);

        img.setFitHeight(300);
        img.setFitWidth(500);

        Label imglabel = new Label();
        imglabel.setGraphic(img);

        imglabel.setTranslateX(75);
        imglabel.setTranslateY(100);

        imglabel.setText("City");
        imglabel.setGraphicTextGap(20);
        imglabel.setContentDisplay(ContentDisplay.TOP);

        Label magicLabal = new Label();
        magicLabal.setText("magic Label!");
        magicLabal.setTranslateX(150);
        magicLabal.setTranslateY(350);

        magicLabal.setOnMouseEntered(event -> {
            magicLabal.setScaleX(1.5);
            magicLabal.setScaleY(1.5);
            magicLabal.setTextFill(Color.RED);
        });

        magicLabal.setOnMouseExited(event -> {
            magicLabal.setScaleX(1);
            magicLabal.setScaleY(1);
            magicLabal.setTextFill(Color.BLACK);
        });

        root.getChildren().addAll(label, imglabel, magicLabal);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
