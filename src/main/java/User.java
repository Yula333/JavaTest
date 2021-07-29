public class User {

    private String login, email;

    // Конструктор, который принимает два параметра
    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    // Конструктор без параметров
    public User() {
    }

    // Различные геттеры и сеттеры
    public String getLogin() {
        return login;
    }

    // Функция возвращает либо false, либо true
    public boolean setLogin(String login) {
        // Если длина логина менее 5 символов, то ошибка
        if(login.length() < 5)
            // Возвращаем значение и выходим из функции
            return false;

        // Иначе устанавливаем значение и возвращаем true
        this.login = login;
        return true;
    }

    public String getEmail() {
        return email;
    }

    // Функция возвращает либо false, либо true
    public boolean setEmail(String email) {
        // Если email не содержит символ @ или символ .,
        // то возвращаем ошибку
        if(!email.contains("@") || !email.contains("."))
            // Возвращаем значение и выходим из функции
            return false;

        // Иначе устанавливаем значение и возвращаем true
        this.email = email;
        return true;
    }
}
