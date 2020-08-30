package Indhu;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("Indhu")
public class DBConfiguration 
{
	@Bean(name="dataSource")
	public DataSource getDatasource()
	{
	DriverManagerDataSource  datasource=new DriverManagerDataSource();
	datasource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	datasource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=indhu");
    datasource.setUsername("sample");
	datasource.setPassword("sample");

    System.out.println("===Creating DataSource Bean==");
	return datasource;
}
		
	@Bean(name="SessionFactory")
	public SessionFactory getsessionFactory() 
	{
	Properties hibernateproperties=new Properties();
	hibernateproperties.put("hibernate.hbm2ddl.auto","update");
	hibernateproperties.put("hibernate.dialect","org.hibernate.dialect.SQLServerDialect");
	hibernateproperties.put("hibernate.show_sql", true);
	hibernateproperties.put("hibernate.format_sql", true);
	LocalSessionFactoryBuilder factory1=new LocalSessionFactoryBuilder
					(this.getDatasource());
	factory1.addProperties(hibernateproperties)	;
	factory1.addAnnotatedClass(Employee.class);
	SessionFactory sessionFactory=factory1.buildSessionFactory();
	System.out.println("Session is created");
    return sessionFactory;
		
		}
		
		
	  @Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransactionManager
		(SessionFactory sessionFactory)
		{
			System.out.println("Creating the TransactionManager Bean");
			return new HibernateTransactionManager(sessionFactory);
			
		}
	
	
}
