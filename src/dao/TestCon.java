package dao;

public class TestCon {

	public static void main(String[] args) {
		
		User cn = new User();
		try {
			cn.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
