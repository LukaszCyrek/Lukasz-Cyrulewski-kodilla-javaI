package com.kodilla.good.patterns.challenges.firstchallenges;

public class Application {

    public static void main (String[] args) {
    OrderClientRequest orderClientRequest = new OrderClientRequest();
    OrderRequest orderRequest = orderClientRequest.retrieve();
    OrderingProcessor orderingProcessor = new OrderingProcessor(new MailService(),new ProductOrderService(), new ProductRepositoryService());
        orderingProcessor.process(orderRequest);
}
}
