package pr.test.Javalin.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import pr.pojos.Dog;
import pr.pojos.Owner;
import prDao.OwnerDaoPostgres;
import prJavalin.util.ConnectionUtil;
import prJavalin.util.PRConnectionUtil;

@RunWith(MockitoJUnitRunner.class)
public class DogDaoPostgresTest {

	public DogDaoPostgres dogDao = new DogDaoPostgres();
	
	@Mock
	private PRConnectionUtil connUtil;
	
	@Mock
	private Connection connection;
	
	private Statement stmt;
	
	private Statement spy;
	
	private Connection realConnection;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		realConnection = new PRConnectionUtil().createConnection();
		
		//creating a real stmt from a connection
		stmt = realConnection.createStatement(); 
		
		//spying on that real stmt
		spy = Mockito.spy(stmt);
		
		//mock our connection and util, so we will only use the stmt we are spying on
		when(connection.createStatement()).thenReturn(spy);
		when(connUtil.createConnection()).thenReturn(connection);
		
		//set up Dao to use the mocked object
		dogDao.setConnUtil(connUtil);
		
	}

	@After
	public void tearDown() throws Exception {
		
		stmt.executeUpdate("delete from dog where dogId = '1'");
		
		realConnection.close();
		
	}

	@Test
	public void createOwnerTest() throws SQLException {

		
		Owner owner = new Owner("rayolin", 20, 2234, 2);
		
		Dog dog = new Dog(1, "Huck", owner, 2, true);
				
		DogDao.createDog(Dog);
				
		
		String sql = "insert into dog (dogId, name, ownerName, isAvailable)"
				+ " values(1, 'Huck', 'rayolin', true)";
		
		verify(spy).executeUpdate(sql);
		
		ResultSet rs = stmt.executeQuery("select * from Dog where dogId = 1");
		
		assertTrue(rs.next());
		
	}

}
