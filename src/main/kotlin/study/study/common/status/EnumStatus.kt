package study.study.common.status


enum class Dormitory(val desc: String) {
    GounA("고운A"),
    GounB("고운B"),
    Goun("고운C"),
    GyungSang11("고운11"),
    GyungSang12("고운12"),
    GyungSang13("고운13"),
    GyungSang14("고운14")
}

enum class ResultCode(val msg: String) {
    SUCCESS("정상 처리 되었습니다."),
    ERROR("에러가 발생했습니다.")
}

enum class ROLE {
    MEMBER,
}