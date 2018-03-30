## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  | 10000000           | 0.0131748       |
| Using ReentrantLock     | 10000000           | 0.8163890       |
| Synchronized method     | 10000000           | 0.8563106       |
| AtomicLong for total    | 10000000           | 0.3459192       |

## 1. Using unsynchronized counter object

1.1 No, total isn't always the same.
1.2 Average runtime 0.0131748 second.
1.3 Because thread 1 started before thread 2. When thread 1 finished the calculation(Assume that thread 1 calculation is 0+1=1) then set the total to 1. Thread 2 get total(1) from Counter and calculate(Assume that thread 2 calculation is 1-1=0) then set the total to 0. But sometimes thread 2 calculation faster than thread 1 and set total and when thread 1 finished calculation and set total which incorrect.

## 2. Implications for Multi-threaded Applications

When a lot of people use Banking application means there are a lot of threads and threads run at the same time cause error in the application.

## 3. Counter with ReentrantLock

3.1 Yes, total is always 0. Average runtime 0.2003966 second.
3.2 Because ReentrantLock locked Counter to have only 1 thread can access.
3.3 
3.4 Because lock.unlock() use to unlock Counter.

## 4. Counter with synchronized method

4.1 
4.2
4.3

## 5. Counter with AtomicLong

answer question 5

## 6. Analysis of Results

answer question 6

## 7. Using Many Threads (optional)

