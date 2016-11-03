import javafx.application.Application;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.ContentDisplay;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.*;
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

        root.getChildren().addAll(label, imglabel);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
