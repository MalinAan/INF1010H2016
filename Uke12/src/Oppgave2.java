import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

/**
 * Created by malinaandahl on 19.04.16.
 */
public class Oppgave2 extends Application{

    TextField venstreFelt;
    TextField hoyreFelt;
    Label resultatTekst; //Tekst som viser resultatet av utregningen.

    @Override
    public void start(Stage primaryStage){
        venstreFelt = new TextField();
        hoyreFelt = new TextField();

        GridPane knapper = lagKnapper();

        resultatTekst = new Label("Skriv inn tall i de to feltene og velg operator");

        HBox utregningsFelt = new HBox(5); //5 spacing.
        utregningsFelt.getChildren().addAll(venstreFelt, knapper, hoyreFelt);

        VBox rotnode = new VBox(5); //5 spacing.
        rotnode.getChildren().addAll(utregningsFelt, resultatTekst);
        rotnode.setAlignment(Pos.CENTER); //Midtjustering

        rotnode.setPadding(new Insets(10));

        Scene scene = new Scene(rotnode);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setTitle("IFI-kalkulator");
        primaryStage.show();


    }

    private GridPane lagKnapper(){
        Button plussKnapp = new Button("+");
        Button minusKnapp = new Button("-");
        Button deleKnapp = new Button("/");
        Button gangeKnapp = new Button("*");

        plussKnapp.setOnAction(new KnappEvent('+'));
        minusKnapp.setOnAction(new KnappEvent('-'));
        deleKnapp.setOnAction(new KnappEvent('/'));
        gangeKnapp.setOnAction(new KnappEvent('*'));

        //Vi lager en beholder og legger alle knappene inne i den.
        GridPane beholder = new GridPane();
        beholder.add(plussKnapp, 0, 0);
        beholder.add(minusKnapp, 1, 0);
        beholder.add(gangeKnapp, 0, 1);
        beholder.add(deleKnapp, 1, 1);

        return beholder;


    }

    private class KnappEvent implements EventHandler<ActionEvent>{
        char regneForm;

        public KnappEvent(char regneform){
            this.regneForm = regneform;
        }

        public void handle(ActionEvent event){
            double venstreVerdi = 0;
            double hoyreVerdi = 0;


            try {
                venstreVerdi = Double.parseDouble(venstreFelt.getText());
                hoyreVerdi = Double.parseDouble(hoyreFelt.getText());
            } catch(NumberFormatException unntak){
                System.out.println("Feil i input " + unntak.getMessage());
            }


            double resultat = 0;

            switch(regneForm){
                case '+': resultat = venstreVerdi + hoyreVerdi; break;
                case '-': resultat = venstreVerdi - hoyreVerdi; break;
                case '/': resultat = venstreVerdi / hoyreVerdi; break;
                case '*': resultat = venstreVerdi * hoyreVerdi; break;
            }

            resultatTekst.setText("Resultat er " + resultat);
        }
    }
}
