package com.github.ctpahhik.cq4j.execution;

import com.github.ctpahhik.cq4j.Query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * TODO: JavaDoc
 *
 * @author Denys Mostovliuk (mostovliuk@gmail.com)
 */
public class RecursiveFilteringTask<T> extends RecursiveTask<Collection<T>> {

    private static final int FORK_SIZE = 10; //TODO: find optimal
    private List<T> dataSource;
    private Query<T> query;

    public RecursiveFilteringTask(Query<T> query, List<T> dataSource) {
        this.query = query;
        this.dataSource = dataSource;
    }

    @Override
    protected Collection<T> compute() {
        int size = dataSource.size();
        if (size < FORK_SIZE) {
            return computeDirectly();
        } else {
            Collection<T> result = new ArrayList<T>();
            int mid = size / 2;
            RecursiveFilteringTask<T> first = new RecursiveFilteringTask<T>(query, dataSource.subList(0, mid));
            first.fork();
            RecursiveFilteringTask<T> second = new RecursiveFilteringTask<T>(query, dataSource.subList(mid, size));
            second.fork();
            result.addAll(first.join());
            result.addAll(second.join());
            return result;
        }
    }

    private Collection<T> computeDirectly() {
        return query.filter(dataSource);
    }
}