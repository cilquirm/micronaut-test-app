package foo

import io.micronaut.function.client.FunctionClient
import io.reactivex.Single
import javax.inject.Named

@FunctionClient
interface FooClient {

    @Named("foo")
    fun index(): Single<String>

}
