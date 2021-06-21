package empapp;

import java.net.URI;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class NotFoundException extends AbstractThrowableProblem {

    public NotFoundException(String message) {
        super(URI.create("not-found"), "Not found", Status.NOT_FOUND, message);
    }
}
