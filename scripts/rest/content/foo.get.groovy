import acme.Fox

def cart = [:]
cart.name = (params.name) ? params.name : "default"
cart.itemCount = 4

cart.goods =  [ "Apples", "Oranges", "Grapes", "Peaches" ]

cart.message = new Fox().speak()

cart.sum = 50 + 50 + 50

return cart