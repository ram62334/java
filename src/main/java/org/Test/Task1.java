package org.Test;

class Task1 implements Runnable {
    private Resource resource;

    public Task1(Resource resource) { this.resource = resource; }

    @Override
    public void run() {
        resource.test1();
        resource.test2();
        System.out.println("Invoked Test2 Method from Task1");
    }
}

