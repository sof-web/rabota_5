#include <iostream>
#include <cmath>

int digit_sum(int n) {
    n = std::abs(n);
    if (n == 0)
        return 0;
    return (n % 10) + digit_sum(n / 10);
}

int main() {
    std::cout << digit_sum(123) << std::endl;   
    std::cout << digit_sum(-456) << std::endl;  
    return 0;
}


#вывод
#6
#15
