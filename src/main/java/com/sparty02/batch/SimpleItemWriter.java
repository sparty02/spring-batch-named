package com.sparty02.batch;

import java.util.List;

import javax.batch.api.BatchProperty;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SimpleItemWriter extends AbstractItemWriter {

    @Inject
    @BatchProperty
    private String uuid;

    @Inject
    private JobContext jobContext;

    @Override
    public void writeItems(List<Object> items) throws Exception {
        System.out.println(jobContext);
        System.out.println(String.format("UUID: %s", uuid));
        for (Object item : items) {
            System.out.println(item);
        }
    }

}
