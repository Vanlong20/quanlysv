/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asmjava3;

/**
 *
 * @author pc
 */
public class Grade {
    String masv;
    String hoten;
    int tiengAnh;
    int tinHoc;
    int GDTC;
//    double diemTB;

    public Grade() {
    }

    public Grade(String masv, String hoten, int tiengAnh, int tinHoc, int GDTC) {
        this.masv = masv;
        this.hoten = hoten;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
//        this.diemTB = diemTB;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(int tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public int getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(int tinHoc) {
        this.tinHoc = tinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }

    public double getDiemTB() {
        return (this.tiengAnh+this.tinHoc+this.GDTC)/3.0;
    }

//    public void setDiemTB(double diemTB) {
//        this.diemTB = diemTB;
//    }
//    
}
