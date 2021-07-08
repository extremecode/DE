package com.de.use.cases.api.gateway;



import io.undertow.Undertow;
import io.undertow.server.handlers.resource.PathResourceManager;
import java.nio.file.Paths;
import static io.undertow.Handlers.resource;

public class FileServer {

    public static void main(final String[] args) {
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "10.22.22.43")
                .setHandler(resource(new PathResourceManager(Paths.get(System.getProperty("user.home")), 100))
                        .setDirectoryListingEnabled(true))
                .build();
        server.start();
    }

}
