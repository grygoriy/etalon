
<%@ page import="com.ca.etalon.School" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Список навчальних закладів</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">Новий заклад</g:link></span>
        </div>
        <div class="body">
            <h2>Список навчальних закладів</h2>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="name" title="Назва" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${schoolInstanceList}" status="i" var="schoolInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${schoolInstance.id}">${fieldValue(bean:schoolInstance, field:'id')}</g:link></td>
                        
                            <td>${fieldValue(bean:schoolInstance, field:'name')}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${schoolInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
