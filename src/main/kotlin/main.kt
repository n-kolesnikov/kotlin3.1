fun agoToText (secondsAgo: Int){
    when {
        secondsAgo in 0..60 -> println("только что")
        secondsAgo in 61..60*60 -> minutesAgo(secondsAgo)
        secondsAgo in 60 * 60 + 1..24 * 60 * 60 -> hoursAgo(secondsAgo)
        secondsAgo in 24 * 60 * 60..2 * 24 * 60 * 60 -> println("сегодня")
        secondsAgo in 2* 24 * 60 * 60..3 * 24 * 60 * 60 -> println("вчера")
        secondsAgo > 3* 24 * 60 * 60 -> println("давно")
    }
}

fun minutesAgo (secondsAgo: Int){
    val toMinutes = secondsAgo / 60
    var minute = "минут"
    if (toMinutes % 10 == 1 && toMinutes != 11){
        minute = "минуту"
    }
    else if (toMinutes % 10 in 2..4 && toMinutes !in 12..14){
        minute = "минуты"
    }
    println("$toMinutes $minute назад")
}
fun hoursAgo (secondsAgo: Int){
    val toHours = secondsAgo / 60 / 60
    var hour = "часов"
    if (toHours % 10 == 1 && toHours != 11){
        hour = "час"
    }
    else if (toHours % 10 in 2..4 && toHours !in 12..14){
        hour = "часа"
    }
    println("$toHours $hour назад")
}
fun main(){
    val secondsAgo = 45000
    agoToText(secondsAgo)
}