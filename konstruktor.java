public class User {
	private String username;
	private String password;
	
	public User() {
		System.out.println("eksekusi method constuktor...");
	}
}

class DemoConstruktor{
	public static void main(String[] args) {
	User asep = new User();
	}
}