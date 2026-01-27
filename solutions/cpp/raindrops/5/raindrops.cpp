#include "raindrops.h"

namespace raindrops {
	std::string convert(int x) {
		std::string rain;
		if (x % 3 == 0)
			rain += "Pling";
		if (x % 5 == 0)
			rain += "Plang";
		if (x % 7 == 0)
			rain += "Plong";
		if(rain.empty())
			rain = std::to_string(x);

		return rain;
	}
}  // namespace raindrops





#if !defined(RAINDROPS_H)
#define RAINDROPS_H
#include <string>

namespace raindrops {
	std::string convert(int x);
}  // namespace raindrops

#endif // RAINDROPS_H