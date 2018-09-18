package foo

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals


class FooFunctionTest: Spek({

    describe("foo function") {
        val server = ApplicationContext.run(EmbeddedServer::class.java)
        val client = server.applicationContext.getBean(FooClient::class.java)

        it("should return 'foo'") {
            assertEquals(client.index().blockingGet(), "foo")
        }

        afterGroup {
            server.stop()
        }
    }
})
