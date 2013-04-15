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
package org.opens.tgol.report.expression.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.opens.tgol.report.expression.I18nExpression;
import org.opens.tgol.report.expression.retriever.KeyRetriever;

/**
 *
 * @author jkowalczyk
 */
public class I18nExpressionBuilderImpl implements AbstractGenericCustomExpressionBuilder<I18nExpression>{

    private List<String> bundleNameList = new ArrayList<String>();
    public List<String> getBundleNameList() {
        return bundleNameList;
    }

    public void setBundleNameList(List<String> bundleNameList) {
        this.bundleNameList.addAll(bundleNameList);
    }

    private KeyRetriever keyRetriever;
    public KeyRetriever getKeyRetriever() {
        return keyRetriever;
    }

    public void setKeyRetriever(KeyRetriever keyRetriever) {
        this.keyRetriever = keyRetriever;
    }

    private boolean escapeHtml = false;
    public boolean isEscapeHtml() {
        return escapeHtml;
    }

    public void setEscapeHtml(boolean escapeHtml) {
        this.escapeHtml = escapeHtml;
    }

    @Override
    public I18nExpression build(Locale locale) {
        return new I18nExpression(bundleNameList, keyRetriever, escapeHtml, locale);
    }

}