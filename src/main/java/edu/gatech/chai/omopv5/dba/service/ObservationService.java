/*******************************************************************************
 * Copyright (c) 2019 Georgia Tech Research Institute
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
 *******************************************************************************/
package edu.gatech.chai.omopv5.dba.service;

import java.sql.ResultSet;

import edu.gatech.chai.omopv5.model.entity.Observation;

/**
 * The Interface ObservationService.
 */
public interface ObservationService extends IService<Observation> {
	public static Observation _construct(ResultSet rs, Observation observation, String alias) {
		if (observation == null) observation = new Observation();
		
		if (alias == null || alias.isEmpty())
			alias = Observation._getTableName();

		
		return observation;
	}
	
}
