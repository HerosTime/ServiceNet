package org.benetech.servicenet.adapter.icarol.model;

import java.time.ZonedDateTime;
import lombok.Data;

@Data
public class ICarolBaseData extends ICarolElement {

    private String id;

    private String databaseID;

    private String uniquePriorId;

    private ICarolContactDetails[] contactDetails;

    private ICarolRelated[] related;

    private String cultureCode;

    private String[] searchHints;

    private String type;

    private String modified;

    private ZonedDateTime lastVerifiedOn;

    private Boolean isFeatured;

    private String languagesOffered;

    private String status;
}
