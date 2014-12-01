package exm.collection.friendmgmt;

/**
 * 테스트용 클래스~ 
 */
public class FriendManagerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 친구 연락처 리스트를 위한 계란판 만들기 ---------------------------------------------------------------------
		// 친구 연락처 관리를 위한 클래스를 이용하여 객체 생성 
		FriendManager friendManager = new FriendManager();
		
		
		// 첫번째 친구 연락처 정보 저장을 위한 계란 만들기 ---------------------------------------------------------------------
		// 친구 연락처 정보를 저장하기 위한 객체 생성 
		Friend friend1 = new Friend(); // Friend 클래스의 첫번째 생성자 호출 
		
		// 첫번째 친구 연락처 정보가 저장된 계란을 계란판에 추가하기 ---------------------------------------------------------------------
		// 친구 연락처 정보를 친구 연락처 리스트에 추가 
		friendManager.addFriend(friend1);
	
		
		// 첫번째 친구 연락처 정보가 추가된 계란판 내용보기  ---------------------------------------------------------------------
		// 추가여부 확인하기 위해 리스트 출력 
		friendManager.listFriend();
		
		
		// 두번째 친구 연락처 정보 저장을 위한 계란 만들기 ---------------------------------------------------------------------
		// 친구 연락처 정보를 저장하기 위한 객체 생성 
		Friend friend2 = new Friend(1, "HongKilDong", "010-1234-5678", "me.jpg"); // Friend 클래스의 번째 생성자 호출 
		
		// 친구 연락처 정보를 친구 연락처 리스트에 추가 
		friendManager.addFriend(friend2);
		
		// 추가여부 확인하기 위해 리스트 출력 
		friendManager.listFriend();
	}

}
