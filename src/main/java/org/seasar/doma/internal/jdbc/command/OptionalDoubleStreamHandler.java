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

import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Stream;

import org.seasar.doma.internal.jdbc.scalar.OptionalDoubleScalar;

/**
 * 
 * @author nakamura-to
 * 
 * @param <RESULT>
 */
public class OptionalDoubleStreamHandler<RESULT> extends
        ScalarStreamHandler<Double, OptionalDouble, RESULT> {

    public OptionalDoubleStreamHandler(
            Function<Stream<OptionalDouble>, RESULT> mapper) {
        super(() -> new OptionalDoubleScalar(), mapper);
    }

}