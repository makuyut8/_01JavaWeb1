package com.juaracoding._01JavaWeb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.juaracoding._01JavaWeb.model.Divisi;
import com.juaracoding._01JavaWeb.model.Menu;

import javax.validation.constraints.NotNull;
import java.util.List;

public class AksesDTO {

    private Long idAkses;

    private String namaAkses;

//    @JsonIgnoreProperties("listAksesMenu")
    private List<MenuDTO> listMenuAkses;

    private DivisiDTO divisi;

    public Long getIdAkses() {
        return idAkses;
    }

    public void setIdAkses(Long idAkses) {
        this.idAkses = idAkses;
    }

    public String getNamaAkses() {
        return namaAkses;
    }

    public void setNamaAkses(String namaAkses) {
        this.namaAkses = namaAkses;
    }

    public List<MenuDTO> getListMenuAkses() {
        return listMenuAkses;
    }

    public void setListMenuAkses(List<MenuDTO> listMenuAkses) {
        this.listMenuAkses = listMenuAkses;
    }

    public DivisiDTO getDivisi() {
        return divisi;
    }

    public void setDivisi(DivisiDTO divisi) {
        this.divisi = divisi;
    }

    @Override
    public String toString() {
        return this.namaAkses;
    }

}