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
        Laptop laptop2 = new Laptop();
        Student student = new Student();
        List<Laptop> laptops = new ArrayList<>();

        laptops.add(laptop1);
        laptops.add(laptop2);

        laptop1.setId(1);
        laptop1.setModel("dell");
        laptop1.setStudent(student);

        laptop2.setId(2);
        laptop2.setModel("hp");
        laptop2.setStudent(student);

        student.setId(1);
        student.setName("pathum");
        student.setAddress("kandy");
        student.setLaptop(laptops);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        //develop
        session.save(student);
        session.save(laptop1);
        session.save(laptop2);


        transaction.commit();
        session.close();

    }}