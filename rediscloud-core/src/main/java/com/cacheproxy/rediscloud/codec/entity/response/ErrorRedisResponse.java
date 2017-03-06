package com.cacheproxy.rediscloud.codec.entity.response;

import io.netty.buffer.ByteBuf;

import com.cacheproxy.rediscloud.common.RedisResponseType;

/**
 * @desc 
 * @author liya
 * @emial  lijiaqiya@163.com
 * @date 2017-3-6
 */
public class ErrorRedisResponse extends AbstractRedisResponse {

	public ErrorRedisResponse(RedisResponseType type) {
		super(RedisResponseType.ERROR);
	}
	
	@Override
	protected void doEncode(ByteBuf buf) {
		buf.writeBytes(value);
		writeCRLF(buf);
	}

}


