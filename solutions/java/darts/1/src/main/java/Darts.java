class Darts {
    int score(double xOfDart, double yOfDart) {
        // center of circle: (0, 0)
        // radius formula: sqrt((x2-x1)^2+(y2-y1)^2)
        double radius = Math.sqrt(Math.pow(xOfDart, 2) +Math.pow(yOfDart, 2));
        
        // dart lands in inner circle,  radius <= 1
        if (radius <= 1) {
            return 10;
        }
        // dart lands in middle circle,  radius <= 5
        else if (radius <= 5) {
            return 5;
        }
        // dart lands in outer circle,  radius <= 10
        else if (radius <= 10) {
            return 1;
        }
        // dart lands outside the target
        return 0;
    }
}
