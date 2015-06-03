/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "tbl_courses", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblCourses.findAll", query = "SELECT t FROM TblCourses t"),
    @NamedQuery(name = "TblCourses.findById", query = "SELECT t FROM TblCourses t WHERE t.id = :id"),
    @NamedQuery(name = "TblCourses.findByCode", query = "SELECT t FROM TblCourses t WHERE t.code = :code"),
    @NamedQuery(name = "TblCourses.findByName", query = "SELECT t FROM TblCourses t WHERE t.name = :name"),
    @NamedQuery(name = "TblCourses.findByDescription", query = "SELECT t FROM TblCourses t WHERE t.description = :description"),
    @NamedQuery(name = "TblCourses.findByType", query = "SELECT t FROM TblCourses t WHERE t.type = :type"),
    @NamedQuery(name = "TblCourses.findByNbCredits", query = "SELECT t FROM TblCourses t WHERE t.nbCredits = :nbCredits"),
    @NamedQuery(name = "TblCourses.findByLab", query = "SELECT t FROM TblCourses t WHERE t.lab = :lab")})
public class TblCourses implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @Column(name = "nb_Credits")
    private int nbCredits;
    @Column(name = "Lab")
    private String lab;

    public TblCourses() {
    }

    public TblCourses(Integer id) {
        this.id = id;
    }

    public TblCourses(Integer id, String code, String name, String type, int nbCredits) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.nbCredits = nbCredits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        String oldCode = this.code;
        this.code = code;
        changeSupport.firePropertyChange("code", oldCode, code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public int getNbCredits() {
        return nbCredits;
    }

    public void setNbCredits(int nbCredits) {
        int oldNbCredits = this.nbCredits;
        this.nbCredits = nbCredits;
        changeSupport.firePropertyChange("nbCredits", oldNbCredits, nbCredits);
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        String oldLab = this.lab;
        this.lab = lab;
        changeSupport.firePropertyChange("lab", oldLab, lab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCourses)) {
            return false;
        }
        TblCourses other = (TblCourses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "courses.TblCourses[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
