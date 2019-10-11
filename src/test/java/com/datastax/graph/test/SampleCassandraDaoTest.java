package com.datastax.graph.test;

import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.datastax.yasa.dse.conf.DseDriverConfiguration;
import com.datastax.yasa.dse.dao.CassandraDao;

@RunWith(JUnitPlatform.class)
@ExtendWith(SpringExtension.class)
@TestPropertySource(locations="/yasa.properties")
@ContextConfiguration(classes={DseDriverConfiguration.class,CassandraDao.class})
@Ignore
public class SampleCassandraDaoTest {
    
    @Autowired
    protected CassandraDao cassandraDao;
    
    @Test
    public void testTable() throws Exception {
        System.out.println(
                cassandraDao.listTablesNamesByKeySpace("ff4j")
                            .collect(Collectors.toList()));
    }
   
    
        
}
