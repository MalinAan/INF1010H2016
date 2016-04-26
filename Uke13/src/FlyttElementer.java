import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Created by malinaandahl on 26.04.16.
 */
public class FlyttElementer extends Application {
    HBox tilBoks;
    HBox fraBoks;
    public void start(Stage primaryStage){
        VBox rotnode = new VBox(5);
        fraBoks = lagFraBoks();
        tilBoks = new HBox(5); //5 space

        Button flyttKnapp = new Button("Flytt laveste tall ned");
        flyttKnapp.setOnAction(new FlyttTall());

        rotnode.getChildren().addAll(fraBoks, flyttKnapp, tilBoks);

        Scene scene = new Scene(rotnode, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Flytteprogram");
        primaryStage.show();

    }

    public HBox lagFraBoks(){
        HBox beholder = new HBox(5);

        //Lage 20 bokser med tilfeldige nummere.
        for(int i = 0; i < 20; i++){
            Random rand = new Random();
            int tilfeldigNummer = rand.nextInt(100);

            Label label = new Label("" + tilfeldigNummer);

            beholder.getChildren().add(label);
        }  return beholder;
    }

    private class FlyttTall implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e){
            //Finn laveste node
            //Vi finner den ved aa iterere igjennom alle nodene, og flytter den til tilBoks.
            Label laveste = (Label) fraBoks.getChildren().get(0);

            for(Node node : fraBoks.getChildren()){
                //Caster om node til label.
                Label tekst = (Label) node;
                if(Integer.parseInt(tekst.getText()) <
                        Integer.parseInt(laveste.getText())){
                    laveste = tekst;
                }
            }

            //Fjerne laveste fra fraBoks, og til tilBoks.
            fraBoks.getChildren().remove(laveste);
            tilBoks.getChildren().add(laveste);
        }
    }
}
