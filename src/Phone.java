public interface Phone {
    void powerOn();
    boolean isRinging();
    boolean answerCall();
    void receiveCall(String number);
    void callNumber(String number);

}
