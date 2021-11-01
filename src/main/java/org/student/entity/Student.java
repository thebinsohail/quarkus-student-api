package org.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "students")
public class Student extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEV")
    @SequenceGenerator(name = "SEQ_DEV", sequenceName = "SEQ_DEV", allocationSize = 1)

    @Column(name = "id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "roll_number")
    private int rollNumber;
    @Column(name = "technology")
    private String technology;
    @Column(name = "batch")
    private int batch;

    public Student() {
    }

    public Student(Long id, String fullName, int rollNumber, String technology, int batch) {
        this.id = id;
        this.fullName = fullName;
        this.rollNumber = rollNumber;
        this.technology = technology;
        this.batch = batch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

}
