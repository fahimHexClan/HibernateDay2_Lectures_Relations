package ijse;

import ijse.config.FactoryConfiguration;
import ijse.entity.Laptop;
import ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Laptop laptop1 = new Laptop();
        List<Laptop> laptops = new ArrayList<>();
        student.setId(1);
        student.setName("pathum");
        student.setAddress("kandy");
        laptop1.setLid(1);
        laptop1.setModel("dell");
        laptop1.setStudent(student);
        student.setLaptop(laptops);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        session.save(laptop1);

        Student student1 = session.get(Student.class, 1);
        if (student1 != null) {
            List<Laptop> laptops1 = student1.getLaptop();
            for (Laptop laptop : laptops1) {
                System.out.println(laptop.getModel());
            }
        } else {
            System.out.println("Student with ID  not found.");
        }

    }
}
