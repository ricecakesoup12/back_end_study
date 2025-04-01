package study.study.common.status

enum class Gender(val desc: String) {
    MAN("남"),
    WOMAN("여")
}

enum class Dormitory(val desc: String) {
    gowunA("고운A"),
    gowunB("고운B"),
    gowunC("고운C"),
    kyungsang11("고운11"),
    kyungsang12("고운12"),
    kyungsang13("고운13"),
    kyungsang14("고운14")
}

enum class ResultCode(val msg: String) {
    SUCCESS("정상 처리 되었습니다."),
    ERROR("에러가 발생했습니다.")
}