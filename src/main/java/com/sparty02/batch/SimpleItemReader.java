package com.sparty02.batch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Named;

@Named
public class SimpleItemReader extends AbstractItemReader {

    private Iterator<String> colorIterator;

    @Override
    public void open(Serializable checkpoint) throws Exception {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("indigo");
        colors.add("violet");

        colorIterator = colors.iterator();
    }

    @Override
    public Object readItem() throws Exception {
        if (colorIterator.hasNext()) {
            return colorIterator.next();
        } else {
            return null;
        }
    }
}
