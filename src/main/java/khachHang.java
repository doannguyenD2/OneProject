
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dharm
 */
public class khachHang {
    private int maKH;
    private String hoTenString;
    private String diaChiString;
    private long soDTLong;

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTenString() {
        return hoTenString;
    }

    public void setHoTenString(String hoTenString) {
        this.hoTenString = hoTenString;
    }

    public String getDiaChiString() {
        return diaChiString;
    }

    public void setDiaChiString(String diaChiString) {
        this.diaChiString = diaChiString;
    }

    public long getSoDTLong() {
        return soDTLong;
    }

    public void setSoDTLong(long soDTLong) {
        this.soDTLong = soDTLong;
    }
    
    public Object toObject(){
        return new Object[]{
          maKH,hoTenString,diaChiString,soDTLong  
        };
    }

    
    
    
}
