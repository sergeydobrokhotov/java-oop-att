package ru.geekbrains.java.oop.at.obstacles;

import ru.geekbrains.java.oop.at.participants.Runner;

public class Treadmill implements Obstacles {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void check(Runner runner) {
        runner.run();
        if (runner.getSuccess()) {
            System.out.println("Бегун " + runner.getName() + " выполнил испытание, пробежав дорожку длиной: " + length);
        } else {
            System.out.println("Бегун " + runner.getName() + " не пробежал дорожку длиной: " + length );
        }
    }
}