package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.User;

public class InsertAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firstname;
	private String surname;
	private String username;
	private String email;
	private String passwd;
	private String msg = "";
	
	User user = null;
	int ctr = 0;
	
	@Override
	public String execute() throws Exception {
		user = new User();

		try {
			ctr = user.registerUser(firstname, surname, username, email, passwd);
			if (ctr > 0) {
				msg = "Registration Successfull";
			} else {
				msg = "Can`t Save User Info...";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REGISTER";
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

}
