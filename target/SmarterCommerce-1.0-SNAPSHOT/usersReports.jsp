
<!DOCTYPE html>
<html ng-app>
	<head>

		<title>Hello Users angular</title>
		<script src="/resources/js/users.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
	</head>
<body>
	<div ng-controller="Users">
		I have  {{users.length}} users!
		
		<ul class="users-container">
			<li ng-repeat="users in users">
				{{users.name}}
			</li>
		</ul>
	</div>
	

</body>
</html>