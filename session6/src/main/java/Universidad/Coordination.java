package Universidad;

/**
 * @author diego
 * @version 1.0
 * @created 05-sep.-2024 18:31:32
 */
public class Coordination {

	private int code;
	private String name;

	public Coordination(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\ncode = " + code + ", name = '" + name + '\'';
	}
}
