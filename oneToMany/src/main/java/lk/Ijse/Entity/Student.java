package lk.Ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "student")
    private List<Laptop> laptop;

    public int getId() {
        return id;
    }

    public Student(int id, String name, String address, List<Laptop> laptop) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.laptop = laptop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }


    public Student() {
    }
}
