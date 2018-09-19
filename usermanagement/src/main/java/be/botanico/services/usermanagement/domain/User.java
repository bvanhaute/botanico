package be.botanico.services.usermanagement.domain;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@Builder
public class User {
    private String lastName;
    private List<String> firstNames;
    private Long id;
    private List<String> emails;
}
