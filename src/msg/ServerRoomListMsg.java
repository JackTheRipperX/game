package msg;

import java.util.List;

import entity.Room;

//����˷����ķ����б�֪ͨ����
public class ServerRoomListMsg extends BaseMsg {
	private List<Room> roomList;

	public ServerRoomListMsg(List<Room> roomList) {
		super();
		this.roomList = roomList;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public void doBiz() {
		// ����û��б?��ʾ
		System.out.println(roomList);
		//LoginFrame.getMyClient().getHallFrame().showRoomList(roomList);;

	}
}
