package message_pack;

public class CreateRoomMessage {
    private String roomName;

    public CreateRoomMessage(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
