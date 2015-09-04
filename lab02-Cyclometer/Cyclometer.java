// Ben Quan 09/04/15   CSE002  CyclometerLab
//useful info: counts = number of rotations of the front wheel
// This program will: 
    //print the number of minutes for each trip
    //print the number of counts for each tirp
    //print the distance of each trip in miles  
    //print the distance for the two trips combined

public class Cyclometer {
    public static void main(String[] args) {
//above is the main class that I should always have.
        int secsTrip1 = 480; //stores the number of seconds for the first trip
        int secsTrip2 = 3220; //stores the number of seconds for the second trip
        int countsTrip1 = 1561; //stores the number of rotations for the first trip
        int countsTrip2 = 9037; //stores the number of rotations for the second trip
  
    //below will be variables for useful constants and for storing the various distances
        double wheelDiameter = 27.0; //this is the diameter of my wheel
        double PI = 3.14159; //this is the value of pi
        double feetPerMile = 5280; //this is the number of feet in a mile
        double inchesPerFoot = 12; //this is the number of inches in a foot
        double secondsPerMinute = 60; //this is the number of seconds in a minute
    //below will be the distance I traveled in the first trip, second trip, and total distaance traveled,
       double distanceTrip1 = (countsTrip1 * wheelDiameter * PI / inchesPerFoot / feetPerMile); //this is the formula for the distance of the first trip. It is represented in miles.
       double distanceTrip2 = (countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile); //this is the formula for the distance of the second trip. It is represented in miles.
       double totalDistance = (distanceTrip1 + distanceTrip2); //this is the formula for the total distance traveled
    //below will print out the numbers that I have stored in the variables that store number of seconds and counts
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + (countsTrip1) + " counts."); //this will print out how long the trip took in minutes and how many counts there were.
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + (countsTrip2) + " counts."); //this will print out how long the trip took in minutes and how many counts there were.
    //below will print out the distances I traveled
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
        System.out.println("The total distance was " + totalDistance + " miles.");

    }
}