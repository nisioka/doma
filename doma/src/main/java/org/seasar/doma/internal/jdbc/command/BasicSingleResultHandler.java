/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.doma.internal.jdbc.command;

import static org.seasar.doma.internal.util.AssertionUtil.*;

import java.util.function.Supplier;

import org.seasar.doma.jdbc.query.SelectQuery;
import org.seasar.doma.wrapper.Wrapper;

/**
 * @author taedium
 * 
 */
public class BasicSingleResultHandler<R> extends AbstractSingleResultHandler<R> {

    protected final Supplier<Wrapper<R>> supplier;

    protected final boolean primitive;

    public BasicSingleResultHandler(Supplier<Wrapper<R>> supplier,
            boolean primitive) {
        assertNotNull(supplier);
        this.supplier = supplier;
        this.primitive = primitive;
    }

    @Override
    protected ResultProvider<R> createResultProvider(SelectQuery query) {
        return new BasicResultProvider<R, R>(
                () -> new org.seasar.doma.internal.wrapper.BasicHolder<>(
                        supplier, primitive), query);
    }

}
