package homework5.vehicle;

public class Tram extends PublicTransport{
    int numberOfSeats;
    int numberOfOccupidSeat;
    boolean onRails;
    boolean currentOn;

    public Tram(int numberOfSeats, int numberOfOccupidSeat, boolean onRails, boolean currentOn) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfOccupidSeat = numberOfOccupidSeat;
        this.onRails = onRails;
        this.currentOn = currentOn;
    }

    public void tramGo(){
        if(onRails == true && currentOn == true){
            go();
        }else{
            System.out.println("i cant going");
        }
    }

    public void canISeat(){
        if(numberOfOccupidSeat >= numberOfSeats){
            System.out.println("I cant seat :( ");
        }else{
            System.out.println("I can seat :)");
        }
    }

    public void itsMyRoute(){
        if(getRoute().equals(route)){
            System.out.println("Its my route");
        }else{
            System.out.println("No");
        }
    }

    @Override
    public boolean babki() {
        if(babki() == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", number of seats: " + numberOfSeats + ", its work: " + currentOn;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Tram){
            Tram tram = (Tram) obj;
            if(tram.getName().equals(name) && tram.numberOfSeats == numberOfSeats){
                return true;
            }
        }
        return false;
    }
}
