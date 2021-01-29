/*
 * Copyright (C) 2017-2021 Sebastiano Vigna
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
 */

package it.unimi.dsi.fastutil.ints;

import java.util.Collections;
import java.util.EnumSet;
import java.util.function.Supplier;

import org.junit.runners.Parameterized.Parameters;

public class Int2ObjectMapGenericArrayTest extends Int2ObjectMapGenericTest<Int2ObjectArrayMap<Integer>> {
	@Parameters
	public static Iterable<Object[]> data() {
		final EnumSet<Capability> capabilities = EnumSet.allOf(Capability.class);
		capabilities.remove(Capability.ITERATOR_MODIFY);
		return Collections.singletonList(new Object[] { (Supplier<Int2ObjectArrayMap<Integer>>) Int2ObjectArrayMap::new, capabilities });
	}
}