
<%@ page import="com.ca.etalon.School" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Створити навчальний заклад</title>         
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Список навчальних закладів</g:link></span>
        </div>
        <div class="body">
            <h2>Створити навчальний заклад</h2>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${schoolInstance}">
            <div class="errors">
                <g:renderErrors bean="${schoolInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name">Назва:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:schoolInstance,field:'name','errors')}">
                                    <input type="text" id="name" name="name" value="${fieldValue(bean:schoolInstance,field:'name')}"/>
                                </td>
                            </tr> 
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="Створити" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
