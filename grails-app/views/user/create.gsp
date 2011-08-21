
<%@ page import="com.ca.etalon.User" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Адміністративна частина :: Список користувачів</title>         
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Список користувачів</g:link></span>
        </div>
        <div class="body">
            <h2>Створити користувача</h2>
            <g:if test="${flash.message}">
              <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${userInstance}">
            <div class="errors">
                <g:renderErrors bean="${userInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="login">Логін:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:userInstance,field:'login','errors')}">
                                    <input type="text" maxlength="15" id="login" name="login" value="${fieldValue(bean:userInstance,field:'login')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name">Ім'я:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:userInstance,field:'name','errors')}">
                                    <input type="text" maxlength="20" id="name" name="name" value="${fieldValue(bean:userInstance,field:'name')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="password">Пароль:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:userInstance,field:'password','errors')}">
                                    <input type="text" id="password" name="password" value="${fieldValue(bean:userInstance,field:'password')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="email">Email:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:userInstance,field:'email','errors')}">
                                    <input type="text" id="email" name="email" value="${fieldValue(bean:userInstance,field:'email')}"/>
                                </td>
                            </tr> 
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="role">Роль:</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean:userInstance,field:'role','errors')}">
                                    <g:select optionKey="id" from="${com.ca.etalon.Role.list()}" name="role.id" value="${userInstance?.role?.id}" ></g:select>
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
