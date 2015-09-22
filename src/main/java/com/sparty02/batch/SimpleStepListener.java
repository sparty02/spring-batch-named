package com.sparty02.batch;

import javax.batch.api.listener.StepListener;

public class SimpleStepListener implements StepListener {

    @Override
    public void beforeStep() throws Exception {
        System.out.println("beforeStep");
    }

    @Override
    public void afterStep() throws Exception {
        System.out.println("afterStep");
    }

}
