package MultiThreading;

class SharedResource {
    boolean isReady = false;

    synchronized void produce() {
        // Produce some resource
        isReady = true;
        notify(); // Notify waiting consumer
    }

    synchronized void consume() throws InterruptedException {
        while (!isReady) {
            wait(); // Wait until resource is ready
        }
        // Consume the resource
        isReady = false;
    }
}

public class notify_wait {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            // Produce the resource
            sharedResource.produce();
        });

        Thread consumerThread = new Thread(() -> {
            try {
                // Consume the resource
                sharedResource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
