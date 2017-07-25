package com.deegeu.trivia;

import com.deegeu.utilities.git.RepositoryUtils;
import java.util.Date;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@ApplicationPath("/trivia")
@Path("")
public class TriviaApp extends Application {

    public Response getDirectory(UriInfo uri) {
        Link selfLink = Link.fromUri(uri.getBaseUri())
                .rel("self")
                .type(MediaType.APPLICATION_JSON)
                .build();
        Link questionLink = Link.fromUri(uri.getBaseUri() + "qiestions")
                .rel("questiona")
                .type(MediaType.APPLICATION_JSON)
                .build();
        
        return Response.ok()
                .lastModified(new Date())
                .header("trivia-version", RepositoryUtils.getGitRepositoryState().getBuildVersion())
                .location(uri.getRequestUri())
                .links(selfLink, questionLink)
                .build();
    }
}
