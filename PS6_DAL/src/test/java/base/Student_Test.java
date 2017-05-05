package base;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {		
		DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(
		        FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
		@SuppressWarnings("deprecation")
		Date dob = new Date(1997, 05, 17);
		PersonDomainModel person = new PersonDomainModel();
		person.setFirstName("Becky");
		person.setLastName("Gee");
		person.setStreet("111 Delaware Ave.");
		person.setPostalCode(12345);
		person.setCity("Newark");
		person.setBirthday(dob);
		// add
		PersonDAL.addPerson(person);
		// update
		PersonDomainModel p1 = person;
		/*p1.set
		PersonDAL.updatePerson(p1);*/
		// get
		// delete
		assertTrue(1==1);
	}
	
	@Test
	public void addTest()
	{
	}
	
	@Test
	public void updateTest()
	{
		
	}
	
	@Test
	public void getTest()
	{
		
	}
	
	@Test
	public void deleteTest()
	{
		
	}

}
