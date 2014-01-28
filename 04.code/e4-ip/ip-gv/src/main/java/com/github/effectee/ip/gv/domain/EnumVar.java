package com.github.effectee.ip.gv.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="T_E4_GV_ENUM")
public class EnumVar {

    @Id
    private String key;

    private String description;

    private List<EnumField> fields;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<EnumField> getFields() {
        return fields;
    }

    public void setFields(List<EnumField> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnumVar enumVar = (EnumVar) o;

        if (!key.equals(enumVar.key)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
