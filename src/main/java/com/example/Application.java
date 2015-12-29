package com.example;

import java.util.Arrays;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.inject.Inject;
import com.google.inject.Module;
import com.nhl.bootique.Bootique;
import com.nhl.bootique.jersey.JerseyModule;
import com.nhl.bootique.jopt.Args;

import static java.util.stream.Collectors.joining;

@Path("/hello")
@Produces("text/plain")
@Singleton
public class Application {

    public static void main(String[] args) throws Exception {

        // Application itself is a JAX RS resource, so register it with Jersey
        Module jersey = new JerseyModule().packageRoot(Application.class);

        // include our configured instance of JerseyModule,
        // all other modules will be included automatically from dependencies
        Bootique.app(args).modules(jersey).autoLoadModules().run();
    }

    @Args
    @Inject
    private String[] args;

    @GET
    public String get() {
        String allArgs = Arrays.asList(args).stream().collect(joining(" "));
        return "Hello! The app args were: " + allArgs;
    }
}
