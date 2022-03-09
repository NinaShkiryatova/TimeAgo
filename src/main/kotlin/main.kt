fun main (){
    var timeOfAbsence: Int = 1200
    agoToText(timeOfAbsence)
}

fun agoToText (timeOfAbsence: Int){
    when (true){
        timeOfAbsence > 72*60*60 -> println("Пользователь был(а) в сети давно")
        timeOfAbsence > 48*60*60 -> println("Пользователь был(а) в сети вчера")
        timeOfAbsence > 24*60*60 -> println("Пользователь был(а) в сети сегодня")
        timeOfAbsence > 60*60 -> println("Пользователь был(а) в сети ${timeOfAbsence/60/60} ${hoursAgo(timeOfAbsence)} назад")
        timeOfAbsence > 60 -> println("Пользователь был(а) в сети ${timeOfAbsence/60} ${minutesAgo(timeOfAbsence)} назад")
        else -> println("Пользователь был(а) в сети только что")
    }
}

fun minutesAgo(timeOfAbsence: Int): String {
    var minutes: String = "минуту"
    when((timeOfAbsence/60)%10){
        2, 3, 4 -> minutes = "минуты"
        0, 5, 6, 7, 8, 9 -> minutes = "минут"
    }
    if (timeOfAbsence/60 == 11) minutes = "минут"
    return minutes;
}

fun hoursAgo(timeOfAbsence: Int): String {
    var hours: String = "час"
    when((timeOfAbsence/60/60)%10){
        2, 3, 4 -> hours = "часа"
        0, 5, 6, 7, 8, 9 -> hours = "часов"
    }
    if (timeOfAbsence/60/60 == 11) hours = "часов"
    return hours;
}
