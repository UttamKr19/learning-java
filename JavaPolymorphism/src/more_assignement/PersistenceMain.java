package more_assignement;

public class PersistenceMain {
	public static void main(String[] args) {
		Persistence persistence;
		persistence=new FilePersistence();
		persistence.persist();
		persistence=new DatabasePersistence();
		persistence.persist();
	}
}
