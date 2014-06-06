
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

// environment specific settings
environments {
	development {
		dataSource {
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://127.0.0.1/testdb"
			dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
			username = "yourlogin"
			password = "yourpassword"
			properties {
				maxActive = 50
				maxIdle = 25
				minIdle = 5
				initialSize = 5
				maxWait = 10000
				minEvictableIdleTimeMillis=60000
				timeBetweenEvictionRunsMillis=60000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1"
			}
		}
		dataSource_user {
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://127.0.0.1/testuser"
			dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
			username = "yourlogin"
			password = "yourpassword"
			properties {
				maxActive = 50
				maxIdle = 25
				minIdle = 5
				initialSize = 5
				maxWait = 10000
				minEvictableIdleTimeMillis=60000
				timeBetweenEvictionRunsMillis=60000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1"
			}
		}
	}
	production {
		dataSource {
			pooled = true
			dbCreate = "update"
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://127.0.0.1/testdb"
			dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
			username = "yourlogin"
			password = "yourpassword"
			properties {
				maxActive = 50
				maxIdle = 25
				minIdle = 5
				initialSize = 5
				maxWait = 10000
				minEvictableIdleTimeMillis=60000
				timeBetweenEvictionRunsMillis=60000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1"
			}
		}
		dataSource_user {
			pooled = true
			dbCreate = "update"
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://127.0.0.1/testuser"
			dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
			username = "yourlogin"
			password = "yourpassword"
			properties {
				maxActive = 50
				maxIdle = 25
				minIdle = 5
				initialSize = 5
				maxWait = 10000
				minEvictableIdleTimeMillis=60000
				timeBetweenEvictionRunsMillis=60000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1"
			}
		}
	}
}
