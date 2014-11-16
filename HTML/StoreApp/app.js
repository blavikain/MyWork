(function() {
    var app = angular.module('store', []);

    app.controller('StoreController', function() {
        this.products = gems;
    });

    var gems = [
        {
            name: 'Dodecahedron',
            price: 1.25,
            description: 'And that is my little description of the dodecahedron',
            canPurchase: true
        },
        {
            name: 'Pentagonal Gem',
            price: 5.95,
            description: 'This is my littlier description for the Pentagonal Gem',
            canPurchase: true
        },
        {
            name: 'ASD',
            price: 5.95,
            description: 'This is my littlier description for the Pentagonal Gem',
            canPurchase: false
        }
    ];
})();