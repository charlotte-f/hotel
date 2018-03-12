package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class LogowanieController {
	
	private LoginController loginCtrl;
	@FXML
	public void zaloguj(){
		
		/* wybieranie konta - odkomentuj odpowiedni¹ linjke czy admin czy hotelarz */
		//FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuHotelarz.fxml"));
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuAdmin.fxml"));
		
		
		Pane pane = null;
		try{
			pane = loader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		/* wybieranie konta - odkomentuj odpowiednie linijki czy admin czy hotelarz */
		
		MenuAdminController menuAdminCtrl = loader.getController();
		menuAdminCtrl.setLoginController(loginCtrl);
	
		//MenuHotelarzController menuHotelarzCtrl = loader.getController();
		//menuHotelarzCtrl.setLoginController(loginCtrl);
		
		
		loginCtrl.setScreen(pane);
	}
	
	public void exit(){
		System.exit(0);
	
	}
	
	public void setLoginController(LoginController loginCtrl) {
		this.loginCtrl = loginCtrl;
	}
	
	
}
