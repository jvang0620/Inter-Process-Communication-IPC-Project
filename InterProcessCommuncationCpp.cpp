#include <iostream>
#include <cstring>

extern "C"
{
    // Dummy function to simulate receiving message from Java
    void receiveFromJava(const char *message)
    {
        std::cout << "C++ received from Java: " << message << std::endl;
    }
}
