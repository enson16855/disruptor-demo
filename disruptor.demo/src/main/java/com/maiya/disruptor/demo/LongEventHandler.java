package com.maiya.disruptor.demo;

import com.lmax.disruptor.EventHandler;

/**
 * 消费
 * 
 * @author root
 *
 */
public class LongEventHandler implements EventHandler<LongEvent> {

	@Override
	public void onEvent(LongEvent event, long sequence, boolean endOfBatch) throws Exception {
		System.out.println(event.getValue());
	}

}
