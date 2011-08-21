ruleset {

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/braces.xml') {
        'IfStatementBraces' {
            enabled = false
        }
    }
    ruleset('rulesets/design.xml')
//    ruleset('rulesets/dry.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {
        'BracesForIfElse' {
            enabled = false
        }
    }
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/grails.xml'){
                'GrailsDomainHasToString' {
                        enabled = false
                }
    }
    ruleset('rulesets/imports.xml')
    ruleset('rulesets/jdbc.xml')
    ruleset('rulesets/junit.xml') {
        'JUnitPublicNonTestMethod' {
            enabled = false
        }
    }
    ruleset('rulesets/logging.xml')
    ruleset('rulesets/naming.xml')
    ruleset('rulesets/security.xml')
    ruleset('rulesets/serialization.xml')
    ruleset('rulesets/size.xml')
    ruleset('rulesets/unnecessary.xml') {
        'UnnecessarySemicolon' {
            enabled = false
        }
        'UnnecessaryReturnKeyword' {
            enabled = false
        }
        'UnnecessaryElseStatement' {
            enabled = false
        }

    }
    ruleset('rulesets/unused.xml')
}