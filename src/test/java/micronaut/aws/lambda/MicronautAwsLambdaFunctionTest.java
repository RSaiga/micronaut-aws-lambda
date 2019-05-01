package micronaut.aws.lambda;

import io.micronaut.test.annotation.MicronautTest;
import micronaut.aws.lambda.presentation.view.MicronautAwsLambda;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class MicronautAwsLambdaFunctionTest {

    @Inject
    MicronautAwsLambdaClient client;

    @Test
    public void testFunction() throws Exception {
    	MicronautAwsLambda body = new MicronautAwsLambda();
    	body.setName("micronaut-aws-lambda");
        assertEquals("micronaut-aws-lambda", client.apply(body).blockingGet().getName());
    }
}
