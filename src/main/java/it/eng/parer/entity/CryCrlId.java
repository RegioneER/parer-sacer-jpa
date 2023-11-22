package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class CryCrlId implements Serializable {

    public CryCrlId() {/* Hibernate */
    }

    public CryCrlId(String subjectdn, String keyId) {
        this.subjectdn = subjectdn;
        this.keyId = keyId;
    }

    private String subjectdn;

    public String getSubjectdn() {
        return subjectdn;
    }

    public void setSubjectdn(String subjectdn) {
        this.subjectdn = subjectdn;
    }

    private String keyId;

    @Column(name = "SUBJECT_KEY_ID")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.subjectdn);
        hash = 79 * hash + Objects.hashCode(this.keyId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CryCrlId other = (CryCrlId) obj;
        if (!Objects.equals(this.subjectdn, other.subjectdn)) {
            return false;
        }
        if (!Objects.equals(this.keyId, other.keyId)) {
            return false;
        }
        return true;
    }
}
