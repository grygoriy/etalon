<%--
  Created by IntelliJ IDEA.
  User: grygoriy
  Date: Aug 23, 2009
  Time: 9:38:15 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.ca.etalon.test.interestmap.IMTest" contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Карта інтересів</title>
        <meta name="layout" content="main" />
  </head>
  <body>
    <g:if test="${hasErrors}">
      <div class="errors">
        Деякі відповіді не коректні
      </div>
    </g:if>
    <g:form action="sumbitInterestMap" method="post">
      <table>
        <tr>
          <td class="answers">Питання</td>
          <td class="questions">Відповідь</td>
        </tr>
        <g:each in="${imTest.processedQuestions}" var="processedQuestion">
          <tr>
            <td>
              <p class="floatLeft">${processedQuestion.question.question}</p>
            </td>
            <td>
              <g:select
                      name="answer"
                      from="${imanswer}"
                      optionKey="id" optionValue="answer"
                      noSelection="${['-10':'Виберіть відповідь...']}"
                      value="${processedQuestion.answer}">

              </g:select>

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
      <g:submitButton name="sumbitInterestMap" value="Закінчити тест"/>
    </g:form>
  </body>
</html>