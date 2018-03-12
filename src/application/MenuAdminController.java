package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuAdminController {
	private LoginController loginCtrl;
	
	@FXML
	public void wyloguj(){
		loginCtrl.loadLogowanieScreen();
	}
	
	public void zmienHaslo(){
		
	}
	
	public void przegladajPracownikow(){
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
	
	public void przegladajPokoje(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PrzegladajPokojeAdmin.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		PrzegladajPokojeAdminController przegladajPokojeAdminCtrl = loader.getController();
		przegladajPokojeAdminCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
	
}
