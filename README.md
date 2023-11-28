# Inter-Process-Communication-IPC-Project

This program demonstrates inter-process communication (IPC) between Node.js, Java, and C++. Here's an overview of what each part of the program does:

Node.js (JavaScript):

Spawns a Java process using child_process.spawn.
Listens for data from the Java process and prints it to the console.
Sends a message "Hello from Node.js" to the Java process.
Java:

Reads a message from the Node.js process.
Prints the received message from Node.js to the console.
Calls a dummy method (sendToCpp) to simulate sending a message to C++ using Java Native Interface (JNI).
Loads a C++ library dynamically.
C++:

Defines a dummy function (receiveFromJava) that simulates receiving a message from Java.
This function simply prints the received message to the console.
In summary, the communication flow is as follows:

Node.js sends a message to Java.
Java receives the message from Node.js, prints it, and simulates sending a message to C++.
C++ receives the simulated message from Java and prints it.
