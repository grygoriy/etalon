dataSource {
	pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "root"
	password = ""
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
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:hsqldb:mem:testDb"
		}
	}
	production {
		dataSource {
			url = "jdbc:mysql://localhost/etalon?useUnicode=true&characterEncoding=utf-8"
            username = "root"
            password = "qOIwuEU62v"
		}
	}
}