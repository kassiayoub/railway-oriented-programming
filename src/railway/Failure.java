package railway;

import java.util.function.Function;

public class Failure<S,F> extends Result<S,F> {

    private final F value;

    public Failure(F value){
        this.value = value;
    }

    @Override
    public <R> R either(Function<S, R> __, Function<F, R> onFailure) {
        return onFailure.apply(value);
    }
}
