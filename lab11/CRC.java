import java.util.Scanner;

public class CRC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first binary message
        System.out.print("Enter the first binary message: ");
        String binaryMessage1 = scanner.nextLine();

        // Get user input for the second binary message
        System.out.print("Enter the second binary message: ");
        String binaryMessage2 = scanner.nextLine();

        // Calculate parity bit for the messages
        int parityBit1 = calculateParityBit(binaryMessage1);
        int parityBit2 = calculateParityBit(binaryMessage2);

        // Display the original binary messages and parity bits
        System.out.println("Original Binary Message 1: " + binaryMessage1);
        System.out.println("Parity Bit 1: " + parityBit1);

        System.out.println("Original Binary Message 2: " + binaryMessage2);
        System.out.println("Parity Bit 2: " + parityBit2);

        // Simulate transmission by adding errors
        simulateTransmission(binaryMessage1);
        simulateTransmission(binaryMessage2);

        // Display the received binary messages with errors
        System.out.println("Binary Message 1 sent with errors: " + binaryMessage1);
        System.out.println("Binary Message 2 sent with errors: " + binaryMessage2);

        // Receive the binary messages and verify parity bit
        if (receiveBinaryMessage(binaryMessage1, parityBit1) && receiveBinaryMessage(binaryMessage2, parityBit2)) {
            System.out.println("Both messages received without errors.");
        } else {
            System.out.println("Error detected in at least one of the received messages.");
        }

        scanner.close();
    }

    // Calculate the parity bit for the given binary message
    private static int calculateParityBit(String binaryMessage) {
        int countOnes = 0;

        for (int i = 0; i < binaryMessage.length(); i++) {
            if (binaryMessage.charAt(i) == '1') {
                countOnes++;
            }
        }

        return countOnes % 2;
    }

    // Simulate transmission by flipping a bit (for testing purposes)
    private static void simulateTransmission(String binaryMessage) {
        // Simulate transmission by flipping the first bit (modify this part for testing)
        if (binaryMessage.length() > 0) {
            char firstBit = binaryMessage.charAt(0);
            binaryMessage = (firstBit == '0') ? '1' + binaryMessage.substring(1) : '0' + binaryMessage.substring(1);
        }
    }

    // Receive the binary message and verify the parity bit
    private static boolean receiveBinaryMessage(String receivedMessage, int originalParityBit) {
        // Calculate parity bit for the received message
        int receivedParityBit = calculateParityBit(receivedMessage);

        // Check if the calculated parity bit matches the original parity bit
        return receivedParityBit == originalParityBit;
    }
}
