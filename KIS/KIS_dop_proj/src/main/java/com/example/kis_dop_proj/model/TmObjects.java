package com.example.kis_dop_proj.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: tm_objects
 */
public class TmObjects {
    /**
     * Column: id_poezd
     * Type: numeric
     * Remark: Системный идентификатор поезда
     */
    private BigDecimal idPoezd;

    /**
     * Column: vrsvop
     * Type: timestamp
     * Remark: Дата и время совершения последней операции с поездом
     */
    private Date vrsvop;

    /**
     * Column: dis_esr
     * Type: varchar(6)
     * Remark: еср станции
     */
    private String disEsr;

    /**
     * Column: dis_park
     * Type: varchar(2)
     * Remark: парк
     */
    private String disPark;

    /**
     * Column: dis_put
     * Type: varchar(2)
     * Remark: путь
     */
    private String disPut;

    /**
     * Column: nom_poezd
     * Type: varchar(15)
     * Remark: номер поезда
     */
    private String nomPoezd;

    /**
     * Column: esr_f
     * Type: varchar(6)
     * Remark: Код еср станции формирования
     */
    private String esrF;

    /**
     * Column: pn_sost
     * Type: varchar(3)
     * Remark: порядковый номер состава
     */
    private String pnSost;

    /**
     * Column: esr_n
     * Type: varchar(6)
     * Remark: Код еср станции назначения
     */
    private String esrN;

    /**
     * Column: pr_grup
     * Type: varchar(1)
     * Remark: признак группы вагонов (0-поезд, 1-группв вагонов, 2 - локомотив)
     */
    private String prGrup;

    /**
     * Column: pr_soed
     * Type: varchar(1)
     * Remark: признак соединенного поезда 1-объединенный поезд, 2-составная часть объединенного.
     */
    private String prSoed;

    /**
     * Column: kodop_p
     * Type: varchar(2)
     * Remark: код операции с поездом
     */
    private String kodopP;

    /**
     * Column: kateg_poezd
     * Type: numeric
     * Remark: код категории поезда
     */
    private BigDecimal kategPoezd;

    /**
     * Column: esr_napr
     * Type: varchar(6)
     * Remark: Код еср станции направления отправления/прибытия
     */
    private String esrNapr;

    /**
     * Column: esr_napr_prib
     * Type: varchar(6)
     * Remark: Код еср станции направления прибытия для операции проследования
     */
    private String esrNaprPrib;

    public BigDecimal getIdPoezd() {
        return idPoezd;
    }

    public void setIdPoezd(BigDecimal idPoezd) {
        this.idPoezd = idPoezd;
    }

    public Date getVrsvop() {
        return vrsvop;
    }

    public void setVrsvop(Date vrsvop) {
        this.vrsvop = vrsvop;
    }

    public String getDisEsr() {
        return disEsr;
    }

    public void setDisEsr(String disEsr) {
        this.disEsr = disEsr == null ? null : disEsr.trim();
    }

    public String getDisPark() {
        return disPark;
    }

    public void setDisPark(String disPark) {
        this.disPark = disPark == null ? null : disPark.trim();
    }

    public String getDisPut() {
        return disPut;
    }

    public void setDisPut(String disPut) {
        this.disPut = disPut == null ? null : disPut.trim();
    }

    public String getNomPoezd() {
        return nomPoezd;
    }

    public void setNomPoezd(String nomPoezd) {
        this.nomPoezd = nomPoezd == null ? null : nomPoezd.trim();
    }

    public String getEsrF() {
        return esrF;
    }

    public void setEsrF(String esrF) {
        this.esrF = esrF == null ? null : esrF.trim();
    }

    public String getPnSost() {
        return pnSost;
    }

    public void setPnSost(String pnSost) {
        this.pnSost = pnSost == null ? null : pnSost.trim();
    }

    public String getEsrN() {
        return esrN;
    }

    public void setEsrN(String esrN) {
        this.esrN = esrN == null ? null : esrN.trim();
    }

    public String getPrGrup() {
        return prGrup;
    }

    public void setPrGrup(String prGrup) {
        this.prGrup = prGrup == null ? null : prGrup.trim();
    }

    public String getPrSoed() {
        return prSoed;
    }

    public void setPrSoed(String prSoed) {
        this.prSoed = prSoed == null ? null : prSoed.trim();
    }

    public String getKodopP() {
        return kodopP;
    }

    public void setKodopP(String kodopP) {
        this.kodopP = kodopP == null ? null : kodopP.trim();
    }

    public BigDecimal getKategPoezd() {
        return kategPoezd;
    }

    public void setKategPoezd(BigDecimal kategPoezd) {
        this.kategPoezd = kategPoezd;
    }

    public String getEsrNapr() {
        return esrNapr;
    }

    public void setEsrNapr(String esrNapr) {
        this.esrNapr = esrNapr == null ? null : esrNapr.trim();
    }

    public String getEsrNaprPrib() {
        return esrNaprPrib;
    }

    public void setEsrNaprPrib(String esrNaprPrib) {
        this.esrNaprPrib = esrNaprPrib == null ? null : esrNaprPrib.trim();
    }
}