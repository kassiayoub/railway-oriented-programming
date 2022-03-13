package railway;

import java.util.function.Function;

public class Success<S,F> extends Result<S,F> {

    private final S value;

    public Success(S value){
        this.value = value;
    }

    @Override
    public <R> R either(Function<S, R> onSuccess, Function<F, R> __) {
        return onSuccess.apply(value);
    }
}
