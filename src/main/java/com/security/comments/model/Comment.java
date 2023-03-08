package com.security.comments.model;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;

import lombok.Data;
import lombok.experimental.Accessors;
import static org.springframework.util.StringUtils.capitalize;

@Entity
@Table(name = "commets")
@Data
@Accessors(chain = true)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "post_id", nullable = false)
    private long postId;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Column(name = "updated_at", nullable = false, updatable = false)
    private String updatedAt;

    public Comment() {
    }

    public static String getCarrentDate() {
        return OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public static String getCapitalizeName(String username) {
        return capitalize(username);
    }

}
