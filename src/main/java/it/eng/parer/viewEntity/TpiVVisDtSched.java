package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the TPI_V_VIS_DT_SCHED database table.
 * 
 */
@Entity
@Table(name = "TPI_V_VIS_DT_SCHED")
public class TpiVVisDtSched implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date dtSched;
    private String flAnomArkMigrazPrim;
    private String flAnomArkMigrazSecond;
    private String flAnomArkVersPrim;
    private String flAnomArkVersSecond;
    private String flAnomBackupMigrazPrim;
    private String flAnomBackupMigrazSecond;
    private String flAnomBackupVersPrim;
    private String flAnomBackupVersSecond;
    private String flAnomCopiaMigrazPrim;
    private String flAnomCopiaMigrazSecond;
    private String flAnomCopiaVersPrim;
    private String flAnomCopiaVersSecond;
    private String flAnomMigrateMigrazPrim;
    private String flAnomMigrateMigrazSecond;
    private String flAnomMigrateVersPrim;
    private String flAnomMigrateVersSecond;
    private String flAnomRiArkMigrazPrim;
    private String flAnomRiArkMigrazSecond;
    private String flAnomRiArkVersPrim;
    private String flAnomRiArkVersSecond;
    private String flMigrazInCorso;
    private String flPresenzaSecondario;
    private BigDecimal idDtSched;
    private String tiStatoDtSched;

    public TpiVVisDtSched() {
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SCHED")
    public Date getDtSched() {
        return this.dtSched;
    }

    public void setDtSched(Date dtSched) {
        this.dtSched = dtSched;
    }

    @Column(name = "FL_ANOM_ARK_MIGRAZ_PRIM")
    public String getFlAnomArkMigrazPrim() {
        return this.flAnomArkMigrazPrim;
    }

    public void setFlAnomArkMigrazPrim(String flAnomArkMigrazPrim) {
        this.flAnomArkMigrazPrim = flAnomArkMigrazPrim;
    }

    @Column(name = "FL_ANOM_ARK_MIGRAZ_SECOND")
    public String getFlAnomArkMigrazSecond() {
        return this.flAnomArkMigrazSecond;
    }

    public void setFlAnomArkMigrazSecond(String flAnomArkMigrazSecond) {
        this.flAnomArkMigrazSecond = flAnomArkMigrazSecond;
    }

    @Column(name = "FL_ANOM_ARK_VERS_PRIM")
    public String getFlAnomArkVersPrim() {
        return this.flAnomArkVersPrim;
    }

    public void setFlAnomArkVersPrim(String flAnomArkVersPrim) {
        this.flAnomArkVersPrim = flAnomArkVersPrim;
    }

    @Column(name = "FL_ANOM_ARK_VERS_SECOND")
    public String getFlAnomArkVersSecond() {
        return this.flAnomArkVersSecond;
    }

    public void setFlAnomArkVersSecond(String flAnomArkVersSecond) {
        this.flAnomArkVersSecond = flAnomArkVersSecond;
    }

    @Column(name = "FL_ANOM_BACKUP_MIGRAZ_PRIM")
    public String getFlAnomBackupMigrazPrim() {
        return this.flAnomBackupMigrazPrim;
    }

    public void setFlAnomBackupMigrazPrim(String flAnomBackupMigrazPrim) {
        this.flAnomBackupMigrazPrim = flAnomBackupMigrazPrim;
    }

    @Column(name = "FL_ANOM_BACKUP_MIGRAZ_SECOND")
    public String getFlAnomBackupMigrazSecond() {
        return this.flAnomBackupMigrazSecond;
    }

    public void setFlAnomBackupMigrazSecond(String flAnomBackupMigrazSecond) {
        this.flAnomBackupMigrazSecond = flAnomBackupMigrazSecond;
    }

    @Column(name = "FL_ANOM_BACKUP_VERS_PRIM")
    public String getFlAnomBackupVersPrim() {
        return this.flAnomBackupVersPrim;
    }

    public void setFlAnomBackupVersPrim(String flAnomBackupVersPrim) {
        this.flAnomBackupVersPrim = flAnomBackupVersPrim;
    }

    @Column(name = "FL_ANOM_BACKUP_VERS_SECOND")
    public String getFlAnomBackupVersSecond() {
        return this.flAnomBackupVersSecond;
    }

    public void setFlAnomBackupVersSecond(String flAnomBackupVersSecond) {
        this.flAnomBackupVersSecond = flAnomBackupVersSecond;
    }

    @Column(name = "FL_ANOM_COPIA_MIGRAZ_PRIM")
    public String getFlAnomCopiaMigrazPrim() {
        return this.flAnomCopiaMigrazPrim;
    }

    public void setFlAnomCopiaMigrazPrim(String flAnomCopiaMigrazPrim) {
        this.flAnomCopiaMigrazPrim = flAnomCopiaMigrazPrim;
    }

    @Column(name = "FL_ANOM_COPIA_MIGRAZ_SECOND")
    public String getFlAnomCopiaMigrazSecond() {
        return this.flAnomCopiaMigrazSecond;
    }

    public void setFlAnomCopiaMigrazSecond(String flAnomCopiaMigrazSecond) {
        this.flAnomCopiaMigrazSecond = flAnomCopiaMigrazSecond;
    }

    @Column(name = "FL_ANOM_COPIA_VERS_PRIM")
    public String getFlAnomCopiaVersPrim() {
        return this.flAnomCopiaVersPrim;
    }

    public void setFlAnomCopiaVersPrim(String flAnomCopiaVersPrim) {
        this.flAnomCopiaVersPrim = flAnomCopiaVersPrim;
    }

    @Column(name = "FL_ANOM_COPIA_VERS_SECOND")
    public String getFlAnomCopiaVersSecond() {
        return this.flAnomCopiaVersSecond;
    }

    public void setFlAnomCopiaVersSecond(String flAnomCopiaVersSecond) {
        this.flAnomCopiaVersSecond = flAnomCopiaVersSecond;
    }

    @Column(name = "FL_ANOM_MIGRATE_MIGRAZ_PRIM")
    public String getFlAnomMigrateMigrazPrim() {
        return this.flAnomMigrateMigrazPrim;
    }

    public void setFlAnomMigrateMigrazPrim(String flAnomMigrateMigrazPrim) {
        this.flAnomMigrateMigrazPrim = flAnomMigrateMigrazPrim;
    }

    @Column(name = "FL_ANOM_MIGRATE_MIGRAZ_SECOND")
    public String getFlAnomMigrateMigrazSecond() {
        return this.flAnomMigrateMigrazSecond;
    }

    public void setFlAnomMigrateMigrazSecond(String flAnomMigrateMigrazSecond) {
        this.flAnomMigrateMigrazSecond = flAnomMigrateMigrazSecond;
    }

    @Column(name = "FL_ANOM_MIGRATE_VERS_PRIM")
    public String getFlAnomMigrateVersPrim() {
        return this.flAnomMigrateVersPrim;
    }

    public void setFlAnomMigrateVersPrim(String flAnomMigrateVersPrim) {
        this.flAnomMigrateVersPrim = flAnomMigrateVersPrim;
    }

    @Column(name = "FL_ANOM_MIGRATE_VERS_SECOND")
    public String getFlAnomMigrateVersSecond() {
        return this.flAnomMigrateVersSecond;
    }

    public void setFlAnomMigrateVersSecond(String flAnomMigrateVersSecond) {
        this.flAnomMigrateVersSecond = flAnomMigrateVersSecond;
    }

    @Column(name = "FL_ANOM_RI_ARK_MIGRAZ_PRIM")
    public String getFlAnomRiArkMigrazPrim() {
        return this.flAnomRiArkMigrazPrim;
    }

    public void setFlAnomRiArkMigrazPrim(String flAnomRiArkMigrazPrim) {
        this.flAnomRiArkMigrazPrim = flAnomRiArkMigrazPrim;
    }

    @Column(name = "FL_ANOM_RI_ARK_MIGRAZ_SECOND")
    public String getFlAnomRiArkMigrazSecond() {
        return this.flAnomRiArkMigrazSecond;
    }

    public void setFlAnomRiArkMigrazSecond(String flAnomRiArkMigrazSecond) {
        this.flAnomRiArkMigrazSecond = flAnomRiArkMigrazSecond;
    }

    @Column(name = "FL_ANOM_RI_ARK_VERS_PRIM")
    public String getFlAnomRiArkVersPrim() {
        return this.flAnomRiArkVersPrim;
    }

    public void setFlAnomRiArkVersPrim(String flAnomRiArkVersPrim) {
        this.flAnomRiArkVersPrim = flAnomRiArkVersPrim;
    }

    @Column(name = "FL_ANOM_RI_ARK_VERS_SECOND")
    public String getFlAnomRiArkVersSecond() {
        return this.flAnomRiArkVersSecond;
    }

    public void setFlAnomRiArkVersSecond(String flAnomRiArkVersSecond) {
        this.flAnomRiArkVersSecond = flAnomRiArkVersSecond;
    }

    @Column(name = "FL_MIGRAZ_IN_CORSO")
    public String getFlMigrazInCorso() {
        return this.flMigrazInCorso;
    }

    public void setFlMigrazInCorso(String flMigrazInCorso) {
        this.flMigrazInCorso = flMigrazInCorso;
    }

    @Column(name = "FL_PRESENZA_SECONDARIO")
    public String getFlPresenzaSecondario() {
        return this.flPresenzaSecondario;
    }

    public void setFlPresenzaSecondario(String flPresenzaSecondario) {
        this.flPresenzaSecondario = flPresenzaSecondario;
    }

    @Id
    @Column(name = "ID_DT_SCHED")
    public BigDecimal getIdDtSched() {
        return this.idDtSched;
    }

    public void setIdDtSched(BigDecimal idDtSched) {
        this.idDtSched = idDtSched;
    }

    @Column(name = "TI_STATO_DT_SCHED")
    public String getTiStatoDtSched() {
        return this.tiStatoDtSched;
    }

    public void setTiStatoDtSched(String tiStatoDtSched) {
        this.tiStatoDtSched = tiStatoDtSched;
    }

}