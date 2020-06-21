package ru.sysoevm.cachestoringmodels;

import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import java.util.concurrent.ConcurrentHashMap;

@ThreadSafe
public class CacheStoringModels {

    @GuardedBy("this")
    public ConcurrentHashMap<Integer, Base> map = new ConcurrentHashMap<>();

    private int value;

    public void add(Base model) {
        map.put(model.getId(), model);
    }

    public void update(Base model) throws OptimisticException {
        if (value == model.getVersion()) {
            value = model.getVersion();
            model.setVersion(value+1);
            map.computeIfPresent(model.getId(), (k, v)-> model);
        } else {
            throw new OptimisticException("Модель уже обновлена");
        }
    }

    public synchronized void delete(Base model) {
        map.remove(model.getId());
    }

}

