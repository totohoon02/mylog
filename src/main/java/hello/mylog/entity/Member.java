package hello.mylog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    @Column(name = "google_id")
    private String googleId;
    private String password;
    private String nickname;

    @OneToMany(mappedBy = "member")
    private List<Friend> friends = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Comment> comments = new ArrayList<>();
}
