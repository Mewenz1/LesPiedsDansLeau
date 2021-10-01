package com.example.lespiedsdansleau.Metier;
import java.util.Date;

public class QualiteEau {

    private int idQual;
    private Date dateQual;
    private float phQual;
    private float tempQual;
    private float oxyQual;
    private float ECQual;
    private Zone uneZone;

    public QualiteEau(int idQual, Date dateQual, float phQual, float tempQual, float oxyQual, float ECQual, Zone uneZone) {
        this.idQual = idQual;
        this.dateQual = dateQual;
        this.phQual = phQual;
        this.tempQual = tempQual;
        this.oxyQual = oxyQual;
        this.ECQual = ECQual;
        this.uneZone = uneZone;
    }

    public int getIdQual() {
        return idQual;
    }

    public void setIdQual(int idQual) {
        this.idQual = idQual;
    }

    public Date getDateQual() {
        return dateQual;
    }

    public void setDateQual(Date dateQual) {
        this.dateQual = dateQual;
    }

    public float getPhQual() {
        return phQual;
    }

    public void setPhQual(float phQual) {
        this.phQual = phQual;
    }

    public float getTempQual() {
        return tempQual;
    }

    public void setTempQual(float tempQual) {
        this.tempQual = tempQual;
    }

    public float getOxyQual() {
        return oxyQual;
    }

    public void setOxyQual(float oxyQual) {
        this.oxyQual = oxyQual;
    }

    public float getECQual() {
        return ECQual;
    }

    public void setECQual(float ECQual) {
        this.ECQual = ECQual;
    }

    public Zone getUneZone() {
        return uneZone;
    }

    public void setUneZone(Zone uneZone) {
        this.uneZone = uneZone;
    }

    @Override
    public String toString() {
        return "QualiteEau{" +
                "idQual=" + idQual +
                ", dateQual=" + dateQual +
                ", phQual=" + phQual +
                ", tempQual=" + tempQual +
                ", oxyQual=" + oxyQual +
                ", ECQual=" + ECQual +
                ", uneZone=" + uneZone +
                '}';
    }
}
