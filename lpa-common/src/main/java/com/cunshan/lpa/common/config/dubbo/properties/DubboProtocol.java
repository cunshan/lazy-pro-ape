package com.cunshan.lpa.common.config.dubbo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="dubbo.protocol")
public class DubboProtocol {

	/**
	 * 接口协议
	 */
	private String name = "com/cunshan/lpa/provider/dubbo";
	/**
	 * 暴露服务的端口
	 */
	private int port = 20880;

	/**
	 * 是否记录接口日志
	 */
	private boolean accessLog = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public boolean isAccessLog() {
		return accessLog;
	}

	public void setAccessLog(boolean accessLog) {
		this.accessLog = accessLog;
	}
	
	
	

}
