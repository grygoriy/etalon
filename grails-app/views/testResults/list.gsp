
<%@ page import="com.ca.etalon.result.TestResults" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Адміністративна частина :: Результати тестування</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
        </div>
        <div class="body">
            <h2>Результати тестування</h2>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                            <g:sortableColumn property="studentName" title="Ім'я учня" />
                            <g:sortableColumn property="school" title="Школа" />
                            <g:sortableColumn property="dateCreated" title="Дата проведення" />
                            
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${testResultsInstanceList}" status="i" var="testResultsInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td>
                              <g:link action="show" id="${testResultsInstance.id}">${fieldValue(bean:testResultsInstance, field:'studentName')}</g:link>
                            </td>
                            <td>${fieldValue(bean:testResultsInstance, field:'school')}</td>
                            <td>${fieldValue(bean:testResultsInstance, field:'dateCreated')}</td>

                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${testResultsInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
