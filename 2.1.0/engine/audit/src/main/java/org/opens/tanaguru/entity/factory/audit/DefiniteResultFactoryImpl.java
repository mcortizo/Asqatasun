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
package org.opens.tanaguru.entity.factory.audit;

import java.util.Collection;
import org.opens.tanaguru.entity.audit.DefiniteResult;
import org.opens.tanaguru.entity.audit.DefiniteResultImpl;
import org.opens.tanaguru.entity.audit.ProcessRemark;
import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.entity.reference.Test;
import org.opens.tanaguru.entity.subject.WebResource;

/**
 * 
 * @author jkowalczyk
 */
public class DefiniteResultFactoryImpl implements DefiniteResultFactory {

    public DefiniteResultFactoryImpl() {
        super();
    }

    @Override
    public DefiniteResult create() {
        return new DefiniteResultImpl();
    }

    @Override
    public DefiniteResult create(Test test, WebResource subject) {
        DefiniteResult definiteResult = this.create();
        definiteResult.setTest(test);
        definiteResult.setSubject(subject);
        return definiteResult;
    }

    @Override
    public DefiniteResult create(Test test, WebResource subject,
            TestSolution value, Collection<ProcessRemark> remarkSet) {
        DefiniteResult definiteResult = this.create();
        definiteResult.setTest(test);
        definiteResult.setSubject(subject);
        definiteResult.setDefiniteValue(value);
        definiteResult.addAllRemark(remarkSet);
        return definiteResult;
    }

}