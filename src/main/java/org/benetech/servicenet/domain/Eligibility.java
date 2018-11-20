package org.benetech.servicenet.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Eligibility.
 */
@Entity
@Table(name = "eligibility")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Eligibility implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "eligibility", nullable = false)
    private String eligibility;

    @OneToOne
    @JoinColumn(unique = true)
    private Service srvc;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public Eligibility eligibility(String eligibility) {
        this.eligibility = eligibility;
        return this;
    }

    public Service getSrvc() {
        return srvc;
    }

    public void setSrvc(Service service) {
        this.srvc = service;
    }

    public Eligibility srvc(Service service) {
        this.srvc = service;
        return this;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Eligibility eligibilityObj = (Eligibility) o;
        if (eligibilityObj.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), eligibilityObj.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Eligibility{" +
            "id=" + getId() +
            ", eligibility='" + getEligibility() + "'" +
            "}";
    }
}
