package app.covid.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {

    private SessionFactory sessionFactory;
    
    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
               
            	sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
    
    
	
}
