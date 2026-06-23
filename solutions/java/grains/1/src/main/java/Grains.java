import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger numGrains = new BigInteger("2");
        return numGrains.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger numGrains = new BigInteger("0");
        for (int i = 1; i <= 64; i++) {
            numGrains = numGrains.add(grainsOnSquare(i));
        }
        return numGrains;
    }

}
