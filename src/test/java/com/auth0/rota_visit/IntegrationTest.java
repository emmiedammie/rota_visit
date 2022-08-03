package com.auth0.rota_visit;

import com.auth0.rota_visit.RotanvisitApp;
import com.auth0.rota_visit.config.AsyncSyncConfiguration;
import com.auth0.rota_visit.config.EmbeddedKafka;
import com.auth0.rota_visit.config.EmbeddedSQL;
import com.auth0.rota_visit.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { RotanvisitApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
