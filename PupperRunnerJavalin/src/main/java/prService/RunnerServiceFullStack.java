package prService;

import java.util.List;

import HotelReservationJavalin.Dao.GuestDao;
import HotelReservationJavalin.Dao.GuestDaoPostgres;
import HotelReservationJavalin.pojos.Guest;
import HotelReservationJavalin.pojos.Room.RoomType;
import pr.pojos.Runner;
import prDao.RunnerDao;
import prDao.RunnerDaoPostgres;

public class RunnerServiceFullStack extends RunnerService {
	
	RunnerDao runnerDao = new RunnerDaoPostgres();

	
	public Runner createRunner(Runner runner) {
		runnerDao.createRunner(runner);
		return runner;
	}

	@Override
	public void checkInGuest(Guest guest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkOutGuest(Guest guest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Guest> getAllGuests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guest> getAllGuestsByRoomType(RoomType roomType) {
		// TODO Auto-generated method stub
		return null;
	}

}

