
<%@ page import="com.ca.etalon.School" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Навчальні заклади</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Список навчальних закладів</g:link></span>
            <span class="menuButton"><g:link class="create" action="create">Створити новий</g:link></span>
        </div>
        <div class="body">
            <h2>Навчальні заклади</h2>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>

                    
                        <tr class="prop">
                            <td valign="top" class="name">Id:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:schoolInstance, field:'id')}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name">Назва:</td>
                            
                            <td valign="top" class="value">${fieldValue(bean:schoolInstance, field:'name')}</td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <input type="hidden" name="id" value="${schoolInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" value="Редагували" /></span>
                    <span class="button"><g:actionSubmit class="delete" onclick="return confirm('Are you sure?');" value="Видалити" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
