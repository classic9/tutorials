package org.baeldung.ex.dataIntegrityviolationexception;

import org.baeldung.ex.dataIntegrityviolationexception.spring.Cause3DataContextWithJavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Cause3DataContextWithJavaConfig.class }, loader = AnnotationConfigContextLoader.class)
public class Cause3DataIntegrityViolationExceptionIntegrationTest {

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        //
    }

}
