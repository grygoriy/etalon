<%--
  Created by IntelliJ IDEA.
  User: grygoriy
  Date: Sep 6, 2009
  Time: 10:26:02 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.ca.etalon.test.yovayshy.YovayshyTest" contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Simple GSP page</title>
    <meta name="layout" content="main" />
  </head>
  <body>
  <g:if test="${hasErrors}">
    <div class="errors">
      Деякі відповіді не коректні
    </div>
  </g:if>
<g:form action="submitYovayshy" method="post">
  <table>
    <tr>
      <td>
        Запитання
      </td>
      <td>
        Відповідь
      </td>
    </tr>
    <g:each in="${yovayshyTest.processedQuestions}" var="processedQuestion">
      <tr>
        <td>
          ${processedQuestion.question.question} <BR/>
          A) ${processedQuestion.question.caseA} <BR/>
          Б) ${processedQuestion.question.caseB} <BR/>
        </td>
        <td>
          <g:select name="answer${processedQuestion.question.id}"
                    from="${yovayshyAnswers}"
                    optionKey="id"
                    optionValue="label"
                    noSelection="${['-10':'Виберіть відповідь...']}"
                    value="${processedQuestion.answer}"/>
        </td>
      </tr>
      <g:if test="${processedQuestion.errorMessage}">
        <tr>
          <td>

          </td>
          <td>
            <div class="errors">
              ${processedQuestion.errorMessage}
            </div>
          </td>
        </tr>
      </g:if>
    </g:each>
  </table>
    <g:submitButton name="submitYovayshy" value="Закінчити тест"/>
  </g:form>
  </body>
</html>