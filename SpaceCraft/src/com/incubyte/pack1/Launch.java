package com.incubyte.pack1;

public class Launch {
    public static void main(String[] args) {
        Space space = new Space(0, 0, 0, "N");
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        for (char command : commands) {
            switch (command) {
                case 'f':
                    space.moveForward();
                    break;
                case 'b':
                    space.moveBackward();
                    break;
                case 'l':
                    space.turnLeft();
                    break;
                case 'r':
                    space.turnRight();
                    break;
                case 'u':
                    space.turnUp();
                    break;
                case 'd':
                    space.turnDown();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Final Position: "+ space.toString());
    }
}