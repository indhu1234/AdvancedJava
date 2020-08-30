import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BeanHelper {
  private static SessionFactory sessionFactory;
  private static Session session;
  public static void main(String args[])
  {
      sessionFactory=HibernateUtil.getSessionFactory();
      session=sessionFactory.openSession();
      System.out.println("Session open: "+session.isOpen());
  }
}
