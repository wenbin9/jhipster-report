package com.spring.report.service.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.spring.report.domain.Region} entity.
 */
public class RegionDTO implements Serializable {
    
    private Long id;

    private String regionName;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegionDTO)) {
            return false;
        }

        return id != null && id.equals(((RegionDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "RegionDTO{" +
            "id=" + getId() +
            ", regionName='" + getRegionName() + "'" +
            "}";
    }
}
