package prDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import pr.pojos.Owner;
import prJavalin.util.ConnectionUtil;

public class OwnerDaoPostgres implements OwnerDao {

	private Statement statement;
	
	private ConnectionUtil connUtil = new ConnectionUtil();
	
	public void setConnUtil(ConnectionUtil connUtil) {
		this.connUtil = connUtil;
	}

	@Override
	public void createOwner(Owner owner) {
		
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
	public Owner readOwner(String ownerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner readAllOwners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner updateOwner(String ownerId, Owner owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOwner(Owner owner) {
		// TODO Auto-generated method stub

	}

}

