package Hwan2da.personalTrait.domain.user.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "userTable")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickName;
}