package forjun.selenium.domain.selenium.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SELENIUM_CONNECTION")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SeleniumConnectionEntity {

    @EmbeddedId
    private SeleniumConnectionId id;

    private String url;
}
