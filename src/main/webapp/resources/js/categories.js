/**
 * 
 */
function Category($scope, $http) {
	
	
	$http.get('http://localhost:9080/accessories+rest').
		success(function (data) {
			$scope.accessories = data;
		
	});
}