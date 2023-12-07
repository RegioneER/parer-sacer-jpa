package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the IAM_AUTOR_SERV database table.
 */
@Entity
@Table(name = "IAM_AUTOR_SERV")
public class IamAutorServ implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAutorServ;

    private String nmServizioWeb;

    private IamAbilOrganiz iamAbilOrganiz;

    public IamAutorServ() {/* Hibernate */
    }

    @Id
    // "IAM_AUTOR_SERV_IDAUTORSERV_GENERATOR",
    // sequenceName = "SIAM_AUTOR_SERV", allocationSize
    // = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_AUTOR_SERV_IDAUTORSERV_GENERATOR")
    @Column(name = "ID_AUTOR_SERV")
    @GenericGenerator(name = "SIAM_AUTOR_SERV_ID_AUTOR_SERV_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SIAM_AUTOR_SERV"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIAM_AUTOR_SERV_ID_AUTOR_SERV_GENERATOR")
    public Long getIdAutorServ() {
        return this.idAutorServ;
    }

    public void setIdAutorServ(Long idAutorServ) {
        this.idAutorServ = idAutorServ;
    }

    @Column(name = "NM_SERVIZIO_WEB")
    public String getNmServizioWeb() {
        return this.nmServizioWeb;
    }

    public void setNmServizioWeb(String nmServizioWeb) {
        this.nmServizioWeb = nmServizioWeb;
    }

    // bi-directional many-to-one association to IamAbilOrganiz
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ABIL_ORGANIZ")
    public IamAbilOrganiz getIamAbilOrganiz() {
        return this.iamAbilOrganiz;
    }

    public void setIamAbilOrganiz(IamAbilOrganiz iamAbilOrganiz) {
        this.iamAbilOrganiz = iamAbilOrganiz;
    }

}
