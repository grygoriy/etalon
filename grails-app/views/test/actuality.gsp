<%--
  Created by IntelliJ IDEA.
  User: grygoriy
  Date: Aug 31, 2009
  Time: 5:02:34 PM                      r
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.ca.etalon.test.actuality.ActualTest;" contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>  </title>
    <meta name="layout" content="main" />
  </head>
  <body>
  <g:form action="submitActuality">
    <g:if test="${hasErrors}">
      <div class="errors">
        Деякі відповіді не коректні
      </div>
    </g:if>

    <table>
      <tr>
        <td class="questions">Запитання</td>
        <td class="answers">Відповідь</td>
      </tr>
      <g:each in="${actuality.questions}" var="question">
          <tr>
            <td>
              <p class="floatLeft">${question.question.question}</p>
            </td>
            <td>
              <g:select
                      name="answer"
                      from="${ActualTest.getActualityAnswers()}"
                      optionKey="id" optionValue="answer"
                      noSelection="${['-1':'Виберіть відповідь...']}"
                      value="${question.answer}">

              </g:select>
            </td>
          </tr>
          <g:if test="${question.errorMessage}">
            <tr>
              <td>

              </td>
              <td>
                <div class="errors">
                  ${question.errorMessage}
                </div>
              </td>
            </tr>
          </g:if>
      </g:each>

    </table>
      <input type="hidden" name="profiler" value="1">
    <g:submitButton name="submitActuality" value="Закінчити тест"/>
  </g:form>
  </body>
</html>