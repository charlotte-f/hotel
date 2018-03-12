package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class PrzegladajKlientowController {
private LoginController loginCtrl;
	
	@FXML
	public void powrot(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuHotelarz.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		MenuHotelarzController menuHotelarzCtrl = loader.getController();
		menuHotelarzCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	
	}
	
	public void dodajKlienta(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DodajKlienta.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		DodajKlientaController dodajKlientaCtrl = loader.getController();
		dodajKlientaCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void usunKlienta(){
		
	}
	
	public void edytujDane(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("EdytujKlienta.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		EdytujKlientaController edytujKlientaCtrl = loader.getController();
		edytujKlientaCtrl.setLoginController(loginCtrl);
		
		loginCtrl.setScreen(pane);
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
	
}
