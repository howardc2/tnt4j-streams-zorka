/*
 * Copyright 2014-2018 JKOOL, LLC.
 *
 * This file is part of TNT4J-Streams-Zorka.
 *
 * TNT4J-Streams-Zorka is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TNT4J-Streams-Zorka is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TNT4J-Streams-Zorka.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jkoolcloud.tnt4j.streams;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.jkoolcloud.tnt4j.streams.configure.sax.ConfigParserHandlerTest;
import com.jkoolcloud.tnt4j.streams.filters.AllFiltersTests;
import com.jkoolcloud.tnt4j.streams.inputs.AllInputsTests;

/**
 * @author akausinis
 * @version 1.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ConfigParserHandlerTest.class, AllFiltersTests.class, AllInputsTests.class })
public class AllZorkaTests {
}
