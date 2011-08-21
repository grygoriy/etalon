<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="layout" content="main" />
  <title>Login</title>
</head>
<body>
  <g:if test="${flash.message}">
    <div class="message">${flash.message}</div>
  </g:if>
  <g:form action="signIn">
    <input type="hidden" name="targetUri" value="${targetUri}" />
    <table class="login">
      <tbody>
        <tr>
          <td><p class="floatRight">Користувач</p></td>
          <td><input class="login" type="text" name="username" value="${username}" /></td>
        </tr>
        <tr>
          <td><p class="floatRight">Пароль</p></td>
          <td><input class="login" type="password" name="password" value="" /></td>
        </tr class="floatRight">
        <tr>
          <td class="default"><p class="floatRight">Запам'ятати?</p></td>
          <td><g:checkBox name="rememberMe" value="${rememberMe}" /></td>
        </tr>
        <tr>
          <td />
          <td><input type="submit" value="Залогуватися" /></td>
        </tr>
      </tbody>
    </table>
  </g:form>
</body>
</html>
