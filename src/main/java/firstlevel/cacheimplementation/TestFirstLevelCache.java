package firstlevel.cacheimplementation;

import org.hibernate.Session;

public class TestFirstLevelCache {
public static void main(String[] args) {
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	Student std1=session.get(Student.class, 10);
	System.out.println(std1);
	System.out.println("Working Something>>>>");
	Student std2=session.get(Student.class, 10);
	System.out.println(std2);
	
	session.close();
	Session session1=HibernateUtil.getSessionFactory().openSession();
	Student s3=session1.get(Student.class, 10);
	System.out.println(s3);
	session1.close();
	
	HibernateUtil.close();
	
}
}
