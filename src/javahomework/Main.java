package javahomework;


public class Main {

    public static void main(String[] args) {

        WorkshopRegistration registration =
                new WorkshopRegistration();

        try {

            registration.registerParticipant("Abrar", 16);

        } catch (InvalidAgeException e) {

            System.out.println(
                    "Caught Exception: " + e.getMessage()
            );
        }
    }
}