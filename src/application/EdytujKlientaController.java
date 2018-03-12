package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class EdytujKlientaController {
private LoginController loginCtrl;
	
	@FXML
	public void powrot(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PrzegladajKlientow.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		PrzegladajKlientowController przegladajKlientowCtrl = loader.getController();
		przegladajKlientowCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	
	}
	
	public void edytuj(){
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
}
