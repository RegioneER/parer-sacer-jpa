package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IAM_AUTOR_SERV database table.
 * 
 */
@Entity
@Table(name = "IAM_AUTOR_SERV")
public class IamAutorServ implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idAutorServ;
    private String nmServizioWeb;
    private IamAbilOrganiz iamAbilOrganiz;

    public IamAutorServ() {
    }

    @Id
    @SequenceGenerator(name = "IAM_AUTOR_SERV_IDAUTORSERV_GENERATOR", sequenceName = "SIAM_AUTOR_SERV", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_AUTOR_SERV_IDAUTORSERV_GENERATOR")
    @Column(name = "ID_AUTOR_SERV")
    public long getIdAutorServ() {
        return this.idAutorServ;
    }

    public void setIdAutorServ(long idAutorServ) {
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