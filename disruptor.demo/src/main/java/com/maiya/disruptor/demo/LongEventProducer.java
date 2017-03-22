package com.maiya.disruptor.demo;

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;

/**
 * 事件源
 * 
 * @author root
 *
 */
public class LongEventProducer {
	private final RingBuffer<LongEvent> ringBuffer;

	public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
		super();
		this.ringBuffer = ringBuffer;
	}

	public void onData(ByteBuffer buffer) {
		long sequence = ringBuffer.next();

		try {
			LongEvent event = ringBuffer.get(sequence);
			event.setValue(buffer.getLong(0));
		} finally {
			ringBuffer.publish(sequence);
		}
	}

}