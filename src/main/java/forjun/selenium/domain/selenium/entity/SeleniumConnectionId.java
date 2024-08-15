package forjun.selenium.domain.selenium.entity;

import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeleniumConnectionId implements Serializable {

    private String moduleName;
    private String actionType;

    public SeleniumConnectionId(String moduleName, String actionType) {
        this.moduleName = moduleName;
        this.actionType = actionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeleniumConnectionId that = (SeleniumConnectionId) o;
        return Objects.equals(moduleName, that.moduleName) &&
                Objects.equals(actionType, that.actionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleName, actionType);
    }

}
