dataSource {
	pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			url = "jdbc:mysql://localhost/etalon?useUnicode=true&characterEncoding=utf-8"
            username = "root"
            password = ""
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:hsqldb:mem:testDb"
            username = "root"
            password = ""
		}
	}
	production {
		dataSource {
			url = ""
            username = ""
            password = ""
		}
	}
}