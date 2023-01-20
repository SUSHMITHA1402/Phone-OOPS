public class Landline implements Phone{
    private String myPhoneNo;
    private boolean isPowerOn;
    private boolean isRinging;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("Your"+" "+myPhoneNo+" "+"is getting a call");
        }
        else{
            System.out.println("Enter correct Number");
        }
        return;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn==true){
            System.out.println("Your are dialing the Number: "+phoneNo);
        }
        else{
            System.out.println("Your LandLine is Off");
        }
        return;
    }
}
