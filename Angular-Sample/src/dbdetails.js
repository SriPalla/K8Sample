/**
 * 
 */
var app = angular.module('mainApp', []);

app.controller('table', ['$scope', '$http', function($scope, $http) {
	$http.get('http://counterweb:8080/getDbTableNames')
	.then(successCallback, errorCallback);
	
	function successCallback(response) {
		$scope.tables = response.data.tableName;
	}
	function errorCallback(response) {
		alert('Error Occured Code:' + response.status);
	}
}]);