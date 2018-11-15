import java.io.Serializable;

public class UseVO implements Serializable{
	
	private static final long serialVersionUID = -8744169653811326042L;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	private transient  String password;
	
	
	public String toString(){
		return "User [name=" + name + ", username=" + username + ", password=" + password + "]";
		
	}
	
	

}
