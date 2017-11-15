package com.shang.testJetty;

import java.io.File;

import org.apache.log4j.Logger;
import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.plus.webapp.EnvConfiguration;
import org.mortbay.jetty.webapp.Configuration;
import org.mortbay.jetty.webapp.WebAppContext;
import org.mortbay.thread.QueuedThreadPool;

public class TestJettyRunner {
	protected static Logger logger = Logger.getLogger(TestJettyRunner.class);
	private static Server server = new Server();
	
	public static void main(String[] args)throws Exception {
		QueuedThreadPool boundedThreadPool = new QueuedThreadPool();
		boundedThreadPool.setMaxThreads(5);
		server.setThreadPool(boundedThreadPool);

		Connector connector = new SelectChannelConnector();
		connector.setPort(9595);
		server.addConnector(connector);

		WebAppContext context = new WebAppContext("src/main/webapp", "/demo");
		context.setDefaultsDescriptor("src/test/resources/webdefault.xml");
		
		EnvConfiguration envConfiguration = new EnvConfiguration();
        envConfiguration.setJettyEnvXml(new File("src/test/resources/jetty/jetty-env.xml").toURI().toURL());
		Configuration[] configurations = new Configuration[]{
		        new org.mortbay.jetty.webapp.WebInfConfiguration(),
		        envConfiguration,
		        new org.mortbay.jetty.plus.webapp.Configuration(),
		        new org.mortbay.jetty.webapp.JettyWebXmlConfiguration(),
		        new org.mortbay.jetty.webapp.TagLibConfiguration()
		};
		context.setConfigurations(configurations);
		
		server.setHandler(context);

		server.setStopAtShutdown(true);
		server.setSendServerVersion(true);

		server.start();
		String res = "\n\n\n\n\n\n\n\n\n\n\n\n StartUP 0000000000000000000000000000 \n\n\n\n\n\n\n\n\n\n\n\n";
		System.out.println(res);
		logger.info(res);
		server.join();
	}
}
