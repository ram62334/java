package org.Test;

class Task2 implements Runnable {
    private Resource resource;

    public Task2(Resource resource) { this.resource = resource; }

    @Override
    public void run() {
        resource.test2();
        resource.test1();
        System.out.println("Invoked Test1 Method from Task2");
    }
}
