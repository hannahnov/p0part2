package prService;

import java.util.List;

import HotelReservationJavalin.Dao.GuestDao;
import HotelReservationJavalin.Dao.GuestDaoPostgres;
import HotelReservationJavalin.pojos.Guest;
import HotelReservationJavalin.pojos.Room.RoomType;
import pr.pojos.Owner;
import prDao.OwnerDao;
import prDao.OwnerDaoPostgres;

public class OwnerServiceFullStack extends OwnerService {
	
	OwnerDao ownerDao = new OwnerDaoPostgres();

	public Owner createOwner(Owner owner) {
		ownerDao.createOwner(owner);
		return owner;
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

