package com.spring.report.service.mapper;


import com.spring.report.domain.*;
import com.spring.report.service.dto.ReportTemplateDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ReportTemplate} and its DTO {@link ReportTemplateDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ReportTemplateMapper extends EntityMapper<ReportTemplateDTO, ReportTemplate> {



    default ReportTemplate fromId(Long id) {
        if (id == null) {
            return null;
        }
        ReportTemplate reportTemplate = new ReportTemplate();
        reportTemplate.setId(id);
        return reportTemplate;
    }
}
