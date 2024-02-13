package ijse;

import ijse.config.FactoryConfiguration;
import ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("select * from Student");
        nativeQuery.addEntity(Student.class);
        List<Student> students = nativeQuery.list();
        for (Student student : students) {
            System.out.println(student.getName());
        }
        transaction.commit();
        session.close();
    }
}
