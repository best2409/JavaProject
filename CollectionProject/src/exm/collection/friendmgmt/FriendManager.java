package exm.collection.friendmgmt;

import java.util.*;

/**
 * 친구의 연락처 정보를 관리하기 위한 클래스 
 * - addFriend() : 친구의 연락처 정보를 추가 
 * - listFriend() : 친구의 연락처 정보를 리스트로 출력 
 *
 */

public class FriendManager {
	private List<Friend> friendList;
	
	public FriendManager() {
		friendList = new ArrayList<Friend>();
	}
	
	// 친구 추가 메소드 
	public void addFriend(Friend friend) {
		friendList.add(friend);
	}
	
	// 친구 삭제 메소드 - 친구 전체 정보를 기반으로 하여 친구 정보 삭제 
	public void removeFriend(Friend friend) {
		
	}
	
	// 친구 삭제 메소드 - 친구 정보 저장시 유일값 저장하기 위한 id를 기반으로 하여 친구 정보 삭제 
	public void removeFriend(int id) {
		
	}
	
	// 친구 리스트 출력 메소드 
	public void listFriend() {
		Iterator<Friend> iterator = friendList.iterator();
		
		
		System.out.println("=============== Friend List =================");
		System.out.println("Id \t Name \t Phone \t");
		
		while(iterator.hasNext()) {
			Friend f = iterator.next();
			
			System.out.println(f.getId() + "\t" + f.getName() + "\t" + f.getPhone() + "\t");
		}
	}
	
}
