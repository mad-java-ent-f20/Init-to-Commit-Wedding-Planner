package edu.matc.persistence;

import edu.matc.controller.SendEmail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


/**
 * The type Send email smtp test.
 */

class SendEmailTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    void getResponseSuccess() {
        SendEmail send = new SendEmail();
        send.getInfo("hi", "testing");
    }
}

