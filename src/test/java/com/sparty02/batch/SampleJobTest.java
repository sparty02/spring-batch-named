package com.sparty02.batch;

import java.util.Properties;
import java.util.UUID;

import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.JobExecution;

import org.junit.Test;

public class SampleJobTest {

    @Test
    public void runSampleJob() throws Exception {
        Properties jobParameters = new Properties();
        jobParameters.put("uuid", UUID.randomUUID().toString());

        long executionId = BatchRuntime.getJobOperator().start("sampleJob",
                jobParameters);
        JobExecution jobExecution = BatchRuntime.getJobOperator()
                .getJobExecution(executionId);

        awaitCompletion(jobExecution);
    }

    public static JobExecution awaitCompletion(JobExecution jobExecution)
            throws InterruptedException {

        while (!jobExecution.getBatchStatus().equals(BatchStatus.COMPLETED)) {
            Thread.sleep(1000);
            jobExecution = BatchRuntime.getJobOperator().getJobExecution(
                    jobExecution.getExecutionId());
        }

        return jobExecution;
    }
}
