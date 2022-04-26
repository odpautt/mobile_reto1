Feature: Compra Arcticulo

Scenario: Agregar Mochila SoucesLab
Given el inicia sesion con el usuario generico
When agregar un articulo a la canasta de compras
Then al hacer clic en la casta el sistema deberia mostrar el detalle del producto seleccionado