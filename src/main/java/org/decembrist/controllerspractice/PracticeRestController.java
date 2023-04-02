package org.decembrist.controllerspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Аннотацию менять нельзя
 */
@RestController
public class PracticeRestController {
    

    //3
    // Создать метод который возвращает json {"path-variable": <значение 'value' из пути запроса>}
    // Путь запроса POST /rest/controller/value (гугли spring PathVariable)

    // Пример: Запрос POST http://localhost:8080/rest/controller/jopka
    // Ответ {"path-variable":"jopka"}

    //4
    // Создать метод который возвращает пустой ответ со статусом 200, при условии
    // Путь запроса PUT /rest/controller/body (гугли spring RequestBody)
    // Тело запроса выглядит {"even-number": <число>}
    // Если <число> четное, то статус ответа 200, иначе статус ответа 400
    // Если тело запроса отсутствует, то ответ все равно 200

    // Пример: Запрос PUT http://localhost:8080/rest/controller/body
    // Ответ 200
    // Пример: Запрос PUT http://localhost:8080/rest/controller/body, тело = {"even-number": 2}
    // Ответ 200
    // Пример: Запрос PUT http://localhost:8080/rest/controller/body, тело = {"even-number": 3}
    // Ответ 400

}
