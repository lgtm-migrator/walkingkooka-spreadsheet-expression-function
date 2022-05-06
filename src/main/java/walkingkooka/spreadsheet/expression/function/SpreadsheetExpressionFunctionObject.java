/*
 * Copyright 2022 Miroslav Pokorny (github.com/mP1)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package walkingkooka.spreadsheet.expression.function;

import walkingkooka.tree.expression.function.ExpressionFunctionKind;

/**
 * Base for any function that returns an Object
 */
abstract class SpreadsheetExpressionFunctionObject extends SpreadsheetExpressionFunction<Object> {

    final static int BIAS = 1;

    /**
     * Package private ctor
     */
    SpreadsheetExpressionFunctionObject(final String name,
                                        final ExpressionFunctionKind... kinds) {
        super(
                name,
                kinds
        );
    }

    @Override
    public final Class<Object> returnType() {
        return Object.class;
    }
}
