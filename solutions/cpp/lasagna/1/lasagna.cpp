#include<iostream>
#include<iomanip>
int ovenTime() {
    return 40;
}
int remainingOvenTime(int actualMinutesInOven) {
    int remaining = ovenTime() - actualMinutesInOven;
    return remaining;
}
int preparationTime(int numberOfLayers) {
    int timePerLayer{2};
    return numberOfLayers * timePerLayer;
}
int elapsedTime(int numberOfLayers, int actualMinutesInOven) {
    return preparationTime(numberOfLayers) + actualMinutesInOven;
}