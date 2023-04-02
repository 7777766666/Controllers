package org.decembrist.controllerspractice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Аннотацию менять нельзя
 */
@Controller
@RequestMapping(path = "/controller")
public class PracticeController {

    @RequestMapping(path = "/random", produces = "application/json")
    public ResponseEntity<Map<String, Integer>> getRandomInt() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("randomValue", new Random().nextInt(100));
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/html")
    public String view(@RequestParam(value = "text", required = false, defaultValue = "zbs")
                       String text, Model model) {
        model.addAttribute("lol", "Это " + text);
        return "mem";
    }


    // 1
    // Создать метод который возвращает json {"randomValue": <рандомное значение типа int>}
    // Путь запроса в браузере метод GET (гугли HTTP METHOD) /controller/random

    // Пример, пользователь идет в браузере на http://localhost:8080/controller/random
    // Ответ типа application/json (см. заголовок "content-type") с текстом {"randomValue": 2}
    // Пример, пользователь идет в браузере на http://localhost:8080/controller/random
    // Ответ типа application/json (см. заголовок "content-type") с текстом {"randomValue": 3}
    // Пример, пользователь идет в браузере на http://localhost:8080/controller/random
    // Ответ типа application/json (см. заголовок "content-type") с текстом {"randomValue": 1}
    // ...

    // 2
    // Создать метод который возвращает .html страницу с текстом который пользователь отправляет в запросе
    // Путь запроса в браузере GET (гугли HTTP METHOD) /controller/html?text={value} (гугли spring RequestParam)
    // Использовать библиотеку freemarker (уже подключена в pom.xml)

    // Пример, пользователь идет в браузере на http://localhost:8080/controller/html?text=j.o.p.a
    // Ответ открывается страница с текстом <h1>Это j.o.p.a</h1> (тэг h1 необязателен, можно заменить любым другим)
    // Если пользователь не указывает параметер text, то используется значение для text по умолчанию "zbs"
}
