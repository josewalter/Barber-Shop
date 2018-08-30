//Criação do modulo principal da aplicação
var appBarberShop = angular.module("appBarberShop",['ngRoute']);

appBarberShop.config(function ($routeProvider){
	
	$routeProvider
	.when("/fornecedores", {templateUrl:'view/fornecedor.html', controller:'fornecedorController'})
	.otherwise({rediretTo:'/'});
});

