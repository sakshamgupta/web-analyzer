var analyzerApp = angular.module('analyzerApp',[]);

analyzerApp.controller('analyzerAppCtrl', ['$scope', '$http', function($scope,$http) {
    $scope.tags = jsonParse;
    var currentClass = null;

    $scope.hoverToHighlight = 0;

    $scope.onClick = function(tag) {
        console.log("Clicked: " + tag);

        if (currentClass !== null) {
            $('.highlight-' + currentClass).css('background-color', 'white');
        }

        currentClass = tag;

        if (currentClass !== null) {
            $('.highlight-' + currentClass).css('background-color', 'yellow');
        }
    };

    $scope.onHover = function(tag) {
        if ($scope.hoverToHighlight == 1) {
            $scope.onClick(tag);
        }
    };
}]);