package hbutil;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
//import org.hibernate.service.ServiceRegistry;




public class HibernateUtil {
        
        private static final SessionFactory sessionFactory;
       // private static ServiceRegistry serviceRegistry;
        static {
        	try {                  
        		    Configuration configuration = new Configuration().configure("Hibernate.cfg.xml");
        			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        			applySettings(configuration.getProperties());
        			sessionFactory = configuration.buildSessionFactory(builder.build());
        		
        	} catch ( Throwable ex) {
        		//  Make sur you log the exception, as it might be swallowed
        		System.err.println("Initial SessionFactory creation failed." + ex);
        		throw new ExceptionInInitializerError(ex);
        	}
        }
        
        //  public static final ThreadLocal session = new ThreadLocal();
        public static SessionFactory getSessionFactory() {
        	
        	return sessionFactory;
        }
}