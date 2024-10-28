/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.manticoresearch.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.manticoresearch.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T12:56:08.804080940Z[Etc/UTC]", comments = "Generator version: 7.3.0-SNAPSHOT")
@JsonDeserialize(using = SqlResponse.SqlResponseDeserializer.class)
@JsonSerialize(using = SqlResponse.SqlResponseSerializer.class)
public class SqlResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SqlResponse.class.getName());

    public static class SqlResponseSerializer extends StdSerializer<SqlResponse> {
        public SqlResponseSerializer(Class<SqlResponse> t) {
            super(t);
        }

        public SqlResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(SqlResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SqlResponseDeserializer extends StdDeserializer<SqlResponse> {
        public SqlResponseDeserializer() {
            this(SqlResponse.class);
        }

        public SqlResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SqlResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize List<Object>
            try {
                if (token == JsonToken.START_ARRAY) {
                    final TypeReference<List<Object>> ref = new TypeReference<List<Object>>(){};
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ref);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'List<Object>'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'List<Object>'", e);
            }

            // deserialize Object
            try {
                if (token != JsonToken.START_ARRAY) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Object.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Object'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Object'", e);
            }

            if (match == 1) {
                SqlResponse ret = new SqlResponse();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for SqlResponse: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public SqlResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SqlResponse cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public SqlResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public SqlResponse(List o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SqlResponse(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("List<Object>", new GenericType<List<Object>>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        JSON.registerDescendants(SqlResponse.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return SqlResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<Object>, Object
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(List.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Object.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be List<Object>, Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<Object>, Object
     *
     * @return The actual instance (List<Object>, Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<Object>`. If the actual instance is not `List<Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Object>`
     * @throws ClassCastException if the instance is not `List<Object>`
     */
        public List<Object> get() throws ClassCastException {
        return (List<Object>)super.getActualInstance();
        }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }

}

