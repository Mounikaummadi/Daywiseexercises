<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	<form method="post" action="/register" modelAttribute="user">

		<div>
			Email : <input type="text" name="userEmail" />
		</div>
		<div>
		Username: <input type="text" name="userName" />
		</div>
		<div>
		Phone: <input type="text" name="userNumber" />
		</div>
			<div>
		<button type="submit">Submit</button>
</div>


	</form>


</body>
</html>