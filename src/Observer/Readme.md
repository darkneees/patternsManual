# Паттерн Наблюдатель

Как пишет банда четырех (имеется ввиду книга «Паттерны объектно-ориентированного проектирования» 4 первоклассных разработчиков) назначение этого паттерна в том, чтобы определять зависимость типа «один ко многим» между объектами таким образом, что при изменении состояния одного объекта все зависящие от него оповещаются об этом и автоматически обновляются. 

Еще этот паттерн называют:
Dependents (подчиненные) или Publish-Subscribe (издатель — подписчик). 

В данном примере паттерн помогает воспользоваться нужными методами не только для определённого класса. Например,
Интерфейс где можно зарегистрироваться и получать новости может касаться не только одной церкви. Данные методы можно вынести
в отдельный интерфейс: 
Observable:

```
public interface Observable {

    void registerObserver(Observer o);
    void removeObserver (Observer o);
    void notifyObservers();
}
```

Также можно и поступить с прихожанами церкви и вынести метод update в отдельный интерфейс и реализовать его у нужного
прихожанина. Для этого мы создаём интерфейс:
Observer:
```

public interface Observer {
    void update(String news);
}

```

Мы «ослабили связь» между церковью и прихожанами. Субъект (католическая  церковь) имеет лишь
список слушателей (прихожан) и при получении новостей (изменений), транслирует данные новости
своим слушателям. Можно завести теперь любой другой субъект (например протестанскую церковь) и там уже
транслировать новости «своим» слушателям.