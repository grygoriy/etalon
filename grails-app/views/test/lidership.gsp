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
    <title>Лідерство</title>
    <meta name="layout" content="main" />
  </head>
  <body>
  <g:if test="${hasErrors}">
    <div class="errors">
      Деякі відповіді не коректні
    </div>
  </g:if>
<g:form action="submitLidership" method="post">
  <table>
    <tr>
      <td>

      </td>
      <td>
      </td>
    </tr>
    <tr>
      <td class="questions">Запитання</td>
      <td class="answers">Відповідь</td>
    </tr>
    <g:each in="${lidership.lidersiprocessQuestions}" var="processedQuestion">
      <tr>
        <td>
          <p class="floatLeft">${processedQuestion.lidershipQuestion.question}</p>
        </td>
        <td>
          <%
            String[] labels = new String[2];
            labels[0] = processedQuestion.lidershipQuestion.caseA
            labels[1] = processedQuestion.lidershipQuestion.caseB
            def name = "answer" + processedQuestion.lidershipQuestion.id 
          %>
          <g:radioGroup name="${name}" values="['1','2']" labels="${labels}" value="${processedQuestion.answer}">
            <p> ${it.radio} ${it.label}</p>
          </g:radioGroup>
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
    <g:submitButton name="submitLidership" value="Закінчити тест"/>
  </g:form>
  </body>
</html>