package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        StringBuilder lyric = new StringBuilder();
        if (position == 1) {
            lyric.append("Пусть бегут неуклюже").append(System.lineSeparator()).
                    append("Пешеходы по лужам, ").append(System.lineSeparator()).
                    append("А вода по асфальту рекой.").append(System.lineSeparator()).
                    append("И неясно прохожим,").append(System.lineSeparator()).
                    append("В этот день непогожий,").append(System.lineSeparator()).
                    append("Почему я веселый такой?").append(System.lineSeparator()).
                    append(System.lineSeparator()).
                    append("А я играю на гармошке").append(System.lineSeparator()).
                    append("У прохожих на виду.").append(System.lineSeparator()).
                    append("К сожаленью, день рожденья").append(System.lineSeparator()).
                    append("Только раз в году.").append(System.lineSeparator()).
                    append(System.lineSeparator()).
                    append("Прилетит вдруг волшебник").append(System.lineSeparator()).
                    append("В голубом вертолете").append(System.lineSeparator()).
                    append("И бесплатно покажет кино.").append(System.lineSeparator()).
                    append("С днем рожденья поздравит").append(System.lineSeparator()).
                    append("И, наверно, оставит").append(System.lineSeparator()).
                    append("Мне в подарок пятьсот эскимо.").append(System.lineSeparator()).
                    append(System.lineSeparator()).
                    append("А я играю на гармошке").append(System.lineSeparator()).
                    append("У прохожих на виду.").append(System.lineSeparator()).
                    append("К сожаленью, день рождения").append(System.lineSeparator()).
                    append("Только раз в году.").append(System.lineSeparator()).
                    append("К сожаленью, день рожденья").append(System.lineSeparator()).
                    append("Только раз в году.").append(System.lineSeparator());
        } else if (position == 2) {
            lyric.append("Спят усталые игрушки, книжки спят.").append(System.lineSeparator()).
                    append("Одеяла и подушки ждут ребят.").append(System.lineSeparator()).
                    append("Даже сказка спать ложится,").append(System.lineSeparator()).
                    append("Чтобы ночью нам присниться.").append(System.lineSeparator()).
                    append("Ты ей пожелай:").append(System.lineSeparator()).
                    append("Баю-бай.").append(System.lineSeparator()).
                    append(System.lineSeparator()).
                    append("Обязательно по дому в этот час").append(System.lineSeparator()).
                    append("Тихо-тихо ходит дрема возле нас.").append(System.lineSeparator()).
                    append("За окошком всё темнее,").append(System.lineSeparator()).
                    append("Утро ночи мудренее.").append(System.lineSeparator()).
                    append("Глазки закрывай,").append(System.lineSeparator()).
                    append("Баю-бай.").append(System.lineSeparator()).
                    append(System.lineSeparator()).
                    append("В сказке можно покататься на луне").append(System.lineSeparator()).
                    append("И по радуге промчаться на коне,").append(System.lineSeparator()).
                    append("Со слоненком подружиться").append(System.lineSeparator()).
                    append("И поймать перо Жар-птицы.").append(System.lineSeparator()).
                    append("Глазки закрывай,").append(System.lineSeparator()).
                    append("Баю-бай.").append(System.lineSeparator()).
                    append(System.lineSeparator()).
                    append("Баю-бай, должны все люди ночью спать.").append(System.lineSeparator()).
                    append("Баю-баю, завтра будет день опять.").append(System.lineSeparator()).
                    append("За день мы устали очень,").append(System.lineSeparator()).
                    append("Скажем всем: \"Спокойной ночи!\"").append(System.lineSeparator()).
                    append("Глазки закрывай,").append(System.lineSeparator()).
                    append("Баю-бай.").append(System.lineSeparator());
        } else {
            lyric.append("Песня не найдена").append(System.lineSeparator());
        }
        System.out.println(lyric);
    }

    public static void main(String[] args) {
        Jukebox player = new Jukebox();
        player.music(1);
        player.music(2);
        player.music(12);
    }
}
