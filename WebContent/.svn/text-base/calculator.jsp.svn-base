<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Calculator</title>

<style>

body {
    font-family: Montserrat;
}

.login-block {
    width: 320px;
    padding: 20px;
    background: #ffeeff;
    border-radius: 5px;
    border-top: 5px solid #ff656c;
    border-bottom: 5px solid #ff656c;
    margin: 0 auto;
}

.login-block h1 {
    text-align: center;
    color: #000;
    font-size: 18px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.login-block input {
    width: 100%;
    height: 42px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 14px;
    font-family: Montserrat;
    padding: 0 20px 0 50px;
    outline: none;
}

.login-block select {
    width: 100%;
    height: 42px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 14px;
    font-family: Montserrat;
    padding: 0 20px 0 50px;
    outline: none;
}

.login-block label {
	 width: 100%;
    margin-bottom: 20px;
    font-size: 14px;
    font-family: Montserrat;
    padding: 0 0 0 10px;
    outline: none;
}

.login-block input:active, .login-block input:focus {
    border: 1px solid #ff656c;
}

.login-block button {
    width: 60%;
    height: 40px;
    background: #ff656c;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #e15960;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    font-size: 14px;
    font-family: Montserrat;
    outline: none;
    cursor: pointer;
}

.login-block button:hover {
    background: #ff7b81;
}

</style>

</head>
<body>
<div class="login-block">
	<form action="CalculatorServlet" method="POST">
		<table border="0">
			<thead>
				<tr>
					<td colspan="2">
						<label><h2>Calculator</h2></label>
					</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td width="100"><label>1st Number:</label></td>
					<td><input type="text" name="firstNumber" value="<%=request.getParameter("firstNumber") == null ? "" : request.getParameter("firstNumber") %>"></td>

				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td><label style="font-family: Arial; font-size: 13px;">Operation:</label>
					</td>
					<td><select name="operation">
							<option value="1" <%= "1".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Adunare</option>
							<option value="2" <%= "2".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Scadere</option>
							<option value="3" <%= "3".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Inmultire</option>
							<option value="4" <%= "4".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Impartire</option>
							<option value="5" <%= "5".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Exponent</option>
							<option value="6" <%= "6".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Media aritmetica</option>
							<option value="7" <%= "7".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Minimul</option>
							<option value="8" <%= "8".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Maximul</option>
							<option value="9" <%= "9".equals(request.getParameter("operation")) ? "selected='true'" : "" %>>Restul impartirii</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td><label>2nd Number:</label></td>
					<td><input type="text" name="secondNumber" value="<%=request.getParameter("secondNumber") == null ? "" : request.getParameter("secondNumber") %>"></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><button>Calculate</button></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td><label style="font-family: Arial; font-size: 14px;"><b>Result:</b></label>
					</td>
					<td>
						<div id="result"><b><%=request.getAttribute("result") == null ? "" : request.getAttribute("result") %></b></div>
					</td>
				</tr>

			</tbody>
		</table>
	</form>
	</div>
</body>
</html>