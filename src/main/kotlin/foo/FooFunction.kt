package foo

import io.micronaut.function.FunctionBean
import java.util.function.Supplier

@FunctionBean("foo")
class FooFunction : Supplier<String> {

    override fun get(): String {
        return "foo"
    }
}