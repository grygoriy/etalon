<%--
  Created by IntelliJ IDEA.
  User: grygoriy
  Date: Aug 31, 2009
  Time: 5:02:34 PM                      r
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>  </title>
    <meta name="layout" content="main" />
  </head>
  <body>
  <g:form action="submitHolland">
    <g:if test="${hasErrors}">
      <div class="errors">
        Деякі відповіді не коректні
      </div>
    </g:if>
    Відмітьте ВСІ твердження які відповідають Вам особисто:
    <table>
      <tr>
        <td class="questions">Запитання</td>
        <td class="answers">Відповідь</td>
      </tr>
      <tr>
        <td colspan="2">
          <h3>Мені  подобаються такі види діяльності:</h3>          
        </td>
      </tr>
      <g:each in="${iLikeIt}" var="question">
        <tr>
          <td>
            ${question.question}
          </td>
          <td>
            <g:checkBox name="question${question.id}"/>
          </td>
        </tr>
      </g:each>
      <tr>
        <td colspan="2">
          <h3>Якщо  це буде потрібно, я зможу виконати грамотно і компетентно:</h3>
        </td>
      </tr>
      <g:each in="${iCanDoIt}" var="question">
        <tr>
          <td>
            ${question.question}
          </td>
          <td>
            <g:checkBox name="question${question.id}"/>
          </td>
        </tr>
      </g:each>
      <tr>
        <td colspan="2">
          <h3>Вам подобаються такі професії...</h3>
        </td>
      </tr>
      <g:each in="${proffetion}" var="question">
        <tr>
          <td>
            ${question.question}
          </td>
          <td>
            <g:checkBox name="question${question.id}"/>
          </td>
        </tr>
      </g:each>
    </table>
      <input type="hidden" name="profiler" value="1">
    <g:submitButton name="submitHolland" value="Закінчити тест"/>
  </g:form>
  </body>
</html>