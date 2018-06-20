package com.kodilla.good.patterns.challenges.firstchallenges;

import java.util.ArrayDeque;

public class QueueController {
    OrderClientRequest retriever = new OrderClientRequest();
    ArrayDeque<OrderRequest> queue = new ArrayDeque<>();

    public void addToQueue() {
        queue.offer(retriever.retrieve());
        System.out.println("Zamówienie zostało dodane do wysłania");
    }

    public void removeFromQueue() {
        OrderRequest temporaryOrder;
        temporaryOrder = queue.poll();
    }
}
