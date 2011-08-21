
<%@ page import="com.ca.etalon.result.TestResults" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <title>Show TestResults</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list">Список результатів тестування</g:link></span>
            <!-- <span class="menuButton"><g:link class="create" action="create">New TestResults</g:link></span> -->
        </div>
        <div class="body">
            <h2>Результати тестування</h2>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <ul>
              <li><strong>Ім'я</strong>: ${testResults.studentName}</li>
              <li><strong>Школа</strong>: ${testResults.school}</li>
              <li><strong>Дата проведення тестування</strong>: ${testResults.dateCreated}</li>
             </ul>
              <p>Основний профіль</p>
            <div class="dialog">
              Карта Інтересів
              <table>
                <g:each in="${testResults.imResults}" var="imResult" >
                  <tr>
                    <td>
                      ${imResult.category.name}
                    </td>
                    <td>
                      ${imResult.result}
                    </td>
                  </tr>
                </g:each>
              </table>
              <br/>
            </div>
            <div class="dialog">
              <table>
                <tr>
                  <td>
                    <p>Самоактулізація:</p>
                  </td>
                  <td>
                     ${testResults.actualityResults}
                  </td>
                </tr>
              </table>
            </div>

          <div class="dialog">
          Опитувальник Йовайши
            <table>
              <g:each in="${testResults.yovayshyResult.sphereResults}" var="sphereResult">
                <tr>
                  <td>
                    ${sphereResult.sphere.message}
                  </td>
                  <td>
                    ${sphereResult.score}
                  </td>
                </tr>
              </g:each>
            </table>
          </div>
          <g:if test="${testResults.lidershipResult}">
          <div class="dialog">
            <strong>Розширене тестування</strong>
            <table>
              <tr>
                <td>
                  Діагностика лідерських здібностей 
                </td>
                <td>

                </td>
                </tr>
                <tr>
                <td>
                  ${testResults.lidershipResult.message}
                </td>
                <td>
                   ${testResults.lidershipResult.score}
                </td>
              </tr>
            </table>

          </div>
          </g:if>
          <g:if test="${testResults.motivationResult}">
          <div class="dialog">
            <table>
              <tr>
                <td>
                  Методика «Мотиви  вибору професії» 
                </td>
                <td>

                </td>
              </tr>
              <tr>
                <td>
                  обрана спеціальність
                </td>
                <td>
                  ${testResults.motivationResult.speciality}                
                </td>
              </tr>
              <g:each in="${testResults.motivationResult.vectorResults}" var="vectorResult">
                <tr>
                  <td>
                    ${vectorResult.motivationVector.message}
                  </td>
                  <td>
                    ${vectorResult.score}
                  </td>
                </tr>
              </g:each>
            </table>

          </div>
            </g:if>

          <g:if test="${testResults.hollandResults}">

            <table>
              <tr>
                <td colspan="2">Методика Хланда</td>
              </tr>
              <tr>
                <td>
                  Тип
                </td>
                <td>
                  Кількість тверджень
                </td>
              </tr>
              <g:each in="${testResults.hollandResults}" var="result">
                <tr>
                <td>
                  ${result.type.message}
                </td>
                <td>
                  ${result.score}
                </td>
                </tr>
              </g:each>
              <tr>

              </tr>
            </table>
          </g:if>
        </div>
    </body>
</html>
