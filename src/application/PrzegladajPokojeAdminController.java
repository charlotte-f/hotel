package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class PrzegladajPokojeAdminController {
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
	
	public void dodajPokoj(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("DodajPokoj.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		DodajPokojController dodajPokojCtrl = loader.getController();
		dodajPokojCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void usunPokoj(){
		
	}
	
	public void edytujDane(){
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("EdytujPokoj.fxml"));
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		EdytujPokojController edytujPokojCtrl = loader.getController();
		edytujPokojCtrl.setLoginController(loginCtrl);
		
		loginCtrl.setScreen(pane);
	}
	
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
	
}
