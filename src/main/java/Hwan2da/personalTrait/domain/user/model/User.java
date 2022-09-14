package Hwan2da.personalTrait.domain.user.model;

import Hwan2da.personalTrait.domain.common.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "userTable")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String nickName;

    @Builder
    public User(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }
}