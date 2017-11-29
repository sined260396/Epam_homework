package lab6;

public enum Phone {
    HOME,
    SMART,
    BUTTON;

    void call(int number){
        if(this == HOME){
            System.out.println("Calling to " + number + " by home phone");
        }
        if(this == SMART){
            System.out.println("Calling to " + number + " by smart phone");
        }
        if(this == BUTTON){
            System.out.println("Calling to " + number + " by button phone");
        }
    }
}
