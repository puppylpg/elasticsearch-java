/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: indices._types.IndexRoutingAllocationInclude
public final class IndexRoutingAllocationInclude implements ToJsonp {
	@Nullable
	private final String _tierPreference;

	@Nullable
	private final String _id;

	// ---------------------------------------------------------------------------------------------

	protected IndexRoutingAllocationInclude(Builder builder) {

		this._tierPreference = builder._tierPreference;
		this._id = builder._id;

	}

	/**
	 * API name: {@code _tier_preference}
	 */
	@Nullable
	public String _tierPreference() {
		return this._tierPreference;
	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public String _id() {
		return this._id;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this._tierPreference != null) {

			generator.writeKey("_tier_preference");
			generator.write(this._tierPreference);

		}
		if (this._id != null) {

			generator.writeKey("_id");
			generator.write(this._id);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocationInclude}.
	 */
	public static class Builder implements ObjectBuilder<IndexRoutingAllocationInclude> {
		@Nullable
		private String _tierPreference;

		@Nullable
		private String _id;

		/**
		 * API name: {@code _tier_preference}
		 */
		public Builder _tierPreference(@Nullable String value) {
			this._tierPreference = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(@Nullable String value) {
			this._id = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingAllocationInclude}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocationInclude build() {

			return new IndexRoutingAllocationInclude(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexRoutingAllocationInclude
	 */
	public static final JsonpDeserializer<IndexRoutingAllocationInclude> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					IndexRoutingAllocationInclude::setupIndexRoutingAllocationIncludeDeserializer);

	protected static void setupIndexRoutingAllocationIncludeDeserializer(
			DelegatingDeserializer<IndexRoutingAllocationInclude.Builder> op) {

		op.add(Builder::_tierPreference, JsonpDeserializer.stringDeserializer(), "_tier_preference");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");

	}

}
