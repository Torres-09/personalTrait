package Hwan2da.personalTrait.domain.auth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class RefreshToken {
    @Id
    private Long userid;

    private String token;

    public RefreshToken(Long userid, String token) {
        this.userid = userid;
        this.token = token;
    }
}
