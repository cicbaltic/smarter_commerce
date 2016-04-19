function Users($scope, $http) {
	
	
	$http.get('http://localhost:9080/users.json').
		success(function (data) {
			$scope.users = data;
		
	});
}