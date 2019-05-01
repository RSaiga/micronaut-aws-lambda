package micronaut.aws.lambda.presentation.view;

import io.micronaut.core.annotation.*;

@Introspected
public class MicronautAwsLambda {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

