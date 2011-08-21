<%--
  Created by IntelliJ IDEA.
  User: grygoriy
  Date: Oct 13, 2009
  Time: 11:59:11 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Simple GSP page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main" />
  </head>
  <body>
  <g:if test="${flash.message}">
    <div class="errors">${flash.message}</div>
  </g:if>

    <g:form action="submitValidateMajorTest">
      <table>
        <tr>
          <td>
            Введіть будь-ласка пароль для користувача <jsec:principal/> 
          </td>
        </tr>
        <tr>
          <td>
            <g:passwordField name="password" value=""/>
          </td>
        </tr>
        <tr>
          <td>
            <g:submitButton name="submitValidateMajorTest" value="Ok"/>
          </td>
        </tr>
      </table>
    </g:form>
  </body>
</html>