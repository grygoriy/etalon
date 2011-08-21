package com.ca.etalon.result

import grails.plugins.springsecurity.Secured

@Secured(["ROLE_ADMINISTRATOR"])
class TestResultsController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    static allowedMethods = [delete:'POST', save:'POST', update:'POST']

      def list = {
        params.max = Math.min( params.max ? params.max.toInteger() : 10,  100)
        [ testResultsInstanceList: TestResults.list(), testResultsInstanceTotal: TestResults.count() ]
    }

    def show = {
      TestResults testResults = TestResults.findById(params.id)
      return [testResults:testResults]
    }                                                           

    def delete = {
      redirect(action:"list")
    }

    def edit = {
      redirect(action:"list")
    }

    def update = {
      redirect(action:"list")

    }



}
