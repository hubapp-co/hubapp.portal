package com.nebula.hub.CRUDDemo.configs;
/*
 * package com.luv2code.springboot.CRUDDemo.configs;
 * 
 * import java.util.HashMap;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.core.env.Environment; import
 * org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource; import
 * org.springframework.orm.jpa.JpaTransactionManager; import
 * org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean; import
 * org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter; import
 * org.springframework.transaction.PlatformTransactionManager;
 * 
 * @Configuration
 * 
 * @EnableJpaRepositories(basePackages =
 * {"com.luv2code.springboot.CRUDDemo.dao"}, entityManagerFactoryRef =
 * "db2EntityManager", transactionManagerRef = "db2TransactionManager") public
 * class DB2_DataSource {
 * 
 * @Autowired private Environment env;
 * 
 * @SuppressWarnings("unchecked")
 * 
 * @Bean public LocalContainerEntityManagerFactoryBean db2EntityManager() {
 * LocalContainerEntityManagerFactoryBean em = new
 * LocalContainerEntityManagerFactoryBean(); em.setDataSource(db2Datasource());
 * em.setPersistenceUnitName("db2EntityManager"); HibernateJpaVendorAdapter
 * vendorAdapter = new HibernateJpaVendorAdapter();
 * em.setJpaVendorAdapter(vendorAdapter);
 * 
 * @SuppressWarnings("rawtypes") HashMap properties = new HashMap();
 * properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
 * properties.put("hibernate.show-sql", env.getProperty("jdbc.show-sql"));
 * em.setJpaPropertyMap(properties); return em; }
 * 
 * @Bean public DataSource db2Datasource() { DriverManagerDataSource dataSource
 * = new DriverManagerDataSource();
 * dataSource.setUrl(env.getProperty("db2.datasource.url"));
 * dataSource.setUsername(env.getProperty("db2.datasource.username"));
 * dataSource.setPassword(env.getProperty("db2.datasource.password"));
 * 
 * return dataSource; }
 * 
 * @Bean public PlatformTransactionManager db2TransactionManager() {
 * JpaTransactionManager transactionManager = new JpaTransactionManager();
 * transactionManager.setEntityManagerFactory( db2EntityManager().getObject());
 * return transactionManager; } }
 */