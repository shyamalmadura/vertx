package com.github.shyamalmadura;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

public class HelloVertx extends AbstractVerticle {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloVertx.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new HelloVertx());
    }

    @Override
    public void start(Future<Void> future) {
        LOGGER.info("Welcome to Vertx");
    }

    @Override
    public void stop() {
        LOGGER.info("Shutting down application");
    }
}