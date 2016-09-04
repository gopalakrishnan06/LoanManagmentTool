
'use strict';

angular.module('myApp').controller('LoanController', ['$scope', 'LoanService', function($scope, LoanService) {
    var self = this;
    self.loan={id:null,loanName:''};
    self.loans=[];
 
    fetchAllUsers();
 
    function fetchAllUsers(){
    	LoanService.fetchAllUsers()
            .then(
            function(d) {
                self.users = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    } 
}]);