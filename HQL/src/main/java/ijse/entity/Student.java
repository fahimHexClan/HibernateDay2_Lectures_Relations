package ijse.entity;

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
    private List <Laptop> laptops;

    public Student() {
    }

    public Student(int id, String name, String address, List<Laptop> laptops) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.laptops = laptops;
    }

    public int getId() {
        return id;
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
        return laptops;
    }

    public void setLaptop(List <Laptop> laptops) {
        this.laptops = laptops;
    }
}
