package com.sparty02.batch;

import javax.batch.api.listener.JobListener;

public class SimpleJobListener implements JobListener {

    @Override
    public void beforeJob() throws Exception {
        System.out.println("beforeJob");
    }

    @Override
    public void afterJob() throws Exception {
        System.out.println("afterJob");
    }

}
