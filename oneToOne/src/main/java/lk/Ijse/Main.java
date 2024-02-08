package lk.Ijse;

import lk.Ijse.Config.FactoryConfiguration;
import lk.Ijse.entity.Laptop;
import lk.Ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Laptop laptop =new Laptop();
        laptop.setId(2);
        laptop.setModel("acer");

        Student student =new Student();
        student.setId(1);
        student.setAddress("Badulla");
        student.setName("Kamal");
        student.setLaptop(laptop);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        session.save(laptop);
        session.save(student);
        transaction.commit();
        session.close();

    }
}