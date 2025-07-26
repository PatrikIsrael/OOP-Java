package Enums;

public enum OrderStatus {
    PEINDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int code;

    OrderStatus(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }

}
