package it.eng.parer.grantedEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the USR_STATO_USER database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.USR_STATO_USER")
@NamedQuery(name = "UsrStatoUser.findAll", query = "SELECT u FROM UsrStatoUser u")
public class UsrStatoUser implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idStatoUser;
    private String tiStatoUser;
    private Timestamp tsStato;
    private UsrUser usrUser;

    public UsrStatoUser() {
    }

    @Id
    @SequenceGenerator(name = "USR_STATO_USER_IDSTATOUSER_GENERATOR", sequenceName = "SUSR_STATO_USER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USR_STATO_USER_IDSTATOUSER_GENERATOR")
    @Column(name = "ID_STATO_USER")
    public long getIdStatoUser() {
        return this.idStatoUser;
    }

    public void setIdStatoUser(long idStatoUser) {
        this.idStatoUser = idStatoUser;
    }

    @Column(name = "TI_STATO_USER")
    public String getTiStatoUser() {
        return this.tiStatoUser;
    }

    public void setTiStatoUser(String tiStatoUser) {
        this.tiStatoUser = tiStatoUser;
    }

    @Column(name = "TS_STATO")
    public Timestamp getTsStato() {
        return this.tsStato;
    }

    public void setTsStato(Timestamp tsStato) {
        this.tsStato = tsStato;
    }

    // bi-directional many-to-one association to UsrUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public UsrUser getUsrUser() {
        return this.usrUser;
    }

    public void setUsrUser(UsrUser usrUser) {
        this.usrUser = usrUser;
    }

}
