package railway;

import java.util.function.Function;

public abstract class Result<S, F> {

    public abstract <R> R either(Function<S, R> onSuccess, Function<F, R> onFailure);
}
