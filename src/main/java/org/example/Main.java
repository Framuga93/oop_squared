package org.example;

import org.example.controller.UserController;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        UserController controller = new UserController();
        controller.createCircle(10.0);
        controller.createSquare(1.0);
        controller.createTriangle(5.0,2.0,6.0);
        controller.createRectangle(6.0,4.0);
        logger.info(String.valueOf(controller.getAllPerimeters()));
        logger.info(String.valueOf(controller.getAllArea()));
        logger.info(String.valueOf(controller.getAllLength()));
    }
}