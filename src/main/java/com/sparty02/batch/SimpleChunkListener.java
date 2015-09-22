package com.sparty02.batch;

import javax.batch.api.chunk.listener.ChunkListener;

public class SimpleChunkListener implements ChunkListener {

    @Override
    public void beforeChunk() throws Exception {
        System.out.println("beforeChunk");
    }

    @Override
    public void onError(Exception ex) throws Exception {
        System.out.println("onError");
        ex.printStackTrace();
    }

    @Override
    public void afterChunk() throws Exception {
        System.out.println("afterChunk");
    }

}
