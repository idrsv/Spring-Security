
    Spring Security в дальнейшем (SS) предоставляет функицонал для обеспечения безопасности приложения.
    Аутентификация - процедура проверки подлинности путем сравнения введеных user name-a и password с user name-ом и password-ом
                    хранящимся в БД.
    Авторизация - процедура проверки разрешений на доступ к тому или иному ресурсу.


    //Защита от перехода просто по ссылке без роли
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
                .antMatchers("/hr_info").hasRole("HR")
                .antMatchers("/manager_info/**").hasRole("MANAGER")
                .and().formLogin().permitAll();
    }


    В БД enabled TINYINT(1) - если 1, то юзер может совершать вход в систему, если 0, то юзер заблокирован.

    Пароль в таблице содержится в следующем виде:

            {алгоритм шифрования} зашифрованный пароль

            {noop} - никакого шифрования. Пароль прописвается в виде обычного текста.
            {bcrypt} - шифрование с помощью хэщ-функции bcrypt. Пароль прописывается в зашифрованном виде.

           текстовый пароль+соль
    bcrypt(text password + salt) = шифрованный пароль
