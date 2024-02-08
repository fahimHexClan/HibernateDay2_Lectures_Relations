package lk.Ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private int Id;
    private String Model;
    @OneToOne
    private Student student;

    public Laptop() {
    }

    public Laptop(int id, String model, Student student) {
        Id = id;
        Model = model;
        this.student = student;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
