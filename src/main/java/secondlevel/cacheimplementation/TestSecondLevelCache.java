package secondlevel.cacheimplementation;

import org.hibernate.Session;
import org.hibernate.Transaction;

import firstlevel.cacheimplementation.HibernateUtil;
import firstlevel.cacheimplementation.Student;

public class TestSecondLevelCache {
	public static void main(String[] args) {
		
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Student1 std1=session.get(Student1.class, 20);
	System.out.println(std1);
//	Student1 st=new Student1();
//	st.setId(20);
//	st.setName("Ram");
//	st.setCity("Nagpur");
	
	session.close();
	
	System.out.println("After Creating Next session.....");
	Session session1=HibernateUtil.getSessionFactory().openSession();
	
	Student1 std2=session1.get(Student1.class,20);
	System.out.println(std2);
	session1.close();
	HibernateUtil.close();
	
}
}