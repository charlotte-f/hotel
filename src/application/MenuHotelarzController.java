package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuHotelarzController {

private LoginController loginCtrl;
	
	@FXML
	public void wyloguj(){
		loginCtrl.loadLogowanieScreen();
	}
	
	public void zmienHaslo(){
		
	}
	
	public void przegladajKlientow(){
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
	
	public void przegladajPokoje(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PrzegladajPokojeHotelarz.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		PrzegladajPokojeHotelarzController przegladajPokojeHotelarzCtrl = loader.getController();
		przegladajPokojeHotelarzCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void przegladajRezerwacje(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("PrzegladajRezerwacje.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		PrzegladajRezerwacjeController przegladajRezerwacjeCtrl = loader.getController();
		przegladajRezerwacjeCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
}
