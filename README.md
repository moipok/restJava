# restJava



### Ресторан 

##### Заказы
GET /orders allOrders
DELETE /orders/{order-id}
GET /orders/{order-id}
POST /orders/

body:
```javascript
{
    "dishes": [
        {
            "name" : "Plov" 
        },
        {
            "name" : "Burger"
        }
    ],
    "user" : userId
}
```
request:
```javascript
{
    "dishes": [
        {
            "name" : "Plov",
            "retailPrice" : 500,
            "ingredients": [
                {
                  "name": "Onion",
                  "count": 2
                },
                {
                  "name": "Carrot",
                  "count": 4
                },
                {
                  "name": "Meat",
                  "count": 4
                },
                {
                  "name": "Rice",
                  "count": 2
                }
            ]
        }
    ],
    "price" : 500
}
```

##### Кухня
###### Меню
GET /kitchen/dishes allDishes
DELETE /kitchen/dishes/{dish-id} deleteDish
GET /kitchen/dishes/{dish-id}
POST /kitchen/dishes addDish
Body:
```javascript
{
    "name" : "Plov",
    "retailPrice" : 500,
    "ingredients": [
        {
          "name": "Onion",
          "count": 2
        },
        {
          "name": "Carrot",
          "count": 4
        },
        {
          "name": "Meat",
          "count": 4
        },
        {
          "name": "Rice",
          "count": 2
        }
    ]
}
```
* Исключение если не найдет ингредиет (как обработать?)

###### Ингредиенты
GET /kitchen/ingredients allIngredients
DELETE /kitchen/ingredients/{dish-id} deleteIngredient
POST /kitchen/ingredients addIngredient
```javascript
{
  "name" : "Rice",
  "count" : 20,
  "cost" : 25
}
```
PUT /kitchen/ingredients/{dish-id} addCountIngredient
```javascript
{ "count" : 42 }
```
* При добавлении элементов баланс ресторана уменьшается
* При недостаточном балансе - отмена транзакции Spring (@Transactional)




