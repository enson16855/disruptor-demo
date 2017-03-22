package com.maiya.disruptor.demo;

import com.lmax.disruptor.EventFactory;

/**
 * 工厂生产
 * 
 * @author root
 *
 */
public class LongEventFactory implements EventFactory<LongEvent> {

	@Override
	public LongEvent newInstance() {
		return new LongEvent();
	}

}
