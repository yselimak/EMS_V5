package personel;

import java.time.LocalDate;

import javafx.beans.property.*;

public class Personel {
    private StringProperty isim;
    private StringProperty soyisim;
    private StringProperty pozisyon;
    private IntegerProperty yas;
    private LongProperty personelNo;
    private StringProperty terfiBilgileri;
    


	// Constructor
    public Personel(String isim, String soyisim, String pozisyon, int yas,long personelNo) {
        this.isim = new SimpleStringProperty(isim);
        this.soyisim = new SimpleStringProperty(soyisim);
        this.pozisyon = new SimpleStringProperty(pozisyon);
        this.yas = new SimpleIntegerProperty(yas);
        this.personelNo = new SimpleLongProperty(personelNo);
        this.terfiBilgileri= new SimpleStringProperty(" "+pozisyon+": "+LocalDate.now());
    }

    // Getter ve setter'lar
    public long getPersonelNo() {
        return personelNo.get();
    }

    public void setPersonelNo(long personelNo) {
        this.personelNo.set(personelNo);
    }

    public LongProperty personelNoProperty() {
        return personelNo;
    }

    public String getIsim() {
        return isim.get();
    }

    public void setIsim(String isim) {
        this.isim.set(isim);
    }

    public StringProperty isimProperty() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim.get();
    }

    public void setSoyisim(String soyisim) {
        this.soyisim.set(soyisim);
    }

    public StringProperty soyisimProperty() {
        return soyisim;
    }

    public String getPozisyon() {
        return pozisyon.get();
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon.set(pozisyon);
    }

    public StringProperty pozisyonProperty() {
        return pozisyon;
    }

    public int getYas() {
        return yas.get();
    }

    public void setYas(int yas) {
        this.yas.set(yas);
    }

    public IntegerProperty yasProperty() {
        return yas;
    }
    
    public String getTerfiBilgileri() {
        return terfiBilgileri.get();
    }

    public void setTerfiBilgileri(String terfiBilgileri) {
        this.terfiBilgileri.set(terfiBilgileri);
    }
    public StringProperty terfiBilgileriProperty() {
        return terfiBilgileri;
    }
	
}