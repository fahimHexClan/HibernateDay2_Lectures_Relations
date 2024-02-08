package lk.Ijse;

import lk.Ijse.Entity.Laptop;
import lk.Ijse.Entity.Student;
import lk.Ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.setId(1);
        laptop1.setModel("dell");

        Laptop laptop2 = new Laptop();
        laptop1.setId(1);
        laptop1.setModel("dell");


        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);

        Student student = new Student();
        student.setId(1);
        student.setName("sana");
        student.setAddress("badula");
        student.setLaptop(laptops);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("kan");
        student2.setAddress("haliela");
        student2.setLaptop(laptops);

        List<Student>students=new ArrayList<>();

        students.add(student);
        students.add(student2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        transaction.commit();
        session.close();

        }
    }
