package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class PrzegladajPracownikowController {
private LoginController loginCtrl;
	
	@FXML
	public void powrot(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuAdmin.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		MenuAdminController menuAdminCtrl = loader.getController();
		menuAdminCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	
	}
	
	public void dodajPracownika(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DodajPracownika.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		DodajPracownikaController dodajPracownikaCtrl = loader.getController();
		dodajPracownikaCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void usunPracownika(){
		
	}
	
	public void edytujDane(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("EdytujPracownika.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		EdytujPracownikaController edytujPracownikaCtrl = loader.getController();
		edytujPracownikaCtrl.setLoginController(loginCtrl);
		
		loginCtrl.setScreen(pane);
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
	
}
