function Hello($scope, $http) {
    $http.get('http://localhost:8080/LoanInfo').
        success(function(data) {
            $scope.greeting = data;
        });
}

