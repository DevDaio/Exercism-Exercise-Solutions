#include <string>

namespace log_line {
    std::string message(std::string txt) {
        return txt.substr(txt.find(":")+2);
    }
    std::string log_level(std::string txt) {
        return txt.substr(1, txt.find(":") - 2);
    }
    std::string reformat(std::string txt) {
        return message(txt) + " (" + log_level(txt) + ")";
    }
} // namespace log_line
