package h2man;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
public class Calculate extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
   VBox pane = new VBox();
   HBox text=new HBox();
 pane.setPadding(new Insets(10, 10, 10, 10));
 pane.setSpacing(2);
 TextField t1=new TextField();
 t1.setPrefSize(310, 50);
 t1.setEditable(false);
text.getChildren().add(t1);
pane.getChildren().add(text);
 HBox row1 = new HBox();
row1.setSpacing(2);
  Button bt1 = new Button("7");
  bt1.setPrefSize(50, 30);

 Button bt2 = new Button("8");
 bt2.setPrefSize(50, 30);

 Button bt3 = new Button("9");
 bt3.setPrefSize(50, 30);

 Button bt4 = new Button("%");
 bt4.setPrefSize(50, 30);
 
 Button bt5 = new Button("←");
 bt5.setPrefSize(50, 30);

 Button bt6 = new Button("⌂");
 bt6.setPrefSize(50, 30);
 row1.getChildren().addAll(bt1,bt2,bt3,bt4,bt5,bt6);
 pane.getChildren().add(row1);
 HBox row2 = new HBox();
 row2.setSpacing(2);
 Button bt7 = new Button("4");
 bt7.setPrefSize(50, 30);
 
  Button bt8 = new Button("5");
  bt8.setPrefSize(50, 30);
 
  Button bt9 = new Button("6");
  bt9.setPrefSize(50, 30);
 
  Button bt10 = new Button("X");
  bt10.setPrefSize(50, 30);
 
  Button bt11 = new Button("(");
  bt11.setPrefSize(50, 30);
 
 Button bt12 = new Button(")");
 bt12.setPrefSize(50, 30);
row2.getChildren().addAll(bt7,bt8,bt9,bt10,bt11,bt12);
pane.getChildren().add(row2);
HBox row3 = new HBox();
row3.setSpacing(2);
 Button bt13 = new Button("1");
 bt13.setPrefSize(50, 30);

 Button bt14 = new Button("2");
 bt14.setPrefSize(50, 30);

 Button bt15 = new Button("3");
 bt15.setPrefSize(50, 30);

 Button bt16 = new Button("-");
 bt16.setPrefSize(50, 30);

 Button bt17 = new Button("x^2");
 bt17.setPrefSize(50, 30);

 Button bt18 = new Button("√");
 bt18.setPrefSize(50, 30);
row3.getChildren().addAll(bt13,bt14,bt15,bt16,bt17,bt18);
pane.getChildren().add(row3);
HBox row4 = new HBox();
row4.setSpacing(2);
 Button bt19 = new Button("0");
 bt19.setPrefSize(50, 30);

  Button bt20 = new Button(".");
  bt20.setPrefSize(50, 30);

  Button bt21 = new Button("%");
  bt21.setPrefSize(50, 30);

Button bt22 = new Button("+");
bt22.setPrefSize(50, 30);

  
 Button bt23 = new Button("=");
 bt23.setPrefSize(104, 30);
row4.getChildren().addAll(bt19,bt20,bt21,bt22,bt23);
 pane.getChildren().add(row4);
        Scene scene = new Scene( pane,300,180);
       
        primaryStage.setTitle("Taschenrechner");
        primaryStage.setScene(scene);
         primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

