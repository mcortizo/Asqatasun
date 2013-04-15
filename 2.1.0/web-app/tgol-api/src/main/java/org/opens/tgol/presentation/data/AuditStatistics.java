/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2011  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tgol.presentation.data;

import java.util.Date;
import java.util.Map;
import org.opens.tanaguru.entity.reference.Theme;
import org.opens.tgol.entity.contract.ScopeEnum;

/**
 * This interface defines the audit statistics data
 * @author jkowalczyk
 */
public interface AuditStatistics {

    /**
     *
     * @return
     */
    String getUrl();

    /**
     *
     * @param url
     */
    void setUrl(String url);

    /**
     *
     * @return
     */
    String getRawMark();

    /**
     *
     * @param rawMark
     */
    void setRawMark(String rawMark);

    /**
     *
     * @return
     */
    String getWeightedMark();

    /**
     *
     * @param weightedMark
     */
    void setWeightedMark(String weightedMark);

    /**
     *
     * @return
     */
    Date getDate();

    /**
     *
     * @param date
     */
    void setDate(Date date);

    /**
     *
     * @return
     */
    ResultCounter getResultCounter();

    /**
     *
     * @param resultCounter
     */
    void setResultCounter(ResultCounter resultCounter);

    /**
     *
     * @return
     */
    Map<Theme, ResultCounter> getCounterByThemeMap();

    /**
     *
     * @param counterByThemeMap
     */
    void setCounterByThemeMap(Map<Theme, ResultCounter> counterByThemeMap);

    /**
     *
     * @return
     */
    int getTestCount();

    /**
     *
     * @return
     */
    Integer getPageCounter();

    /**
     *
     * @param pageCounter
     */
    void setPageCounter(Integer pageCounter);

    /**
     *
     * @return
     */
    Map<String, String> getParametersMap();

    /**
     *
     * @param parametersMap
     */
    void setParametersMap(Map<String, String> parametersMap);

    /**
     *
     * @return
     */
    ScopeEnum getAuditScope();

    /**
     *
     * @param auditScope
     */
    void setAuditScope(ScopeEnum auditScope);

}