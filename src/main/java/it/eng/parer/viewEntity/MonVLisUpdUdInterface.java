/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author gilioli_p
 */
public interface MonVLisUpdUdInterface extends Serializable {

    BigDecimal getAaKeyUnitaDoc();

    String getCdKeyUnitaDoc();

    String getCdRegistroKeyUnitaDoc();

    String getDsEnteStrut();

    String getDsTsIniSes();

    String getDsUnitaDoc();

    String getFlForzaUpd();

    String getFlSesUpdKoRisolti();

    BigDecimal getIdAmbiente();

    BigDecimal getIdEnte();

    BigDecimal getIdRegistroUnitaDoc();

    BigDecimal getIdStrut();

    BigDecimal getIdTipoDocPrinc();

    BigDecimal getIdTipoUnitaDoc();

    BigDecimal getIdUnitaDoc();

    BigDecimal getIdUpdUnitaDoc();

    BigDecimal getIdUserIamCor();

    String getNmAmbiente();

    String getNmEnte();

    String getNmStrut();

    String getNmTipoDocPrinc();

    String getNmTipoUnitaDoc();

    String getNtUpd();

    BigDecimal getPgUpdUnitaDoc();

    String getTiStatoUpdElencoVers();

    Date getTsIniSes();

    void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc);

    void setCdKeyUnitaDoc(String cdKeyUnitaDoc);

    void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc);

    void setDsEnteStrut(String dsEnteStrut);

    void setDsTsIniSes(String dsTsIniSes);

    void setDsUnitaDoc(String dsUnitaDoc);

    void setFlForzaUpd(String flForzaUpd);

    void setFlSesUpdKoRisolti(String flSesUpdKoRisolti);

    void setIdAmbiente(BigDecimal idAmbiente);

    void setIdEnte(BigDecimal idEnte);

    void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc);

    void setIdStrut(BigDecimal idStrut);

    void setIdTipoDocPrinc(BigDecimal idTipoDocPrinc);

    void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc);

    void setIdUnitaDoc(BigDecimal idUnitaDoc);

    void setIdUpdUnitaDoc(BigDecimal idUpdUnitaDoc);

    void setIdUserIamCor(BigDecimal idUserIamCor);

    void setNmAmbiente(String nmAmbiente);

    void setNmEnte(String nmEnte);

    void setNmStrut(String nmStrut);

    void setNmTipoDocPrinc(String nmTipoDocPrinc);

    void setNmTipoUnitaDoc(String nmTipoUnitaDoc);

    void setNtUpd(String ntUpd);

    void setPgUpdUnitaDoc(BigDecimal pgUpdUnitaDoc);

    void setTiStatoUpdElencoVers(String tiStatoUpdElencoVers);

    void setTsIniSes(Date tsIniSes);

}
