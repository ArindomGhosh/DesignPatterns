package com.hamish.compoundPatterns.mvc.beatExample;

/**
 * Created by hamishdickson on 05/01/15.
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
