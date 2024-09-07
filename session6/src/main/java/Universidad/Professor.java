package Universidad;

/**
 * @author diego
 * @version 1.0
 * @created 05-sep.-2024 18:31:36
 */
public class Professor {

	private String firstname;
	private String id;
	private String lastname;
	private String title;
	public Coordination m_Coordination;

	public Professor() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return firstname;
	}

	public void setName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Coordination getCoordination() {
		return m_Coordination;
	}

	public void setCoordination(int code, String name) {
		m_Coordination = new Coordination(code, name);
	}
}
