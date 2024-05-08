package hello.mylog.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @Column(name="friend_id")
    private Long friendId;
}
