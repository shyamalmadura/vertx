package com.github.shyamalmadura;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class HelloServerVertx extends AbstractVerticle {

    @Override
    public void start(Future<Void> future) {
        vertx.createHttpServer()
                .requestHandler(
                  r -> r.response().end("Welcome to Vert.x Intro"))
                .listen(config().getInteger("http.port", 8080), result -> {
                    if (result.succeeded()) {
                        future.complete();
                    } else {
                        future.fail(result.cause());
                    }
                });
    }

}