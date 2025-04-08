package study.study.member.entity

import jakarta.persistence.*
import study.study.common.status.Dormitory
import study.study.common.status.ROLE

@Entity
@Table(
    uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])]
)

class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, length = 30, updatable = false)
    val loginId: String,

    @Column(nullable = false, length = 100)
    val password: String,

    @Column(nullable = false, length = 10)
    val name: String,

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    val dormitory: Dormitory,

    @Column(nullable = false, length = 30)
    val email: String,
) {
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
    val memberRole: List<MemberRole>? = null
}

@Entity
class MemberRole(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    val role: ROLE,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(foreignKey = ForeignKey(name = "uk_member_role_member_id"))
    val member: Member,
)