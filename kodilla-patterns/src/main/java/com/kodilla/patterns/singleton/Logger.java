package com.kodilla.patterns.singleton;

public enum Logger {

    INSTANCE;

    private String lastLog = "Kurczak";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}