/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asmjava3;

import java.util.Date;

public class SinhVien {
 private String maSV;
 private String tenSV;
 private String email;
 private String soDT;
 private boolean gioitinh;
 private String diachi;
 private String hinhanh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String email, String soDT, boolean gioitinh, String diachi, String hinhanh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.email = email;
        this.soDT = soDT;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinhanh = hinhanh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }



   
    
 
}
