grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
codenarc.ruleSetFiles="file:grails-app/conf/CodeNarcRuleSet.groovy"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

      runtime 'mysql:mysql-connector-java:5.1.9'
         test 'org.seleniumhq.selenium:selenium-firefox-driver:latest.release'
         test 'org.seleniumhq.selenium:selenium-chrome-driver:latest.release'
         test 'org.seleniumhq.selenium:selenium-ie-driver:latest.release'
         test('org.seleniumhq.selenium:selenium-htmlunit-driver:latest.release') {
             exclude 'xml-apis'
         }

    }
}
