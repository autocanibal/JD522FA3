/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mondemkhize.JD522FA3;

/**
 *
 * @author monde
 */
public class TimerThreads {

    private long startTime;
    private long elapsedTime;

    public boolean isIsRunning() {
        return isRunning;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }
    private boolean isRunning;

    public String start() {
        if (!isRunning) {
            if (elapsedTime == 0) {
                startTime = System.currentTimeMillis();
            } else {
                startTime = System.currentTimeMillis() - elapsedTime;
            }

            isRunning = true;
            Thread timerThread = new Thread(() -> {
                while (isRunning) {
                    elapsedTime = System.currentTimeMillis() - startTime;
                    try {
                        Thread.sleep(1); // Update every second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            timerThread.start();

            return "Timer started.";
        } else {
            return "Timer is already running.";
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Timer stopped. Elapsed time: " + formatElapsedTime(elapsedTime));
        } else {
            System.out.println("Timer is not running.");
        }
    }

    public String formatElapsedTime(long elapsedTime) {
        long minutes = elapsedTime / (1000 * 60);
        long seconds = (elapsedTime / 1000) % 60;
        long millisec = elapsedTime % 1000;
        if(seconds >= 1){
            return String.format("%02d:%02d.%02d", minutes, seconds, millisec);
        }else{
            return String.format("%02d.%02d", seconds, millisec);
        }
    }
}
