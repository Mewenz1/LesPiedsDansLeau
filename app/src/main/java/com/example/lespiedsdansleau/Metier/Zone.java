package com.example.lespiedsdansleau.Metier;

public class Zone {

    private int idZo;
    private String nomZo;
    private String descZo;
    private Exploitation uneExploitation;

    public Zone(int idZo, String nomZo, String descZo, Exploitation uneExploitation) {
        this.idZo = idZo;
        this.nomZo = nomZo;
        this.descZo = descZo;
        this.uneExploitation = uneExploitation;
    }

    public int getIdZo() {
        return idZo;
    }

    public void setIdZo(int idZo) {
        this.idZo = idZo;
    }

    public String getNomZo() {
        return nomZo;
    }

    public void setNomZo(String nomZo) {
        this.nomZo = nomZo;
    }

    public String getDescZo() {
        return descZo;
    }

    public void setDescZo(String descZo) {
        this.descZo = descZo;
    }

    public Exploitation getUneExploitation() {
        return uneExploitation;
    }

    public void setUneExploitation(Exploitation uneExploitation) {
        this.uneExploitation = uneExploitation;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "idZo=" + idZo +
                ", nomZo='" + nomZo + '\'' +
                ", descZo='" + descZo + '\'' +
                ", uneExploitation=" + uneExploitation +
                '}';
    }
}
