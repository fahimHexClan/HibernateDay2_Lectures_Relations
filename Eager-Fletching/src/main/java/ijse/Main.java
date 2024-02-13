package ijse;

import ijse.config.FactoryConfiguration;
import ijse.entity.Laptop;
import ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student1 = session.get(Student.class,1);
        List<Laptop> laptops1 = student1.getLaptop();
        for (Laptop laptop : laptops1) {
            System.out.println(laptop.getModel());
        }
        transaction.commit();
        session.close();
    }
}
