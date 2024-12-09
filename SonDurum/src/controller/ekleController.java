package controller;

import personel.Personel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ekleController {
	@FXML
	private Button onaylaButon;
	@FXML
	private TextField isimTextField;
	@FXML
	private TextField soyisimTextField;
	@FXML
	private TextField personelNoTextField;
	@FXML
	private TextField pozisyonTextField;
	@FXML
	private TextField yasTextField;
	
	
	@FXML
	public void onaylaButonKod() {
		// TextField'dan alınan değerleri uygun türlere dönüştür
	    long personelNo = Long.parseLong(personelNoTextField.getText());
	    String isim = isimTextField.getText().toUpperCase();
	    String soyisim = soyisimTextField.getText().toUpperCase();
	    String pozisyon = pozisyonTextField.getText().toUpperCase();
	    int yas = Integer.parseInt(yasTextField.getText());
	    
	    // Personel nesnesi oluşturuluyor
	    Personel yeniPersonel = new Personel(isim, soyisim, pozisyon, yas,personelNo);
	    // observable liste yenii personeli ekle
	    Controller.personelList.add(yeniPersonel);
	    //Controller controller=new Controller();
	    //controller.tableView.setItems(Controller.personelList);
	    
		// onaylaButon'un bulunduğu stage'i kapat
		Stage kapastage = (Stage) onaylaButon.getScene().getWindow(); // onaylaButon'un bulunduğu stage'i bir nesneye atama
		kapastage.close(); // alınan stage'i kapatma
		
		
	}
	
	
	
}
