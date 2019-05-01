package micronaut.aws.lambda;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import micronaut.aws.lambda.presentation.view.MicronautAwsLambda;

import javax.inject.Named;

@FunctionClient
public interface MicronautAwsLambdaClient {

    @Named("micronaut-aws-lambda")
    Single<MicronautAwsLambda> apply(@Body MicronautAwsLambda body);

}
