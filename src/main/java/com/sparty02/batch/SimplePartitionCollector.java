package com.sparty02.batch;

import java.io.Serializable;

import javax.batch.api.partition.PartitionCollector;

public class SimplePartitionCollector implements PartitionCollector {

    @Override
    public Serializable collectPartitionData() throws Exception {
        System.out.println("collectPartitionData");
        return null;
    }

}
