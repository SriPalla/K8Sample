/**
 * 
 */
var app = angular.module('mainApp', []);

app.controller('table', ['$scope', '$http', function($scope, $http) {
	$http.get('http://192.168.0.108:8080/getAllBics')
	.then(successCallback, errorCallback);
	
	function successCallback(response) {
		console.log(response.data);
		$scope.records = response.data;
	}
	function errorCallback(response) {
		alert('Error Occured Code:' + response.status);
	}
}]);