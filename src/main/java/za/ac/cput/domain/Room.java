package za.ac.cput.domain;

//Sinhle Mthethwa 221802797

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Room {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long roomID;
    private int roomNumber;
    private boolean roomPrice;
    private int roomCapacity;
    private String roomDescription;

    @Enumerated(EnumType.STRING)
    private roomType roomType;

    public enum roomType {
        SINGLE,
        DOUBLE,
        EN_SUITE
    }
    @Enumerated(EnumType.STRING)
    private roomStatus roomStatus;

    public enum roomStatus {
        AVAILABLE,
        FULL,
    }
    protected Room() {

    }

    private Room(Room.Builder builder) {
        this.roomID = builder.roomID;
        this.roomNumber = builder.roomNumber;
        this.roomPrice = builder.roomPrice;
        this.roomCapacity = builder.roomCapacity;
        this.roomDescription = builder.roomDescription;
        this.roomType = builder.roomType;
        this.roomStatus = builder.roomStatus;

    }
    public Long getRoomID() {
        return roomID;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public boolean isRoomPrice() {
        return roomPrice;
    }
    public int getRoomCapacity() {
        return roomCapacity;
    }
    public String getRoomDescription() {
        return roomDescription;
    }
    public roomType getRoomType() {
        return roomType;
    }
    public roomStatus getRoomStatus() {
        return roomStatus;
    }

    @Override
    public String toString() {
        return "Room [roomID=" + roomID +
                ", roomNumber=" + roomNumber +
                ", roomPrice=" + roomPrice +
                ", roomCapacity=" + roomCapacity +
                ", roomDescription=" + roomDescription
                + ", roomType=" + roomType +
                ", roomStatus=" + roomStatus +
                '}';
    }
    public static class Builder {
        private Long roomID;
        private int roomNumber;
        private boolean roomPrice;
        private int roomCapacity;
        private String roomDescription;
        private roomType roomType;
        private roomStatus roomStatus;

        public Builder roomID(Long roomID) {
            this.roomID = roomID;
            return this;
        }

        public Builder roomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public Builder roomPrice(boolean roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }

        public Builder roomCapacity(int roomCapacity) {
            this.roomCapacity = roomCapacity;
            return this;
        }

        public Builder roomDescription(String roomDescription) {
            this.roomDescription = roomDescription;
            return this;
        }

        public Builder roomType(roomType roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder roomStatus(roomStatus roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }

        public Room.Builder Copy(Room room) {
            this.roomID = room.getRoomID();
            this.roomNumber = room.getRoomNumber();
            this.roomPrice = room.isRoomPrice();
            this.roomCapacity = room.getRoomCapacity();
            this.roomDescription = room.getRoomDescription();
            this.roomType = room.getRoomType();
            this.roomStatus = room.getRoomStatus();
            return this;
        }

        public Room build() {
            return new Room(this);
        }

    }

    }
