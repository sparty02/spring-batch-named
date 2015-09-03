package com.sparty02.batch;

import java.util.List;

import javax.batch.api.BatchProperty;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SimpleItemWriter extends AbstractItemWriter {

    @Inject
    @BatchProperty
    private String uuid;

    @Override
    public void writeItems(List<Object> items) throws Exception {
        System.out.println(String.format("UUID: %s", uuid));
        for (Object item : items) {
            System.out.println(item);
        }
    }

}
