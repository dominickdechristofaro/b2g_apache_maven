package org.springframework.mb2g.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCommand {

    private String firstName;
    private String lastName;
    private String email;

}
