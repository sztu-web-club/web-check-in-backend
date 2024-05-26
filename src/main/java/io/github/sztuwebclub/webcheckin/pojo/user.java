package io.github.sztuwebclub.webcheckin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String create_time;
    private String email;
}
