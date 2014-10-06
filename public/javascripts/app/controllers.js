'use strict';
var controllers = angular.module('TodoApp.controllers', ['ngResource']);

var todoController = function ($scope, TodoList, TodoFactory) {

    $scope.listas = [new TodoList()];
    $scope.text = 'preste';

    $scope.getTotalTodos = function () {
        var i = 0;
//        angular.forEach($scope.listas, function (lista) {
//            i += lista.todos.length || 0;
//        });
        return i;
    };

    $scope.addTodo = function () {

        var todo = new TodoFactory.get();

        todo.todo = $scope.text;
        todo.completed = false;
        angular.forEach($scope.listas, function (lista) {
            lista.todos.push(todo);
        });
        $scope.text = '';
        $scope.listas.save(function () {
            $scope.getTodos();
        });

    };

    $scope.getTodos = function () {
        TodoList.query(function (data) {
            $scope.listas = data;
        });
    };
    $scope.getTodos();

};

var TodoCtrl = function ($scope) {

    $scope.todos = [
        {text: 'Learn AngularJS', done: false},
        {text: 'Build an app', done: false}
    ];

    $scope.getTotalTodos = function () {
        return $scope.todos.length;
    };


    $scope.addTodo = function () {
        $scope.todos.push({text: $scope.formTodoText, done: false});
        $scope.formTodoText = '';
    };

    $scope.clearCompleted = function () {
        $scope.todos = _.filter($scope.todos, function (todo) {
            return !todo.done;
        });
    };
}

controllers.controller('TODOController', ['$scope', 'TodoList', 'TodoFactory', todoController]);
controllers.controller('TodoCtrl', ['$scope',TodoCtrl]);