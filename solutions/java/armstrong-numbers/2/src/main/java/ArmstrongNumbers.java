class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        // find number of digits
        int temp = numberToCheck;
        int numDigit = 0;
        while (temp > 0) {
            numDigit++;
            temp /= 10;
        }

        int total = 0;
        temp = numberToCheck;
        // split numbers into many digits
        while (temp > 0) {
            int digit = temp % 10;
            total += Math.pow(digit, numDigit);
            temp /= 10;
        }
        return total == numberToCheck;
    }

}
