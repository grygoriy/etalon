
<%@ page import="com.ca.etalon.result.TestResults" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Edit TestResults</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">TestResults List</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">New TestResults</g:link></span>
        </div>
        <div class="body">
            <h1>Edit TestResults</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${testResultsInstance}">
            <div class="errors">
                <g:renderErrors bean="${testResultsInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <input type="hidden" name="id" value="${testResultsInstance?.id}" />
                <input type="hidden" name="version" value="${testResultsInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="dateCreated">Date Created:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:testResultsInstance,field:'dateCreated','errors')}">
                                    <g:datePicker name="dateCreated" value="${testResultsInstance?.dateCreated}" precision="minute" ></g:datePicker>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="imResults">Im Results:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:testResultsInstance,field:'imResults','errors')}">
                                    <g:select name="imResults"
from="${com.ca.etalon.result.IMResult.list()}"
size="5" multiple="yes" optionKey="id"
value="${testResultsInstance?.imResults}" />

                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="school">School:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:testResultsInstance,field:'school','errors')}">
                                    <input type="text" id="school" name="school" value="${fieldValue(bean:testResultsInstance,field:'school')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="studentName">Student Name:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:testResultsInstance,field:'studentName','errors')}">
                                    <input type="text" id="studentName" name="studentName" value="${fieldValue(bean:testResultsInstance,field:'studentName')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" value="Update" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Delete" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
