
package tn.esprit.spring.service;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

		@Autowired
		IUserService us; 

@Test
//	public void testAddUSer() throws ParseException {
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = dateFormat.parse("2015-03-23");
//		User u = new User(0, "Achraf", "Chourabi", date, Role.ingenieur);
//		assertTrue(u.getRole().equals(Role.ingenieur));
//		us.addUser(u);
//	}
@Test
	public void testRetrieveUser() {
		User user = us.retrieveUser("7");
		assertNotNull(user.getDateNaissance());
		log.info("retrieveUser : " + user);
	}
@Test
	public void testDeleteUser() {
		if(us.retrieveUser("7")!=null)
		us.deleteUser("7");
		
	}
@Test
	public void testRetrieveAllUser() {
		List<User> users = us.retrieveAllUsers();
		log.info("retrieve all users" + users);
		
	}
@Test
	public void testUpdateUSer() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2015-03-23");
		User u = new User(10, "Mayssa122222222", "ChourabiMODIFIE", date, Role.ingenieur);
		assertTrue(u.getRole().equals(Role.ingenieur));
		us.updateUser(u);
	}


	
	
}


/*
		@Test
		public void testRetrieveAllUsers() {
			List<User> listUsers = us.retrieveAllUsers(); 
			// if there are 7 users in DB : 
			Assert.assertEquals(10, listUsers.size());
		}
		
		
		@Test
		public void testAddUser() throws ParseException {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date d = dateFormat.parse("2015-03-23");
			User u = new User("Maroua", "Maroua", d, Role.INGENIEUR); 
			User userAdded = us.addUser(u); 
			Assert.assertEquals(u.getLastName(), userAdded.getLastName());
		}
	 
		@Test
		public void testModifyUser() throws ParseException   {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date d = dateFormat.parse("2015-03-23");
			User u = new User(13L, "Maroua", "Maroua11", d, Role.INGENIEUR); 
			User userUpdated  = us.updateUser(u); 
			Assert.assertEquals(u.getLastName(), userUpdated.getLastName());
		}
	
		@Test
		public void testRetrieveUser() {
			User userRetrieved = us.retrieveUser("12"); 
			Assert.assertEquals(10L, userRetrieved.getId().longValue());
		}
		
		@Test
		public void testDeleteUser() {
			us.deleteUser("14");
			Assert.assertNull(us.retrieveUser("14"));
		}
		
		// 5 tests unitaires  
 */
