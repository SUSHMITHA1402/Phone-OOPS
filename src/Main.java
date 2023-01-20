public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("8639612012");
        Landline l2 = new Landline("9849269610");
        l1.callNumber("9849269610");
        l2.receiveCall("984");
        l2.answerCall();
    }
}