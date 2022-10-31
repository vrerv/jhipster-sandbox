package co.vrerv.eva01;

import co.vrerv.eva01.Eva01App;
import co.vrerv.eva01.config.AsyncSyncConfiguration;
import co.vrerv.eva01.config.EmbeddedElasticsearch;
import co.vrerv.eva01.config.EmbeddedKafka;
import co.vrerv.eva01.config.EmbeddedRedis;
import co.vrerv.eva01.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Eva01App.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
