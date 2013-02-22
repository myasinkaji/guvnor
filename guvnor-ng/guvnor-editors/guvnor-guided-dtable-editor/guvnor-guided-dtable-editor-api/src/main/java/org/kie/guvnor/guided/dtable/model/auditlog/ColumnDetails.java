/*
 * Copyright 2012 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.kie.guvnor.guided.dtable.model.auditlog;

import org.drools.guvnor.models.guided.dtable.model.BaseColumn;
import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * Basic details of a column
 */
@Portable
public class ColumnDetails {

    private static final long serialVersionUID = -2111038793296621482L;

    private String columnHeader;

    public ColumnDetails() {
    }

    public ColumnDetails( final BaseColumn column ) {
        this.columnHeader = column.getHeader();
    }

    public String getColumnHeader() {
        return columnHeader;
    }

}
