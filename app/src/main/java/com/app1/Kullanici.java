package com.app1;

public class Kullanici {

    private String  kullanici_adi;
    private String  password;
    private String  kullanici_UID;
    private String  homedizi;
    private String  acildigitarih;
    private String  kalansure;

    public Kullanici(String kullanici_adi, String password) {
        this.kullanici_adi = kullanici_adi;
        this.password = password;
    }
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
        return kullanici_adi;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public String getKullanici_UID() {
        return kullanici_UID;
    }

    public void setKullanici_UID(String kullanici_UID) {
        this.kullanici_UID = kullanici_UID;
    }

    public String getHomedizi() {
        return homedizi;
    }

    public void setHomedizi(String homedizi) {
        this.homedizi = homedizi;
    }

    public String getAcildigitarih() {
        return acildigitarih;
    }

    public void setAcildigitarih(String acildigitarih) {
        this.acildigitarih = acildigitarih;
    }

    public String getKalansure() {
        return kalansure;
    }

    public void setKalansure(String kalansure) {
        this.kalansure = kalansure;
    }
}
