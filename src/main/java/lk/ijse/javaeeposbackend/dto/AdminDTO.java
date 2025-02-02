package lk.ijse.javaeeposbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDTO {
    private String admId;
    private String name;
    private String address;
    private String mobile;
    private String password;
    private String email;
}
