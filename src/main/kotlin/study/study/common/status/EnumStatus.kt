package study.study.common.status


enum class Dormitory(val desc: String) {
    GOWUNA("고운A"),
    GOWUNB("고운B"),
    GOWUNC("고운C"),
    KYUNGSANG11("고운11"),
    KYUNGSANG12("고운12"),
    KYUNGSANG13("고운13"),
    KYUNGSANG14("고운14")
}

enum class ResultCode(val msg: String) {
    SUCCESS("정상 처리 되었습니다."),
    ERROR("에러가 발생했습니다.")
}