
#include <iostream>

#include "stdafx.h"

class myVect {
private:
	double x;
	double y;
public:
	myVect();
	myVect(double xVal, double yVal);
	void printVec();
	double getX();
	double getY();
};

class Travel {
public:
	myVect calcDistance(myVect a, myVect b);
};

int main() {
	myVect oneVec = myVect(0,0);
	myVect twoVec = myVect(7600,2200);
	//Wait until Sam comes back
	 
	return 0;
}

myVect::myVect() {
	x = 0;
	y = 0;

}

myVect::myVect(double xVal, double yVal) {
	x = xVal;
	y = yVal;
}

void myVect::printVec() {
	std::cout << x << "," << "y" << std::endl;
}

double myVect::getX() {
	return x;
}

double myVect::getY() {
	return y;
}

myVect Travel::calcDistance(myVect a, myVect b) {
	//a is startpoint, b is endpoint
	return myVect((b.getX() - a.getX), (b.getY(), a.getY));
}
