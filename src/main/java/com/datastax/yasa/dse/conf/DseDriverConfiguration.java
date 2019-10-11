package com.datastax.yasa.dse.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.dse.driver.api.core.DseSession;
import com.datastax.dse.driver.api.core.DseSessionBuilder;
import com.datastax.oss.driver.api.core.CqlIdentifier;

/**
 * The DSE (DataStax Enterprise) Driver configuration.
 * 
 * The above properties should be typically declared in an {@code application.yml} file.
 * 
 * @author DataStax Developer Advocates team.
 */
@Configuration
public class DseDriverConfiguration {

    /** Initialize dedicated connection to ETCD system. */
    private static final Logger LOGGER = LoggerFactory.getLogger(DseDriverConfiguration.class);
    
    @Value("${constellation.apollo.username}")
    public String userName;

    @Value("${constellation.apollo.password}")
    public String password;
    
    @Value("${constellation.apollo.keyspace}")
    public String keyspace;
    
    @Value("${constellation.apollo.zipfile}")
    public String securedBundleZipFile;

    /**
     * Returns the {@link DseSession} to use, configured with the provided {@link DseSessionBuilder session builder}. The returned
     * session will be automatically connected to the given keyspace.
     *
     * @param sessionBuilder
     *            The {@link DseSessionBuilder} bean to use.
     * @param keyspace
     *            The {@linkplain CqlIdentifier keyspace} bean to use.
     * @return The {@link DseSession} bean.
     */
    @Bean
    public DseSession session() {
        LOGGER.info("+ Connecting to Apollo on keyspace '{}'", keyspace);
        long start = System.currentTimeMillis();
        DseSession session = 
                DseSession.builder().withCloudSecureConnectBundle(securedBundleZipFile)
                .withAuthCredentials(userName,password)
                .withKeyspace(keyspace)
                .build();
        long stop = System.currentTimeMillis();
        LOGGER.info("+ Connection Sucessfully in {} millis' to {}", stop-start, session.getName());
        return session;
    }
    
}
