package exm.collection.friendmgmt;

/**
 * 친구의 연락처 정보를 저장하기 위해 만든 클래스 타입
 * - 친구의 데이터를 저장하는 목적 
 *
 */
public class Friend {
	private int id;					// 친구를 구별하기 위한 유일값 저장한 아이
	private String name;			// 친구 이름 
	private String phone;			// 친구 전화번호 
	private String photo;			// 친구 이미지 
	
	public Friend() {
		this.id = 0;
		this.name = "no name";
		this.phone = "";
		this.photo = "";
	}
	
	public Friend(int id, String name, String phone, String photo) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.photo = photo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
