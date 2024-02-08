package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConversioniNumeriche extends Application {
	TextField cNumero = new TextField();
	TextField cBase = new TextField();
	Button pCalcola = new Button("calcola");
	Label eRisultato = new Label();
	
	public void start(Stage finestra) throws Exception {
		GridPane griglia = new GridPane();
		Label eNumero = new Label("Numero:");
		Label eBase = new Label("Base:");
		Label eNumeroConvertito = new Label("numero convertito:");
		
		griglia.setGridLinesVisible(false);
		
		griglia.add(eNumero, 0, 0);
		griglia.add(cNumero, 1, 0);
		griglia.add(eBase, 0, 1);
		griglia.add(cBase, 1, 1);
		griglia.add(pCalcola, 0, 2, 2, 1);
		griglia.add(eNumeroConvertito, 0, 3);
		griglia.add(eRisultato, 1, 3);

		pCalcola.setMaxWidth(300);
	    pCalcola.setOnAction(e -> calcola());
		
		griglia.setPadding( new Insets(10,10,10,10));
		griglia.setHgap(5);
		griglia.setVgap(5);
		
		Scene scena = new Scene (griglia);
		finestra.setTitle("Conversioni Numeriche");
		finestra.setScene(scena);
		finestra.show();
		
	}
	public void calcola() {
		  double raggio, area, circonferenza ;
		  raggio = Double.parseDouble(cRaggio.getText());
		 area=(raggio*raggio)*3.14;
		 eArea.setText("" + area);
		 circonferenza=(((2*raggio)*3.14)-2)*2;
		 eCirconferenzaA.setText("" + circonferenza);
		 eCirconferenzaB.setText("" + circonferenza);
	  }
	public static void main(String[] args) {
		launch(args);
	}
}
