package com.example.thimodul4.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quocgia")
public class QuocGia {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuocgia;
    private String tenQuocgia;
    @JsonIgnore
    @OneToMany
    private List<ThanhPho> thanhPhoList;

    public QuocGia() {
    }

    public QuocGia(String tenQuocgia, List<ThanhPho> thanhPhoList) {
        this.tenQuocgia = tenQuocgia;
        this.thanhPhoList = thanhPhoList;
    }

    public Long getIdQuocgia() {
        return idQuocgia;
    }

    public void setIdQuocgia(Long idQuocgia) {
        this.idQuocgia = idQuocgia;
    }

    public String getTenQuocgia() {
        return tenQuocgia;
    }

    public void setTenQuocgia(String tenQuocgia) {
        this.tenQuocgia = tenQuocgia;
    }

    public List<ThanhPho> getThanhPhoList() {
        return thanhPhoList;
    }

    public void setThanhPhoList(List<ThanhPho> thanhPhoList) {
        this.thanhPhoList = thanhPhoList;
    }

    @Override
    public String toString() {
        return "QuocGia{" +
                "idQuocgia=" + idQuocgia +
                ", tenQuocgia='" + tenQuocgia + '\'' +
                ", thanhPhoList=" + thanhPhoList +
                '}';
    }
}
