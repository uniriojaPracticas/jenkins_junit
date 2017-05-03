import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import object.User;

public class UserTester {
	
	private User user;
	
	public UserTester() {
		user = new User("Julio", 25, new GregorianCalendar(1993, Calendar.SEPTEMBER, 7).getTime());
	}

	@Test
	public void testGetName() {
		assertSame("Jul", user.getName());
	}

	@Test
	public void testSetName() {
		user.setName("Ana");
		assertSame("Ana", user.getName());
	}

	@Test
	public void testGetAge() {
		assertSame(25, user.getAge());
	}

	@Test
	public void testSetAge() {
		user.setAge(20);
		assertSame(20, user.getAge());
	}

	@Test
	public void testGetBirth() {
		Date birth = new GregorianCalendar(1993, Calendar.SEPTEMBER, 7).getTime();
		assertEquals(birth, user.getBirth());
	}

	@Test
	public void testSetBirth() {
		Date birth = new GregorianCalendar(1993, Calendar.APRIL, 22).getTime();
		user.setBirth(birth);
		assertEquals(birth, user.getBirth());
	}

}
