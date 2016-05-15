package project;



import java.util.regex.Pattern;
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

/**
 * @author ayman
 *@since 2016-05-10
 */

public class project extends Application {
	
	Button bt1;
	Button bt2;
	Button bt3;
	Button bt4;
	Button bt5;
	Button bt6;
	Button bt7;
	Button bt8;
	Button bt9;
	Button bt10;
	Button bt11;
	Button bt12;
	Button bt13;
	Button bt14;
	Button bt15;
	Button bt16;
	Button bt17;
	Button bt18;
	Button bt19;
	Button bt20;
	Button bt21;
	Button bt22;
	Button bt23;
	

	Button bt27;
	
	Label t1;
   
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     *
     */
    @Override
    public void start(Stage primaryStage) {
    	
        
   VBox pane = new VBox();
   HBox text=new HBox();
 pane.setPadding(new Insets(10, 10, 10, 10));
 pane.setSpacing(2);
  t1=new Label();
 t1.setPrefSize(310, 50);
 t1.setStyle("-fx-border-color:blue ");
 pane.setStyle("-fx-border-color:blue ");
// t1.setEditable(false);
text.getChildren().add(t1);
pane.getChildren().add(text);
 HBox row1 = new HBox();
row1.setSpacing(2);
   bt1 = new Button("7");
  bt1.setPrefSize(50, 30);
  bt1.setStyle("-fx-color:darkgray ");
  bt1.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"7");
	  }
});

  bt2 = new Button("8");
 bt2.setPrefSize(50, 30);
 bt2.setStyle("-fx-color:darkgray ");
 bt2.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"8");
	 }
});

  bt3 = new Button("9");
 bt3.setPrefSize(50, 30);
 bt3.setStyle("-fx-color:darkgray ");
 bt3.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"9");
	 }
});

  bt4 = new Button("/");
 bt4.setPrefSize(50, 30);
 bt4.setStyle("-fx-color:blue  ");
 bt4.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"/");
	 }
});
 


 
  bt5 = new Button("C");
 bt5.setPrefSize(50, 30);
 bt5.setStyle("-fx-color:blue ");
 bt5.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  show=show.substring(0,show.length()-1);
		  t1.setText(show);

	}});

  bt6 = new Button("CE");
 bt6.setPrefSize(50, 30);
 bt6.setStyle("-fx-color:blue ");
 bt6.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		String show=t1.getText();
		  show="";
		  t1.setText(show);
	
	}});
   

 
 row1.getChildren().addAll(bt1,bt2,bt3,bt4,bt6,bt5);
 pane.getChildren().add(row1);
 HBox row2 = new HBox();
 row2.setSpacing(2);
 
  bt7 = new Button("4");
 bt7.setPrefSize(50, 30);
 bt7.setStyle("-fx-color:darkgray ");
 bt7.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
	
		  String show=t1.getText();
		  
		  t1.setText(show+"4");
	}
});

 
   bt8 = new Button("5");
  bt8.setPrefSize(50, 30);
  bt8.setStyle("-fx-color:darkgray ");
  bt8.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"5");
	}
});
 
 
   bt9 = new Button("6");
  bt9.setPrefSize(50, 30);
  bt9.setStyle("-fx-color:darkgray ");
  bt9.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"6");
	}
});
 
 
  bt10 = new Button("*");
  bt10.setPrefSize(50, 30);
  bt10.setStyle("-fx-color:blue ");
  bt10.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"*");
	}
});
 
 
  bt11 = new Button("sin");
  bt11.setPrefSize(50, 30);
  bt11.setStyle("-fx-color:blue ");
  bt11.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"sin");
	}
});
 
 
  bt12 = new Button("cos");
 bt12.setPrefSize(50, 30);
 bt12.setStyle("-fx-color:blue ");
 bt12.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"cos");
	}
});

row2.getChildren().addAll(bt7,bt8,bt9,bt10,bt11,bt12);
pane.getChildren().add(row2);
HBox row3 = new HBox();
row3.setSpacing(2);
  bt13 = new Button("1");
 bt13.setPrefSize(50, 30);
 bt13.setStyle("-fx-color:darkgray ");
 bt13.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"1");
	}
});


  bt14 = new Button("2");
 bt14.setPrefSize(50, 30);
 bt14.setStyle("-fx-color:darkgray ");
 bt14.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"2");
	}
});


  bt15 = new Button("3");
 bt15.setPrefSize(50, 30);
 bt15.setStyle("-fx-color:darkgray ");
 bt15.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
	
		  String show=t1.getText();
		  t1.setText(show+"3");
	}
});


  bt16 = new Button("-");
 bt16.setPrefSize(50, 30);
	bt16.setStyle("-fx-color:blue ");
 bt16.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
	
		  String show=t1.getText();
		  t1.setText(show+"-");
	}
});


 bt17 = new Button("tan");
 bt17.setPrefSize(50, 30);
 bt17.setStyle("-fx-color:blue ");
 bt17.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"tan");
	}
});


  bt18 = new Button("log");
 bt18.setPrefSize(50, 30);
	bt18.setStyle("-fx-color:blue ");
 bt18.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
	
		  String show=t1.getText();
		  t1.setText(show+"log");
	}
});

row3.getChildren().addAll(bt13,bt14,bt15,bt16,bt17,bt18);
pane.getChildren().add(row3);
HBox row4 = new HBox();
row4.setSpacing(2);
 bt19 = new Button("0");
 bt19.setPrefSize(50, 30);
 bt19.setStyle("-fx-color:darkgray ");
 bt19.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"0");
	}
});

  bt20 = new Button(".");
  bt20.setPrefSize(50, 30);
  bt20.setStyle("-fx-color:darkgray ");
  bt20.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+".");
	}
});

  bt21 = new Button("p");
  bt21.setPrefSize(50, 30);
	bt21.setStyle("-fx-color:darkgray ");
  bt21.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
	
		  String show=t1.getText();
		  t1.setText(show+"p");
	}
});

 bt22 = new Button("+");
bt22.setPrefSize(50, 30);
bt22.setStyle("-fx-color:blue  ");
bt22.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
		  String show=t1.getText();
		  t1.setText(show+"+");
	}
});
bt27 = new Button("Sqr");
bt27.setPrefSize(50, 30);
bt27.setStyle("-fx-color:blue");
bt27.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
	
		String show=t1.getText();
	  t1.setText(show+"Sqr");}
});

  
  bt23 = new Button("=");
 bt23.setPrefSize(50, 30);
 bt23.setStyle("-fx-color:orange ");
 bt23.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent e) {
		
           String show=t1.getText();
            double result=calculate(show);
            t1.setText(String.valueOf(result));
          }});
    
row4.getChildren().addAll(bt19,bt20,bt21,bt22,bt27,bt23);
 pane.getChildren().add(row4);
 //pane.setAlignment(Pos.BOTTOM_CENTER);
  StackPane p=new StackPane();
  p.getChildren().add(pane);
        Scene scene = new Scene( p);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

         
   
   
    
    


 /**
  * this method calculate expression  of calculator 
  * it calculate sum,sup,mult,div,sin,cos,sqr
  * it take text from t1 then split it ,store result in array
  * separate operators in arrays ,then excute the operations 
 * @param x which contain the returned text from t1
 * 
 * @return double output of calculation of expression 
 */
public double calculate(String x){
        
  Double valueFormula=0.0;
   if(x.charAt(0)=='c'){
        String d=x.substring(3, x.length());
       valueFormula=Math.cos(Double.parseDouble(d)*Math.PI/180);
  
        }
   else if(x.charAt(0)==('p')){
            valueFormula=Math.PI;
                    }
   else if(x.charAt(0)=='s'){
        String d=x.substring(3, x.length());
       valueFormula=Math.sin(Double.parseDouble(d)*Math.PI/180);
  
        }
   else if(x.charAt(0)=='t'){
        String d=x.substring(3, x.length());
       valueFormula=Math.tan(Double.parseDouble(d)*Math.PI/180);

        }
        
   else if(x.charAt(0)=='l'){
        String d=x.substring(3, x.length());
         valueFormula=Math.log10(Double.parseDouble(d));

        }
   else if(x.charAt(0)=='S'){
	   String d=x.substring(3, x.length());
        valueFormula=Math.sqrt(Double.parseDouble(d));

       }
  
   
         
  else{
             
                      String plus[]=x.split(Pattern.quote("+"));
        for(int i = 0;i<plus.length;i++){
            
            try{
                String muins[]=plus[i].split(Pattern.quote("-"));
                for(int j = 0;j<muins.length;j++){
                    if(j!=0){
                       muins[j]="-"+muins[j];
                    }
                
                if(muins[j].contains("*")||muins[j].contains("/")){
                   
                    Double value=1.0;
                    String multiplication[]=muins[j].split(Pattern.quote("*"));
                    for(int k = 0;k<multiplication.length;k++){
                       
                        try{
                            String division[]=multiplication[k].split(Pattern.quote("/"));
                            for(int l = 0;l<division.length;l++){
                                if(l != 0){
                                division[l]=String.valueOf(1/Double.parseDouble(division[l]));                    
                                }
                                value*=Double.parseDouble(division[l]); 
                            }                           
                        }catch(ArrayIndexOutOfBoundsException y){
                            System.out.println("error occurence");
                        }                        
                    }
                    muins[j]=String.valueOf(value);
                    
                }
                
                valueFormula+=Double.parseDouble(muins[j]);
            }
            }
       
            catch(ArrayIndexOutOfBoundsException y){
                    System.out.println("error occurence");
            }
            
        }
}
       
        
        
          return valueFormula;
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