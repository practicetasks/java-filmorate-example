package com.practice.filmoratenuray.controller;

public class UserController {
    // GET /users - получить список пользователей
    // POST /users - создание
    // {
    //   "login": "dolore",
    //   "name": "Nick Name",
    //   "email": "mail@mail.com",
    //   "birthday": "1946-08-20"
    // }

    // Response
    // {
    //   "id": 1,
    //   "login": "dolore",
    //   "name": "Nick Name",
    //   "email": "mail@mail.com",
    //   "birthday": "1946-08-20"
    // }


    // PUT /users
    // {
    //   "id": 22,
    //   "login": "dolore",
    //   "name": "Nick Name",
    //   "email": "mail@mail.com",
    //   "birthday": "1946-08-20"
    // }
    // если пользователя с таким идентификатором не существует, выбрасываем исключение

    // PUT /users/{id}/friends/{friendId} — добавление в друзья.
    // DELETE /users/{id}/friends/{friendId} — удаление из друзей.
    // GET /users/{id}/friends — возвращаем список пользователей, являющихся его друзьями.
    // GET /users/{id}/friends/common/{otherId} — список друзей, общих с другим пользователем.
}
