Чтобы запустить приложенение, нужна база: jdbc:postgresql://localhost:5432/comments.
Настроена она в application.properties, где ее можно поменять.
также там можно сменить порт сервера и url comments.
При запуске, приложение каждый раз делает новые таблицы и помещает туда администраторов с разными правами.
После запуска программы, ее можно вызвать по http://localhost:9091/*(тут может быть любой адрес).
Система переведет администратора на http://localhost:9091/login-form и предложит войти.
Параметры для входа на странице логин: Username: mike@mail.com, пароль: admin. 
Это администратор с максимальными правами.
После авторизации, администратор попадает на страницу со списком администраторов.
Тут можно добавить, удалить администратора системы, или отредактировать профиль.
Меню сверху позволят переключаться с таблицы администраторов на таблицу коментов, обратно, а также выйти из регистрации.
Если зайти под другим ником, напримth: Username:nick@mail.com, пароль: admin, то мі получим другой функционал - 
можно будет увидеть список администраторов, а вот список коментов будет недоступный


