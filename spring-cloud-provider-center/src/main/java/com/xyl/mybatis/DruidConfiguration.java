package com.xyl.mybatis;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class DruidConfiguration {
	
	private Logger logger = Logger.getLogger(DruidConfiguration.class);

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.driver-class-name}")
	private String driver;

	@Value("${spring.datasource.dbcp2.initial-size}")
	private Integer initialSize;

	@Value("${spring.datasource.dbcp2.min-idle}")
	private Integer minIdle;

	@Value("${spring.datasource.dbcp2.max-total}")
	private Integer maxActive;

	@Value("${spring.datasource.dbcp2.max-wait-millis}")
	private Integer maxWait;


	@Value("${spring.datasource.dbcp2.soft-min-evictable-idle-time-millis}")
	private Long minEvictableIdleTimeMillis;

	@Value("${spring.datasource.dbcp2.validation-query}")
	private String validationQuery;

	@Value("${spring.datasource.dbcp2.test-while-idle}")
	private Boolean testWhileIdle;

	@Value("${spring.datasource.dbcp2.test-on-borrow}")
	private Boolean testOnBorrow;

	@Value("${spring.datasource.dbcp2.test-on-return}")
	private Boolean testOnReturn;

	@Value("${spring.datasource.dbcp2.pool-prepared-statements}")
	private Boolean poolPreparedStatements;
	
	

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getDriver() {
		return driver;
	}

	public Integer getInitialSize() {
		return initialSize;
	}

	public Integer getMinIdle() {
		return minIdle;
	}

	public Integer getMaxActive() {
		return maxActive;
	}

	public Integer getMaxWait() {
		return maxWait;
	}

	

	public Long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public String getValidationQuery() {
		return validationQuery;
	}

	public Boolean getTestWhileIdle() {
		return testWhileIdle;
	}

	public Boolean getTestOnBorrow() {
		return testOnBorrow;
	}

	public Boolean getTestOnReturn() {
		return testOnReturn;
	}

	public Boolean getPoolPreparedStatements() {
		return poolPreparedStatements;
	}

	

	

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setInitialSize(Integer initialSize) {
		this.initialSize = initialSize;
	}

	public void setMinIdle(Integer minIdle) {
		this.minIdle = minIdle;
	}

	public void setMaxActive(Integer maxActive) {
		this.maxActive = maxActive;
	}

	public void setMaxWait(Integer maxWait) {
		this.maxWait = maxWait;
	}



	public void setMinEvictableIdleTimeMillis(Long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	public void setTestWhileIdle(Boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}

	public void setTestOnBorrow(Boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public void setTestOnReturn(Boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	public void setPoolPreparedStatements(Boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}

	

	
	
	@Bean(name = "dataSource")
	@Primary
	public DataSource getDataSource() {
		DruidDataSource dds = new DruidDataSource();
		dds.setUrl(url);
		dds.setUsername(username);
		dds.setPassword(password);
		dds.setDriverClassName(driver);
      //  logger.info("url=" + url + ", username=" + username  + ", password=" + password);
		// configuration
		dds.setInitialSize(initialSize);
		dds.setMinIdle(minIdle);
		dds.setMaxActive(maxActive);
		dds.setMaxWait(maxWait);
		dds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		dds.setValidationQuery(validationQuery);
		dds.setTestWhileIdle(testWhileIdle);
		dds.setTestOnBorrow(testOnBorrow);
		dds.setTestOnReturn(testOnReturn);
		dds.setPoolPreparedStatements(poolPreparedStatements);
		return dds;
	}
	
	
//    @Bean
//    public ServletRegistrationBean DruidStatViewServle(){
//       //org.springframework.boot.context.embedded.ServletRegistrationBean提供类的进行注册.
//       ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
//       //添加初始化参数：initParams
//       //白名单：
//      // servletRegistrationBean.addInitParameter("allow","127.0.0.1");
//       //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
//     //  servletRegistrationBean.addInitParameter("deny","192.168.1.73");
//       //登录查看信息的账号密码.
//       servletRegistrationBean.addInitParameter("loginUsername","admin");
//       servletRegistrationBean.addInitParameter("loginPassword","123456");
//       //是否能够重置数据.
//      // servletRegistrationBean.addInitParameter("resetEnable","false");
//       return servletRegistrationBean;
//    }

//
//    @Bean
//    public FilterRegistrationBean druidStatFilter(){
//       FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//       //添加过滤规则.
//       filterRegistrationBean.addUrlPatterns("/*");
//       //添加不需要忽略的格式信息.
//       filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//       return filterRegistrationBean;
//    }
}
