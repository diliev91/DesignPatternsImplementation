package com.exercise.patterns.behavioural.mediator;

class Consumer implements Runnable {
    // 3. Consumers are coupled only to the Mediator
    private Mediator med;
    private int id;
    private static int num = 1;

    public Consumer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
            System.out.print("c" + id + "-" + med.retrieveMessage() + "  ");
    }
}