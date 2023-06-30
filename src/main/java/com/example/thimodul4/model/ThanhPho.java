package com.example.thimodul4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="thanhpho")

public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idThanhPho;
    private String tenThanhPho;
    private String dientich;
    private String danSo;
    private String Gdp;
    private String moTaThanhPho;

    @ManyToOne
    @JoinColumn(name = "idQuocgia")
    private QuocGia quocGia;

    public ThanhPho() {
    }

    public ThanhPho(String tenThanhPho, String dientich, String danSo, String gdp, String moTaThanhPho, QuocGia quocGia) {
        this.tenThanhPho = tenThanhPho;
        this.dientich = dientich;
        this.danSo = danSo;
        Gdp = gdp;
        this.moTaThanhPho = moTaThanhPho;
        this.quocGia = quocGia;
    }

    public Long getIdThanhPho() {
        return idThanhPho;
    }

    public void setIdThanhPho(Long idThanhPho) {
        this.idThanhPho = idThanhPho;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public String getDientich() {
        return dientich;
    }

    public void setDientich(String dientich) {
        this.dientich = dientich;
    }

    public String getDanSo() {
        return danSo;
    }

    public void setDanSo(String danSo) {
        this.danSo = danSo;
    }

    public String getGdp() {
        return Gdp;
    }

    public void setGdp(String gdp) {
        Gdp = gdp;
    }

    public String getMoTaThanhPho() {
        return moTaThanhPho;
    }

    public void setMoTaThanhPho(String moTaThanhPho) {
        this.moTaThanhPho = moTaThanhPho;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "ThanhPho{" +
                "idThanhPho=" + idThanhPho +
                ", tenThanhPho='" + tenThanhPho + '\'' +
                ", dientich='" + dientich + '\'' +
                ", danSo='" + danSo + '\'' +
                ", Gdp='" + Gdp + '\'' +
                ", moTaThanhPho='" + moTaThanhPho + '\'' +
                ", quocGia=" + quocGia +
                '}';
    }
}
