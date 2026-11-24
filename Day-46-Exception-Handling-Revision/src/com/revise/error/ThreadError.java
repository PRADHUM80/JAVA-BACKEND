package com.revise.error;


public class ThreadError {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {

            public void run() {

                int arr[] = new int[999999999];

            }
        });

        t.start();
}
    /**
     * main() starts execution.



We create a thread using Runnable.



run() executes in the new thread.



We create a very large array.



JVM may throw OutOfMemoryError.
     * 
     * 
     * 
     * Exception in thread "Thread-0" java.lang.OutOfMemoryError: Java heap space
	at com.revise.error.ThreadError$1.run(ThreadError.java:12)
	at java.base/java.lang.Thread.runWith(Thread.java:1487)
	at java.base/java.lang.Thread.run(Thread.java:1474)
     */
}

