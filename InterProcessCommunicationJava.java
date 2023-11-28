import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterProcessCommunicationJava {
    public static void main(String[] args) {
        // Read message from Node.js
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String message = reader.readLine();
            System.out.println("Java received from Node.js: " + message);

            // Send message to C++ using JNI (Java Native Interface)
            sendToCpp(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Dummy method to simulate sending message to C++
    private static native void sendToCpp(String message);

    static {
        // Load C++ library
        System.loadLibrary("InterProcessCommunicationCpp");
    }
}
