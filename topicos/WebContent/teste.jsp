<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
	String valorx = request.getParameter("inputx");
	String valory = request.getParameter("inputy");
	int soma = 0;
	
	if (valorx != null && !valorx.equals("") && valory != null && !valory.equals("")) {
		int inputx = Integer.parseInt(valorx);
		int inputy = Integer.parseInt(valory);
		
		soma = inputx + inputy;
	}
	
	
%>

<form> 

	<label>Input x</label>
	<input type="text" name="inputx" /> <br/>
	
	<label>Input y</label>
	<input type="text" name="inputy" /> <br/>
	
	<input type="text" name="resultado" value="<%= soma %>"/> <br/>
	
	<input type="submit" value="Submeter" />
	
</form>

</body>
</html>