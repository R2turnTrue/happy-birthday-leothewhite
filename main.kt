fun main() {

    val leothewhite = HRPlayground["leothewhite"]

    celebrate(leothewhite, "${leothewhite.name}님 생신 축하드립니다!")

}

fun celebrate(person: Person, message: String) {

    println(person.birthDate.format())

    println(message)

}

/*

10/21

레오님 생신 축하드립니다!

*/
