package sample;

public class Traveler {
    private String travelerName;
    private String nationality;
    private String passportNumber;
    private String flightNumber;
    private String finalDestination;

    Traveler(String travelerName, String nationality,
             String passportNumber, String flightNumber, String finalDestination) {

        this.travelerName = travelerName;
        this.nationality = nationality;
        this.passportNumber = passportNumber;
        this.flightNumber = flightNumber;
        this.finalDestination = finalDestination;
    }


    public String getTravelerName() {
        return travelerName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    @Override
    public String toString() {
        return "Traveler's name: " + travelerName + "\n" +
                "Nationality: " + nationality + "\n" +
                "Passport Number: " + passportNumber + "\n" +
                "Flight Number: " + flightNumber + "\n" +
                "Final Destination: " + finalDestination + "\n";

    }
}
