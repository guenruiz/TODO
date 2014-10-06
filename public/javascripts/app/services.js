'use strict';
var services = angular.module('TodoApp.services', ['ngResource']);

var todoList = function ($resource) {
    return $resource('/json/listas.json/:id', {
        id: '@id'}, {
        query: {method: "GET", isArray: true}
//        ,
//        save: {method: "POST", isArray: false},
//        update: {method: "PUT", isArray: false}
    });
};

var todoFactory = function () {
    var todo = {};
    todo.todo = '';
    todo.completed = false;
    return {
        get: function () {
            return todo;
        }
    };
};

services.factory('TodoList', todoList);
services.factory('TodoFactory', todoFactory);
