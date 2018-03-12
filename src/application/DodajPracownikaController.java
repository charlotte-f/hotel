package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class DodajPracownikaController {
private LoginController loginCtrl;
	
	@FXML
	public void powrot(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PrzegladajPracownikow.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		PrzegladajPracownikowController przegladajPracownikowCtrl = loader.getController();
		przegladajPracownikowCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	
	}
	
	public void dodaj(){
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
}
