package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logger {

    final private Logger LOG = LoggerFactory.getLogger(logger.class);

    logger(){
        LOG.info("logger created");
        LOG.warn("logger created");
        LOG.error("logger created");
        LOG.debug("logger created");
        LOG.trace("logger created");
    }
}
