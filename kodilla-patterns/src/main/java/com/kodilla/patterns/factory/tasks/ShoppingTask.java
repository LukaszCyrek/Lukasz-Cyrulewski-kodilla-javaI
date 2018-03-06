package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
   final String whatToBuy;
    final double quanity;
    final String taskName;

    public ShoppingTask(final String whatToBuy,final double quanity,final String taskName) {
        this.whatToBuy = whatToBuy;
        this.quanity = quanity;
        this.taskName = taskName;
    }

    @Override
    public String executeTask() {
        return null;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        if (getTaskName()==executeTask()) {
            return true;
        } else {
            return false;
        }
    }
}
