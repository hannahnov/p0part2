package prDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import pr.pojos.Runner;
import prJavalin.util.ConnectionUtil;
import prJavalin.util.PRConnectionUtil;

public class RunnerDaoPostgres implements RunnerDao {

	private Statement statement;
	
	private PRConnectionUtil connUtil = new PRConnectionUtil();
	
	public void setConnUtil(PRConnectionUtil connUtil) {
		this.connUtil = connUtil;
	}

	@Override
	public void createRunner(Runner runner) {
		
		String sql = "insert into guest (guest_first_name, guest_last_name, phone_number, payment) "
				+ "values('"
				+ guest.getName().split(" ")[0]
				+ "', '"
				+ guest.getName().split(" ")[1]
				+ "', '"
				+ guest.getPhoneNumber()
				+ "', "
				+ guest.getPayment()
				+ ")";
		
		try (Connection conn = connUtil.createConnection()) {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Runner readRunner(String runnerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Runner readAllRunners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Runner updateRunner(String runnerId, Runner runner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRunner(Runner runner) {
		// TODO Auto-generated method stub

	}

}

