import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by malinaandahl on 26.04.16.
 */
public class Sjakk extends Application{

    public void start(Stage primaryStage){
        GridPane brett = new GridPane();

        for(int y = 0; y < 8; y++){
            for(int x = 0; x < 8; x++){
                StackPane rute = new StackPane();

                //Setter farge
                Color farge;
                if((y+x) % 2 == 0){
                    //Partall - sett farge til hvit.
                    farge = Color.WHITE;
                } else {
                    farge = Color.DARKGRAY;
                }

                rute.setBackground(new Background(new BackgroundFill(farge,
                        CornerRadii.EMPTY, Insets.EMPTY)));

                //Sett kantlinje
                rute.setBorder(new Border(new BorderStroke(Color.BLACK,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
                        new BorderWidths(1, 1, 0, 0))));

                brett.add(rute, x, y);


            }
        }


        int storrelse = 40;

        for(int i = 0; i < 8; i++){
            brett.getColumnConstraints().add(new ColumnConstraints(storrelse));
            brett.getRowConstraints().add(new RowConstraints(storrelse));
        }

        Scene scene = new Scene(brett);

        primaryStage.setScene(scene);
        primaryStage.setTitle("IFI-sjakk");
        primaryStage.show();
    }
}
