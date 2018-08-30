//Criação do fornecedorController
appBarberShop.controller ("fornecedorController", function ($scope, $http){
	
	$scope.fornecedores = [];
	$scope.fornecedor = {};
	
	//Método carregar fornecedores da parte client
	carregarFornecedores = function (){
		$http({method:'GET', url:'http://localhost:8081/fornecedores'})
		.then(function (response){
		    $scope.fornecedores = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar da parte client
	$scope.salvarFornecedor = function (){
		$http({method:'POST', url:'http://localhost:8081/fornecedores', data:$scope.fornecedor})
		.then(function (response){
			//$scope.fornecedores.push(response.data);
			carregarFornecedores();
			$scope.cancelarAlteracaoFornecedor();
			
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método excluir da parte client
	$scope.excluirFornecedor = function (fornecedor){
		$http({method:'DELETE', url:'http://localhost:8081/fornecedores/'+fornecedor.id})
		.then(function (response){
			pos = $scope.fornecedores.indexOf(fornecedor);
			$scope.fornecedores.splice(pos , 1);
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método alterar da parte client
	$scope.alterarFornecedor = function (forn){
		$scope.fornecedor= angular.copy(forn);
				
	};
	
	//Método cancelar da parte client
	$scope.cancelarAlteracaoFornecedor = function (){
		$scope.fornecedor={};
		
	};
	carregarFornecedores();

});