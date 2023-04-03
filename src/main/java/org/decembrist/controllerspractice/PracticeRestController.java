package org.decembrist.controllerspractice;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Аннотацию менять нельзя
 */
@RestController
@RequestMapping("/rest/controller")
public class PracticeRestController {


    @PostMapping("/{xxx}")
    public ResponseEntity<Map<String, String>> postPathVariable(@PathVariable("xxx") String xxx) {
        Map<String, String> map = new HashMap<>();
        map.put("path-variable", xxx);
        return ResponseEntity.ok(map);
    }

    @PutMapping("/body")
    public ResponseEntity<Void> putBody(@RequestBody(required = false) Map<String, Integer> requestBody) {
        int number = 0;
        if (requestBody != null && requestBody.containsKey("even-number")) {
            number = requestBody.get("even-number");
        }
        if (number % 2 == 0) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}


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
