import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    
    Button button;
    Stage Window;
    Scene scene;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        Window = primaryStage;
        Window.setTitle("JavaFX");
        
      
        //Form
        TextField nameInput = new TextField();
        
        button = new Button("Click me");
        button.setOnAction( e -> isInt(nameInput, nameInput.getText())  );
        
        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);
           
        
        
        scene = new Scene(layout, 300, 250);
        Window.setScene(scene);
        Window.show();
        
    }
    
    private boolean isInt(TextField input, String message){
       try{
           int age = Integer.parseInt(input.getText());
           System.out.println("User is: " + age);
           return true;
       }catch(NumberFormatException e) {
        System.out.println("Error: " + message + "is not a number");
        return false;
    }
    }
}

   



    
      

