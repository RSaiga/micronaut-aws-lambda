package micronaut.aws.lambda.presentation.function;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;
import micronaut.aws.lambda.presentation.view.MicronautAwsLambda;

import java.io.IOException;
import java.util.function.Function;

@FunctionBean("micronaut-aws-lambda")
public class MicronautAwsLambdaFunction extends FunctionInitializer implements Function<MicronautAwsLambda, MicronautAwsLambda> {

    @Override
    public MicronautAwsLambda apply(MicronautAwsLambda msg) {
         return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        MicronautAwsLambdaFunction function = new MicronautAwsLambdaFunction();
        function.run(args, (context)-> function.apply(context.get(MicronautAwsLambda.class)));
    }    
}

