package prDao;

import pr.pojos.Owner;

public interface OwnerDao {
	
	public void createOwner(Owner owner);
	
	public Owner readOwner(String ownerUserName);
	
	public Owner readAllOwners();
	
	public Owner updateOwner(String ownerId, Owner owner);
	
	public void deleteOwner(Owner owner);

}
