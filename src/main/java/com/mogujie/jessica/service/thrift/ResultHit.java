/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.mogujie.jessica.service.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultHit implements org.apache.thrift.TBase<ResultHit, ResultHit._Fields>, java.io.Serializable, Cloneable
{
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResultHit");

    private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.DOUBLE, (short) 1);
    private static final org.apache.thrift.protocol.TField FIELDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fields", org.apache.thrift.protocol.TType.MAP, (short) 2);
    private static final org.apache.thrift.protocol.TField DOC_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("docId", org.apache.thrift.protocol.TType.I32, (short) 3);

    public double score; // required
    public Map<String, String> fields; // required
    public int docId; // required

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum
    {
        SCORE((short) 1, "score"), FIELDS((short) 2, "fields"), DOC_ID((short) 3, "docId");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static
        {
            for (_Fields field : EnumSet.allOf(_Fields.class))
            {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId)
        {
            switch (fieldId)
            {
            case 1: // SCORE
                return SCORE;
            case 2: // FIELDS
                return FIELDS;
            case 3: // DOC_ID
                return DOC_ID;
            default:
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId)
        {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name)
        {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName)
        {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId()
        {
            return _thriftId;
        }

        public String getFieldName()
        {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __SCORE_ISSET_ID = 0;
    private static final int __DOCID_ISSET_ID = 1;
    private BitSet __isset_bit_vector = new BitSet(2);

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static
    {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.REQUIRED, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
        tmpMap.put(_Fields.FIELDS, new org.apache.thrift.meta_data.FieldMetaData("fields", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
        tmpMap.put(_Fields.DOC_ID, new org.apache.thrift.meta_data.FieldMetaData("docId", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultHit.class, metaDataMap);
    }

    public ResultHit()
    {
    }

    public ResultHit(double score)
    {
        this();
        this.score = score;
        setScoreIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ResultHit(ResultHit other)
    {
        __isset_bit_vector.clear();
        __isset_bit_vector.or(other.__isset_bit_vector);
        this.score = other.score;
        if (other.isSetFields())
        {
            Map<String, String> __this__fields = new HashMap<String, String>();
            for (Map.Entry<String, String> other_element : other.fields.entrySet())
            {

                String other_element_key = other_element.getKey();
                String other_element_value = other_element.getValue();

                String __this__fields_copy_key = other_element_key;

                String __this__fields_copy_value = other_element_value;

                __this__fields.put(__this__fields_copy_key, __this__fields_copy_value);
            }
            this.fields = __this__fields;
        }
        this.docId = other.docId;
    }

    public ResultHit deepCopy()
    {
        return new ResultHit(this);
    }

    @Override
    public void clear()
    {
        setScoreIsSet(false);
        this.score = 0.0;
        this.fields = null;
        setDocIdIsSet(false);
        this.docId = 0;
    }

    public double getScore()
    {
        return this.score;
    }

    public ResultHit setScore(double score)
    {
        this.score = score;
        setScoreIsSet(true);
        return this;
    }

    public void unsetScore()
    {
        __isset_bit_vector.clear(__SCORE_ISSET_ID);
    }

    /**
     * Returns true if field score is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetScore()
    {
        return __isset_bit_vector.get(__SCORE_ISSET_ID);
    }

    public void setScoreIsSet(boolean value)
    {
        __isset_bit_vector.set(__SCORE_ISSET_ID, value);
    }

    public int getFieldsSize()
    {
        return (this.fields == null) ? 0 : this.fields.size();
    }

    public void putToFields(String key, String val)
    {
        if (this.fields == null)
        {
            this.fields = new HashMap<String, String>();
        }
        this.fields.put(key, val);
    }

    public Map<String, String> getFields()
    {
        return this.fields;
    }

    public ResultHit setFields(Map<String, String> fields)
    {
        this.fields = fields;
        return this;
    }

    public void unsetFields()
    {
        this.fields = null;
    }

    /**
     * Returns true if field fields is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetFields()
    {
        return this.fields != null;
    }

    public void setFieldsIsSet(boolean value)
    {
        if (!value)
        {
            this.fields = null;
        }
    }

    public int getDocId()
    {
        return this.docId;
    }

    public ResultHit setDocId(int docId)
    {
        this.docId = docId;
        setDocIdIsSet(true);
        return this;
    }

    public void unsetDocId()
    {
        __isset_bit_vector.clear(__DOCID_ISSET_ID);
    }

    /**
     * Returns true if field docId is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetDocId()
    {
        return __isset_bit_vector.get(__DOCID_ISSET_ID);
    }

    public void setDocIdIsSet(boolean value)
    {
        __isset_bit_vector.set(__DOCID_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value)
    {
        switch (field)
        {
        case SCORE:
            if (value == null)
            {
                unsetScore();
            } else
            {
                setScore((Double) value);
            }
            break;

        case FIELDS:
            if (value == null)
            {
                unsetFields();
            } else
            {
                setFields((Map<String, String>) value);
            }
            break;

        case DOC_ID:
            if (value == null)
            {
                unsetDocId();
            } else
            {
                setDocId((Integer) value);
            }
            break;

        }
    }

    public Object getFieldValue(_Fields field)
    {
        switch (field)
        {
        case SCORE:
            return Double.valueOf(getScore());

        case FIELDS:
            return getFields();

        case DOC_ID:
            return Integer.valueOf(getDocId());

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    public boolean isSet(_Fields field)
    {
        if (field == null)
        {
            throw new IllegalArgumentException();
        }

        switch (field)
        {
        case SCORE:
            return isSetScore();
        case FIELDS:
            return isSetFields();
        case DOC_ID:
            return isSetDocId();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that)
    {
        if (that == null)
            return false;
        if (that instanceof ResultHit)
            return this.equals((ResultHit) that);
        return false;
    }

    public boolean equals(ResultHit that)
    {
        if (that == null)
            return false;

        boolean this_present_score = true;
        boolean that_present_score = true;
        if (this_present_score || that_present_score)
        {
            if (!(this_present_score && that_present_score))
                return false;
            if (this.score != that.score)
                return false;
        }

        boolean this_present_fields = true && this.isSetFields();
        boolean that_present_fields = true && that.isSetFields();
        if (this_present_fields || that_present_fields)
        {
            if (!(this_present_fields && that_present_fields))
                return false;
            if (!this.fields.equals(that.fields))
                return false;
        }

        boolean this_present_docId = true && this.isSetDocId();
        boolean that_present_docId = true && that.isSetDocId();
        if (this_present_docId || that_present_docId)
        {
            if (!(this_present_docId && that_present_docId))
                return false;
            if (this.docId != that.docId)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }

    public int compareTo(ResultHit other)
    {
        if (!getClass().equals(other.getClass()))
        {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        ResultHit typedOther = (ResultHit) other;

        lastComparison = Boolean.valueOf(isSetScore()).compareTo(typedOther.isSetScore());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetScore())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, typedOther.score);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetFields()).compareTo(typedOther.isSetFields());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetFields())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fields, typedOther.fields);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetDocId()).compareTo(typedOther.isSetDocId());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetDocId())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.docId, typedOther.docId);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId)
    {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException
    {
        org.apache.thrift.protocol.TField field;
        iprot.readStructBegin();
        while (true)
        {
            field = iprot.readFieldBegin();
            if (field.type == org.apache.thrift.protocol.TType.STOP)
            {
                break;
            }
            switch (field.id)
            {
            case 1: // SCORE
                if (field.type == org.apache.thrift.protocol.TType.DOUBLE)
                {
                    this.score = iprot.readDouble();
                    setScoreIsSet(true);
                } else
                {
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                }
                break;
            case 2: // FIELDS
                if (field.type == org.apache.thrift.protocol.TType.MAP)
                {
                    {
                        org.apache.thrift.protocol.TMap _map22 = iprot.readMapBegin();
                        this.fields = new HashMap<String, String>(2 * _map22.size);
                        for (int _i23 = 0; _i23 < _map22.size; ++_i23)
                        {
                            String _key24; // required
                            String _val25; // required
                            _key24 = iprot.readString();
                            _val25 = iprot.readString();
                            this.fields.put(_key24, _val25);
                        }
                        iprot.readMapEnd();
                    }
                } else
                {
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                }
                break;
            case 3: // DOC_ID
                if (field.type == org.apache.thrift.protocol.TType.I32)
                {
                    this.docId = iprot.readI32();
                    setDocIdIsSet(true);
                } else
                {
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                }
                break;
            default:
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked
        // in the validate method
        if (!isSetScore())
        {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'score' was not found in serialized data! Struct: " + toString());
        }
        validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException
    {
        validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldBegin(SCORE_FIELD_DESC);
        oprot.writeDouble(this.score);
        oprot.writeFieldEnd();
        if (this.fields != null)
        {
            if (isSetFields())
            {
                oprot.writeFieldBegin(FIELDS_FIELD_DESC);
                {
                    oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, this.fields.size()));
                    for (Map.Entry<String, String> _iter26 : this.fields.entrySet())
                    {
                        oprot.writeString(_iter26.getKey());
                        oprot.writeString(_iter26.getValue());
                    }
                    oprot.writeMapEnd();
                }
                oprot.writeFieldEnd();
            }
        }
        if (isSetDocId())
        {
            oprot.writeFieldBegin(DOC_ID_FIELD_DESC);
            oprot.writeI32(this.docId);
            oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("ResultHit(");
        boolean first = true;

        sb.append("score:");
        sb.append(this.score);
        first = false;
        if (isSetFields())
        {
            if (!first)
                sb.append(", ");
            sb.append("fields:");
            if (this.fields == null)
            {
                sb.append("null");
            } else
            {
                sb.append(this.fields);
            }
            first = false;
        }
        if (isSetDocId())
        {
            if (!first)
                sb.append(", ");
            sb.append("docId:");
            sb.append(this.docId);
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException
    {
        // check for required fields
        // alas, we cannot check 'score' because it's a primitive and you chose
        // the non-beans generator.
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        try
        {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te)
        {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException
    {
        try
        {
            // it doesn't seem like you should have to do this, but java
            // serialization is wacky, and doesn't call the default constructor.
            __isset_bit_vector = new BitSet(1);
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te)
        {
            throw new java.io.IOException(te);
        }
    }

}
