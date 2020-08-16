<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>DigiLearn for ADM HackEd</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
</head>
<body style="background-color: #eee;">
	<div class="container">
		<nav class="navbar navbar-dark navbar-expand-sm bg-dark fixed-top">
			<div class="container">
				<a href="#" class="navbar-brand">DigiLearn for ADM HackEd</a>
			</div>
		</nav>
	</div>
	<div style="margin-top: 80px;"></div>
	<div class="container ">
	<form:form modelAttribute="home" action="/goto" method="post">
			<div class="form-group">
				<form:label path="coursename" for="coursename">SEARCH COURSE</form:label>
				<form:select path="coursename" name="coursename" id="coursename"
					class="form-control" placeholder="Select Course Name">
					<form:option value="NONE" label="Select Course Name"></form:option>
					<form:options items="${courses}"/>
					</form:select>
			</div>
			<div class="form-row">
				<div class="col">
					<button type="submit" class="btn btn-success btn-block">Open Course</button>
				</div>
				<div class="col">
					<button type="reset" class="btn btn-warning btn-block">Reset</button>
				</div>
			</div>
			
		</form:form>
		<form:form modelAttribute="home" action="/submit" method="post">
			<div class="form-group ">
				<form:label path="name" for="name">EMPLOYEE NAME</form:label>
				<form:input path="name" name="name" id="name" class="form-control"
					placeholder="Enter Your Name"/>
			</div>
			<div class="form-group">
				<form:label path="employeeid" for="employeeid">EMPLOYEEID</form:label>
				<form:input path="employeeid" name="employeeid" id="employeeid"
					class="form-control" placeholder="Enter Your EmployeeID"/>
			</div>
			<div class="form-group">
				<form:label path="interests" for="interests">INTERESTS</form:label>
				<form:input path="interests" name="interests" id="interests"
					class="form-control" placeholder="Enter Your Interests separated by comma"/>
			</div>
			<div class="form-row">
				<div class="col">
					<button type="submit" class="btn btn-success btn-block">Show courses based on interests</button>
				</div>
				<div class="col">
					<button type="reset" class="btn btn-warning btn-block">Reset</button>
				</div>
			</div>
			
		</form:form>
		<form:form modelAttribute="home" action="/submitProject" method="post">
			<div class="form-group">
				<form:label path="projectid" for="projectid">PROJECTID</form:label>
				<form:input path="projectid" name="projectid" id="projectid"
					class="form-control" placeholder="Enter Your ProjectID"/>
			</div>
			<div class="form-row">
				<div class="col">
					<button type="submit" class="btn btn-success btn-block">Show courses based on project</button>
				</div>
				<div class="col">
					<button type="reset" class="btn btn-warning btn-block">Reset</button>
				</div>
			</div>
			
		</form:form>
	</div>
	<div class="container">
		<nav class="navbar navbar-dark bg-dark fixed-bottom">
			<div class="container">
				<a href="#" class="navbar-brand">COPYRIGHT DigiLearn for ADM HackEd &copy;
					2020</a>
			</div>
		</nav>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script>
		$('#myAlert').on('closed.bs.alert', function() {
			console.log('Alert closed...');
		})
	</script>
</body>
</html>