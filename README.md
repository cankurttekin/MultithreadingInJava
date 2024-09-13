A thread is the smallest unit of execution within a process.
Multithreading in Java app enables performing multiple tasks simultaneously.

=> Thread Class and Runnable Interface
Thread Class: can be created by extending Thread class and overriding its run method. Run method defines thread's task.
Runable Interface: Runnable interface can be implemented and pass an instance of the implenting class to a Thread object.
'''Thread t1 = new Thread(new MyRunnable());'''

Thread's Lifecycle
New: Created but not started yet
Runnable: Ready to run and waiting for CPU time
Blocked: Waiting to acquire a lock or resource
Waiting: Waiting indefinetly for another thread to perform a particular task
Timed Waiting: Waiting for a specific period of time
Terminated: Completed execution or terminated due to an exception

Synchronization

Concurrency

Communication


