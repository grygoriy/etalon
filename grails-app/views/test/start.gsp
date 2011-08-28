<%--
  Created by IntelliJ IDEA.
  User: grygoriy
  Date: Aug 22, 2009
  Time: 4:04:14 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Початок тестування</title>
    <meta name="layout" content="main" />
  
  </head>
  <body>
  <g:if test="${flash.message}">
    <div class="errors">${flash.message}</div>
  </g:if>

    <g:form action="submitInitials" method="post">
      <table>
       <tr>
         <td>
           Ваше ім'я
         </td>
         <td>
           <g:textField name="student" value="${name}"/>
         </td>
       </tr>
       <tr>
         <td>
           Школа
         </td>
         <td>
           <g:select name="schoolId" from="${com.ca.etalon.School.list()}"
                     optionKey="id" optionValue="name"
                     noSelection="${['-1':'Виберіть школу...']}">

           </g:select>
         </td>
       </tr>                                                                     
      </table>
        <input type="hidden" name="profiler" value="1">
      <g:submitButton name="submitInitials" value="Почати"/>
      </g:form>
  </body>
</html>