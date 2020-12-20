package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger settingLogName;

    @Test
    void testGetFileName() {
        //Given

        settingLogName = Logger.INSTANCE;
        //When
        String logName = settingLogName.getLastLog();
        System.out.println("Opened: " + logName);
        //Then
        assertEquals("Kurczak", logName);
    }
}
