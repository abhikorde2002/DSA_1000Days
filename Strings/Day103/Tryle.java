package Strings.Day103;

import java.util.Arrays;

public class Tryle {
    public static void main(String[] args) {
        // String s = "923 E Frontage Rd, Rio Rico AZ 85648";
        // String[] parts = s.split(" ");
        // String zipCode = parts[parts.length - 1];
        // System.out.println("Zip Code: " + zipCode);
        String s = "1550 W Calle Plata, Nogales AZ 85621";
        String[] parts = s.split(", "); // Split the string by ", "
        String city = parts[1].split(" ")[0] + " " + parts[1].split(" ")[1]; // Concatenate the first two parts of the second split
        System.out.println("City: " + city);
        // String s = "923 E Frontage Rd, Rio Rico AZ 85648";
        // String[] parts = s.split(", "); // Split the string by ", "
        // String[] cityStateZip = parts[1].split(" "); // Split the second part by space
        // String stateCode = cityStateZip[cityStateZip.length - 2]; // Get the second-to-last part which contains the state code
        // System.out.println("State Code: " + stateCode);

    }
}
