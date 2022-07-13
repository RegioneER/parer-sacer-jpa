/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author gilioli_p
 */
public interface MonVLisUpdUdKoInterface extends Serializable {

    @Column(name = "AA_KEY_UNITA_DOC")
    BigDecimal getAaKeyUnitaDoc();

    @Column(name = "CD_CONTROLLO_WS_PRINC")
    String getCdControlloWsPrinc();

    @Column(name = "CD_ERR_PRINC")
    String getCdErrPrinc();

    @Column(name = "CD_KEY_UNITA_DOC")
    String getCdKeyUnitaDoc();

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    String getCdRegistroKeyUnitaDoc();

    @Column(name = "DS_ENTE_STRUT")
    String getDsEnteStrut();

    @Column(name = "DS_ERR_PRINC")
    String getDsErrPrinc();

    @Column(name = "DS_TS_INI_SES")
    String getDsTsIniSes();

    @Column(name = "DS_UNITA_DOC")
    String getDsUnitaDoc();

    @Column(name = "ID_AMBIENTE")
    BigDecimal getIdAmbiente();

    @Column(name = "ID_CONTROLLO_WS_PRINC")
    BigDecimal getIdControlloWsPrinc();

    @Column(name = "ID_ENTE")
    BigDecimal getIdEnte();

    @Column(name = "ID_ERR_SACER_PRINC")
    BigDecimal getIdErrSacerPrinc();

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    BigDecimal getIdRegistroUnitaDoc();

    @Id
    @Column(name = "ID_SES_UPD_UNITA_DOC_KO")
    BigDecimal getIdSesUpdUnitaDocKo();

    @Column(name = "ID_STRUT")
    BigDecimal getIdStrut();

    @Column(name = "ID_TIPO_DOC_PRINC")
    BigDecimal getIdTipoDocPrinc();

    @Column(name = "ID_TIPO_UNITA_DOC")
    BigDecimal getIdTipoUnitaDoc();

    @Column(name = "ID_UPD_UNITA_DOC_KO")
    BigDecimal getIdUpdUnitaDocKo();

    @Column(name = "ID_USER_IAM_COR")
    BigDecimal getIdUserIamCor();

    @Column(name = "NM_AMBIENTE")
    String getNmAmbiente();

    @Column(name = "NM_ENTE")
    String getNmEnte();

    @Column(name = "NM_STRUT")
    String getNmStrut();

    @Column(name = "NM_TIPO_DOC_PRINC")
    String getNmTipoDocPrinc();

    @Column(name = "NM_TIPO_UNITA_DOC")
    String getNmTipoUnitaDoc();

    @Column(name = "TI_STATO_SES_UPD_KO")
    String getTiStatoSesUpdKo();

    @Column(name = "TS_INI_SES")
    Timestamp getTsIniSes();

    void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc);

    void setCdControlloWsPrinc(String cdControlloWsPrinc);

    void setCdErrPrinc(String cdErrPrinc);

    void setCdKeyUnitaDoc(String cdKeyUnitaDoc);

    void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc);

    void setDsEnteStrut(String dsEnteStrut);

    void setDsErrPrinc(String dsErrPrinc);

    void setDsTsIniSes(String dsTsIniSes);

    void setDsUnitaDoc(String dsUnitaDoc);

    void setIdAmbiente(BigDecimal idAmbiente);

    void setIdControlloWsPrinc(BigDecimal idControlloWsPrinc);

    void setIdEnte(BigDecimal idEnte);

    void setIdErrSacerPrinc(BigDecimal idErrSacerPrinc);

    void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc);

    void setIdSesUpdUnitaDocKo(BigDecimal idSesUpdUnitaDocKo);

    void setIdStrut(BigDecimal idStrut);

    void setIdTipoDocPrinc(BigDecimal idTipoDocPrinc);

    void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc);

    void setIdUpdUnitaDocKo(BigDecimal idUpdUnitaDocKo);

    void setIdUserIamCor(BigDecimal idUserIamCor);

    void setNmAmbiente(String nmAmbiente);

    void setNmEnte(String nmEnte);

    void setNmStrut(String nmStrut);

    void setNmTipoDocPrinc(String nmTipoDocPrinc);

    void setNmTipoUnitaDoc(String nmTipoUnitaDoc);

    void setTiStatoSesUpdKo(String tiStatoSesUpdKo);

    void setTsIniSes(Timestamp tsIniSes);

}
