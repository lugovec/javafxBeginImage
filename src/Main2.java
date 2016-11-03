        import javafx.application.Application;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.Border;
        import javafx.scene.layout.BorderPane;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

/**
 * Created by учитель on 03.11.2016.
 */
public class Main2 extends Application{

    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();

        HBox hBox = new HBox(10);
        VBox vBox = new VBox(10);

        Button btn1 = addButton("1");
        Button btn2 = addButton("2");
        Button btn3 = addButton("3");
        Button btn4 = addButton("4");
        Button btn5 = addButton("5");
        Button btn6 = addButton("6");

        hBox.setAlignment(Pos.CENTER);

        hBox.getChildren().setAll(btn1, btn2, btn3);
        vBox.getChildren().setAll(btn4, btn5, btn6);

        root.setTop(hBox);
        root.setLeft(vBox);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Button addButton(String name){
        Button btn = new Button();
        btn.setText(name);
        btn.setPrefSize(70, 50);
        return btn;
    }
}
