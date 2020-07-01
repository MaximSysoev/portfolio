package ru.sysoevm.threadpool;

/*
1. Необходимо реализовать пул потоков.
tasks - это блокирующая очередь. Если в очереди нет элементов, то нить переводиться в
состоянии waiting.

Когда приходит новая задача, всем нитям в состоянии waiting посылается сигнал проснуться и начать работу.

2. Создать метод work(Runnable job). - этот метод должен добавлять задачи в блокирующую очередь tasks.
 */