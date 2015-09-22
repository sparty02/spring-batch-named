package com.sparty02.batch;

import java.util.Properties;

import javax.batch.api.partition.PartitionMapper;
import javax.batch.api.partition.PartitionPlan;
import javax.batch.api.partition.PartitionPlanImpl;

public class SimplePartitionMapper implements PartitionMapper {

    @Override
    public PartitionPlan mapPartitions() throws Exception {
        PartitionPlan partitionPlan = new PartitionPlanImpl();

        int partitionCount = 5;
        Properties[] partitionProps = new Properties[partitionCount];

        for (int i = 0; i < partitionCount; i++) {
            Properties props = new Properties();
            props.put("key", String.valueOf(i));
            partitionProps[i] = props;
        }

        partitionPlan.setPartitionProperties(partitionProps);
        partitionPlan.setPartitions(partitionCount);

        return partitionPlan;
    }

}
