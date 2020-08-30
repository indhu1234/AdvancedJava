package indhu.com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutility 
{
private static final SessionFactory sessionFactory;
    
    static {
        try {
            
            Configuration configuration = new Configuration().configure("HibernateConfiguration.xml");
            sessionFactory=configuration.buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
