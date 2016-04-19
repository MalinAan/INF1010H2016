import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;

/**
 * Created by malinaandahl on 19.04.16.
 */
public class Oppgave1 extends Application{

    @Override
    public void start(Stage primaryStage){
        Button knapp = new Button("Trykk her");
        //Lage en event for knappen.
        knapp.setOnAction(new KnappEvent());

        knapp.setFont(new Font(20));

        knapp.setPadding(new Insets(30));

        StackPane rotnode = new StackPane();
        rotnode.getChildren().add(knapp);

        Scene scene = new Scene(rotnode, 400, 300);

        //Kobler stage med Scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Knappeprogram");

        //For aa faa scenen til aa syntes.
        primaryStage.show();


    }

    public static void main(String[] args){
        launch(args);
    }

    private class KnappEvent implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            System.out.println("hei");
        }
    }

}
