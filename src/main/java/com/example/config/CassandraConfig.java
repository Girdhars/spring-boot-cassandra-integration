package com.example.config;
import java.util.Arrays;
import java.util.List;

import org.springframework.cassandra.core.keyspace.CreateKeyspaceSpecification;
import org.springframework.cassandra.core.keyspace.DropKeyspaceSpecification;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;


@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

	//@Value("${spring.data.cassandra.keyspace-name}")
	//public String KEYSPACE;
	
	public static final String KEYSPACE = "customer_keyspace";

    @Override
    protected String getKeyspaceName() {
        return KEYSPACE;
    }
    
    /*@Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }
*/
   /* @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE);

        return Arrays.asList(specification);
    }

    @Override
    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.example.domain"};
    }*/
}