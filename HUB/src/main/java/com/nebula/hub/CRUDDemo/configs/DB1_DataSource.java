package com.nebula.hub.CRUDDemo.configs;
/*
 * package com.luv2code.springboot.CRUDDemo.configs;
 * 
 * import java.util.HashMap;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration; import
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
 * @EnableAutoConfiguration
 * 
 * @EnableJpaRepositories(basePackages = {
 * "com.luv2code.springboot.CRUDDemo.dao.EmployeeRepository" },
 * entityManagerFactoryRef = "db1EntityManager", transactionManagerRef =
 * "db1TransactionManager") public class DB1_DataSource {
 * 
 * @Autowired private Environment env;
 * 
 * @Bean public LocalContainerEntityManagerFactoryBean db1EntityManager() {
 * LocalContainerEntityManagerFactoryBean em = new
 * LocalContainerEntityManagerFactoryBean(); em.setDataSource(db1Datasource());
 * em.setPackagesToScan(new String[] { "com.luv2code.springboot.CRUDDemo.dao"
 * }); em.setPersistenceUnitName("db1EntityManager"); HibernateJpaVendorAdapter
 * vendorAdapter = new HibernateJpaVendorAdapter();
 * em.setJpaVendorAdapter(vendorAdapter); HashMap<String, Object> properties =
 * new HashMap<>(); properties.put("hibernate.hbm2ddl.auto",
 * env.getProperty("hibernate.hbm2ddl.auto"));
 * properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
 * em.setJpaPropertyMap(properties); return em; }
 * 
 * @Bean public DataSource db1Datasource() {
 * 
 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
 * dataSource.setDriverClassName(env.getProperty(
 * "spring.datasource.driver-class-name"));
 * dataSource.setUrl(env.getProperty("spring.datasource.url"));
 * dataSource.setUsername(env.getProperty("spring.datasource.username"));
 * dataSource.setPassword(env.getProperty("spring.datasource.password"));
 * 
 * return dataSource; }
 * 
 * @Bean public PlatformTransactionManager db1TransactionManager() {
 * 
 * JpaTransactionManager transactionManager = new JpaTransactionManager();
 * transactionManager.setEntityManagerFactory(db1EntityManager().getObject());
 * return transactionManager; } }
 */