package com.cacheproxy.rediscloud.client.conn;

import io.netty.channel.ChannelHandlerContext;

import com.cacheproxy.rediscloud.codec.request.entity.RedisRequest;

/**
 * @desc 
 * @author liya
 * @emial  lijiaqiya@163.com
 * @date 2017-3-6
 */
public class RedisConnection extends AbstractRedisConnection {

	@Override
	public void write(RedisRequest request, ChannelHandlerContext context) {
		
		socketChannel.writeAndFlush(request);
	}

	@Override
	public void open() {
		start();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(int timeout) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

