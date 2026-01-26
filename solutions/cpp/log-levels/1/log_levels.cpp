#include <string>

namespace log_line {
std::string message(std::string line) {
    // return the message
    return line.substr(9);
}

std::string log_level(std::string line) {
    // return the log level
    return line.substr(1, 6);
} 

std::string reformat(std::string line) {
    // return the reformatted message
}
return line.substr(9) + " (" + line.substr(1, 6) + ")";
}  // namespace log_line

